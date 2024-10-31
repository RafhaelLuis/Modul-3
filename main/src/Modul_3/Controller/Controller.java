package Controller;

import java.util.List;
import Model.*;

public class Controller {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String printData(String nama) {
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                return "Nama : " + user.getNama()
                        + "\nStatus : " + user.getClass().getSimpleName()
                        + "\nAlamat : " + user.getAlamat()
                        + "\nTempat, Tanggal lahir : " + user.getTTL()
                        + "\nTempat, Tanggal lahir : " + user.getTelp();
            }
        }
        return "Data Tidak ditemukan";
    }

    public double printNA(String NIM, int kodeMK) {

        double NA = 0;

        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equals(NIM)) {

                    if (mahasiswa instanceof MhsSarjana) {
                        MhsSarjana mhsSarjana = (MhsSarjana) mahasiswa;

                        for (ListMKdiambil matkulDiambil : mhsSarjana.getMatkulDiambil()) {

                            if (matkulDiambil.getKodeMK() == kodeMK) {
                                NA = matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                        matkulDiambil.getN3());
                                return NA;
                            }

                        }

                    } else if (mahasiswa instanceof MhsMagister) {
                        MhsMagister mhsMagister = (MhsMagister) mahasiswa;

                        for (ListMKdiambil matkulDiambil : mhsMagister.getMatkulDiambil()) {

                            if (matkulDiambil.getKodeMK() == kodeMK) {
                                NA = matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                        matkulDiambil.getN3());
                                return NA;
                            }

                        }
                    } else {
                        MhsDoktor mhsDoktor = (MhsDoktor) mahasiswa;

                        NA = (mhsDoktor.getNilaiSidang1() + mhsDoktor.getNilaiSidang2() + mhsDoktor.getNilaiSidang3())
                                / 3.0;
                        return NA;

                    }
                }
                return -1;
            }
        }
        return -1;
    }

    public double rataRataNA(int kodeMK) {

        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        for (User user : users) {
            Mahasiswa mahasiswa = (Mahasiswa) user;

            if (mahasiswa instanceof MhsSarjana) {
                MhsSarjana mahasiswaSarjana = (MhsSarjana) mahasiswa;

                for (ListMKdiambil matkulDiambil : mahasiswaSarjana.getMatkulDiambil()) {

                    if (matkulDiambil.getKodeMK() == kodeMK) {
                        totalNilai += matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                matkulDiambil.getN3());
                        jumlahMahasiswa++;
                    }

                }

            } else if (mahasiswa instanceof MhsMagister) {
                MhsMagister mahasiswaMagister = (MhsMagister) mahasiswa;

                for (ListMKdiambil matkulDiambil : mahasiswaMagister.getMatkulDiambil()) {

                    if (matkulDiambil.getKodeMK() == kodeMK) {
                        totalNilai += matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                matkulDiambil.getN3());
                        jumlahMahasiswa++;
                    }

                }

            } else if (mahasiswa instanceof MhsDoktor) {
                MhsDoktor mahasiswaDoktor = (MhsDoktor) mahasiswa;

                totalNilai += (mahasiswaDoktor.getNilaiSidang1() + mahasiswaDoktor.getNilaiSidang2()
                        + mahasiswaDoktor.getNilaiSidang3()) / 3.0;
                jumlahMahasiswa++;
            }

        }

        if (jumlahMahasiswa == 0) {
            return 0;

        } else {
            return totalNilai / jumlahMahasiswa;
        }
    }

    public String printJumlahTidakLulus(int kodeMK) {

        int jumlahTidakLulus = 0;
        int jumlahMahasiswa = 0;
        double NA = 0;
        String namaMK = "";

        for (User user : users) {

            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof MhsSarjana) {
                    MhsSarjana mahasiswaSarjana = (MhsSarjana) mahasiswa;

                    for (ListMKdiambil matkulDiambil : mahasiswaSarjana.getMatkulDiambil()) {

                        if (matkulDiambil.getKodeMK() == kodeMK) {
                            namaMK = matkulDiambil.getNamaMK();
                            NA = matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                    matkulDiambil.getN3());

                            if (NA < 56) {
                                jumlahTidakLulus++;
                            }
                            jumlahMahasiswa++;

                        }

                    }
                } else if (mahasiswa instanceof MhsMagister) {
                    MhsMagister mahasiswaMagister = (MhsMagister) mahasiswa;

                    for (ListMKdiambil matkulDiambil : mahasiswaMagister.getMatkulDiambil()) {

                        if (matkulDiambil.getKodeMK() == kodeMK) {
                            namaMK = matkulDiambil.getNamaMK();
                            NA = matkulDiambil.rataRata(matkulDiambil.getN1(), matkulDiambil.getN2(),
                                    matkulDiambil.getN3());

                            if (NA < 56) {
                                jumlahTidakLulus++;
                            }
                            jumlahMahasiswa++;

                        }

                    }
                } else if (mahasiswa instanceof MhsDoktor) {
                    MhsDoktor mahasiswaDoktor = (MhsDoktor) mahasiswa;

                    namaMK = "Sidang";
                    NA = (mahasiswaDoktor.getNilaiSidang1() + mahasiswaDoktor.getNilaiSidang2()
                            + mahasiswaDoktor.getNilaiSidang3()) / 3.0;

                    if (NA < 56) {
                        jumlahTidakLulus++;
                    }
                    jumlahMahasiswa++;

                }
            }
        }
        return "<" + jumlahTidakLulus + "> dari <" + jumlahMahasiswa + "> mahasiswa tidak lulus matakuliah " + namaMK;
    }

    public String printMatkulDiambilMhs(String NIM) {

        String MK = "MataKuliah yang diambil ";

        for (User user : users) {

            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof MhsSarjana) {
                    MhsSarjana mahasiswaSarjana = (MhsSarjana) mahasiswa;

                    for (ListMKdiambil matkulDiambil : mahasiswaSarjana.getMatkulDiambil()) {
                        MK += matkulDiambil.getNamaMK() + " dan total presensinya " + matkulDiambil.getPresensi().size()
                                + "\n";
                        return MK;
                    }
                } else if (mahasiswa instanceof MhsMagister) {
                    MhsMagister mahasiswaMagister = (MhsMagister) mahasiswa;

                    for (ListMKdiambil matkulDiambil : mahasiswaMagister.getMatkulDiambil()) {
                        MK += matkulDiambil.getNamaMK() + " dan total presensinya " + matkulDiambil.getPresensi().size()
                                + "\n";
                        return MK;
                    }
                }
            }
        }

        return "Mahasiswa tidak ditemukan";

    }

    public String printJamDosen(String NIK) {

        int jamAjar = 0;

        for (User user : users) {

            if (user instanceof Staff) {
                Staff staff = (Staff) user;

                if (staff instanceof Dosen) {
                    Dosen dosen = (Dosen) staff;

                    if (dosen instanceof DosenTetap) {
                        DosenTetap dosenTetap = (DosenTetap) dosen;

                        for (ListMKdiajar matkulDiajar : dosenTetap.getMatkulDiajar()) {
                            for (PresensiStaff presensiStaff : dosenTetap.getPresensiStaff()) {
                                if (presensiStaff.getStatus() == Status.HADIR) {
                                    jamAjar += matkulDiajar.getSks();
                                }
                            }
                        }
                        return "Total jam yang diajar" + jamAjar;

                    } else if (dosen instanceof DosenHonorer) {
                        DosenHonorer DosenHonorer = (DosenHonorer) dosen;

                        for (ListMKdiajar matkulDiajar : DosenHonorer.getMatkulDiajar()) {
                            for (PresensiStaff presensiStaff : DosenHonorer.getPresensiStaff()) {
                                if (presensiStaff.getStatus() == Status.HADIR) {
                                    jamAjar += matkulDiajar.getSks();
                                }
                            }
                        }
                        return "Total jam yang diajar" + jamAjar;
                    }
                }
            }
        }

        return "Dosen tidak ditemukan";

    }

    public String printGajiStaff(String NIK) {
        
        double gajiStaff = 0;

        for (User user : users) {
            if (user instanceof Staff) {
                Staff staff = (Staff) user;

                if (staff instanceof ) {
                    
                }
            }
        }

    }

}
