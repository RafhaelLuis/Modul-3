package View;

import Controller.*;

import javax.swing.*;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void showMenu() {

        boolean running = true;

        String menu = "1. Print UserData\n" +
                "2. Print Nilai Akhir Mahasiswa\n" +
                "3. Print Rata-Rata Nilai Akhir\n" +
                "4. Print Jumlah Mahasiswa Tidak Lulus\n" +
                "5. Print Mata Kuliah Ambil Mahasiswa\n" +
                "6. Print Total Jam Mengajar Dosen\n" +
                "7. Print Gaji Staff\n" +
                "0. Exit\n" +
                "Pilih menu:";

        while (running) {
            String input = input(menu);

            if (input == null) {
                running = false;
                break;
            }

            int choice = -1;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                showError("Pilihan tidak valid!");
                continue;
            }

            switch (choice) {
                case 1:
                    printUserData();
                    break;
                case 2:
                    printNilaiAkhir();
                    break;
                case 3:
                    printRataRataNilaiAkhir();
                    break;
                case 4:
                    printJumlahTidakLulus();
                    break;
                case 5:
                    printMatkulDiambilMahasiswa();
                    break;
                case 6:
                    printTotalJamMengajar();
                    break;
                case 7:
                    printGaji();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    showError("Pilihan tidak valid!");
            }
        }
    }

    private String input(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void printUserData() {
        String nama = input("Masukkan Nama:");
        if (nama != null) {
            showMessage(controller.printData(nama));
        }
    }

    private void printNilaiAkhir() {
        String NIM = input("Masukkan NIM:");
        if (NIM != null) {
            String kodeMK = input("Masukkan Kode Mata Kuliah:");
            if (kodeMK != null) {
                showMessage(controller.printNA(NIM, kodeMK));
            }
        }
    }

    private void printRataRataNilaiAkhir() {
        String kodeMK = input("Masukkan Kode Mata Kuliah:");
        if (kodeMK != null) {
            showMessage(controller.printrataRataNA(kodeMK));
        }
    }

    private void printJumlahTidakLulus() {
        String kodeMK = input("Masukkan Kode Mata Kuliah:");
        if (kodeMK != null) {
            showMessage(controller.printJumlahTidakLulus(kodeMK));
        }
    }

    private void printMatkulDiambilMahasiswa() {
        String NIM = input("Masukkan NIM:");
        if (NIM != null) {
            showMessage(controller.printMatkulDiambilMhs(NIM));
        }
    }

    private void printTotalJamMengajar() {
        String NIK = input("Masukkan NIK Dosen:");
        if (NIK != null) {
            showMessage(controller.printJamDosen(NIK));
        }
    }

    private void printGaji() {
        String NIK = input("Masukkan NIK Staff:");
        if (NIK != null) {
            showMessage(controller.printGajiStaff(NIK));
        }
    }
}
