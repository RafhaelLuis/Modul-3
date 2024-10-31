package Main;

import java.util.ArrayList;
import java.util.List;

import Model.*;

public class Main {
        public static void main(String[] args) {

                System.out.println("\033c");

                ArrayList<Presensi> listPresensi1 = new ArrayList<>();
                Presensi presensi1 = new Presensi(2, Status.HADIR);
                Presensi presensi2 = new Presensi(31, Status.ALPHA);
                listPresensi1.add(presensi1);
                listPresensi1.add(presensi2);

                // Dummy MatkulAmbil Sarjana
                ListMataKuliah matkulWajib1_srj = new ListMataKuliah("101", 3, "Desain Web");
                ListMataKuliah matkulPil1 = new ListMataKuliahPilihan("501", 4, "AI", 10);

                ArrayList<ListMKdiambil> matkulSarjana = new ArrayList<>();
                ListMKdiambil matkulAmbilSarjana1 = new ListMKdiambil("101", 3, "Algoritma", matkulWajib1_srj,
                                listPresensi1, 90,
                                99, 80);

                matkulSarjana.add(matkulAmbilSarjana1);

                // Dummy Sarjana
                ArrayList<MhsSarjana> mahasiswaSarjana = new ArrayList<>();
                MhsSarjana mahasiswaSarjana1 = new MhsSarjana("Ndne", "Jl. Tamansari", "Bandung, 15 Desember 2005",
                                "088888888",
                                "1123017",
                                "DKV", matkulSarjana);
                mahasiswaSarjana.add(mahasiswaSarjana1);

                // Dummy MatkulAmbil Magister
                ArrayList<ListMKdiambil> matkulMagister = new ArrayList<>();
                ListMataKuliah matkul1_magis = new ListMataKuliah("301", 4, "Basdat");

                ListMKdiambil matkulAmbilMagister1 = new ListMKdiambil("301", 4, "Basdat", matkul1_magis, listPresensi1,
                                100, 80,
                                70);

                matkulMagister.add(matkulAmbilMagister1);

                // Dummy Magister
                ArrayList<MhsMagister> mahasiswaMagister = new ArrayList<>();
                MhsMagister mahasiswaMagister1 = new MhsMagister("Jowel", "Jl. Cilegon", "Bandung, 20 Desember 2020",
                                "0999999999", "1123001", "Informatika", matkulMagister, "Algo Bikin Pusing");
                mahasiswaMagister.add(mahasiswaMagister1);

                // Dummy Doktor
                ArrayList<MhsDoktor> mahasiswaDoktor = new ArrayList<>();
                MhsDoktor mahasiswaDoktor1 = new MhsDoktor("Alfonsioso", "KBP", "Cimahi, 01 Desember 2000", "07777777",
                                "1123009",
                                "Teknik Industri", "Cara Mengemudi di KBP", 90, 100, 50);

                mahasiswaDoktor.add(mahasiswaDoktor1);

                ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();
                PresensiStaff pSTaff1 = new PresensiStaff(12, Status.HADIR, 8);
                PresensiStaff pSTaff2 = new PresensiStaff(26, Status.ALPHA, 9);

                presensiStaffs.add(pSTaff1);
                presensiStaffs.add(pSTaff2);

                // Dummy Karyawan
                ArrayList<Karyawan> karyawan = new ArrayList<>();
                Karyawan karyawan1 = new Karyawan("Jojo", "Jl. Antapani", "Jakarta, 01 Januari 2000", "0111111111",
                                "2023008",
                                3000000, presensiStaffs);

                karyawan.add(karyawan1);

                // Dummy Matkul Diajar
                ArrayList<ListMKdiajar> matkulDiajars1 = new ArrayList<>();
                ArrayList<ListMKdiajar> matkulDiajars2 = new ArrayList<>();

                ListMKdiajar matkulDiajar1 = new ListMKdiajar("301", 4, "Basdat", matkul1_magis, presensiStaffs);
                ListMKdiajar matkulDiajar2 = new ListMKdiajar("501", 4, "AI", matkulPil1, presensiStaffs);
                matkulDiajars1.add(matkulDiajar1);
                matkulDiajars1.add(matkulDiajar2);

                ListMKdiajar matkulDiajar3 = new ListMKdiajar("101", 3, "Desain Wen", matkulWajib1_srj, presensiStaffs);
                matkulDiajars2.add(matkulDiajar3);

                // Dummy Dosen
                ArrayList<Dosen> dosens = new ArrayList<>();
                Dosen dosenTetap1 = new DosenTetap("Dr. Subaba", "Jl. Gatot ", "Bogor, 07 Januari 2010", "03333333",
                                "32023678912", 3, matkulDiajars2, presensiStaffs, 300000);
                Dosen dosenHonorer1 = new DosenTetap("Dr. Subaba", "Jl.  Subroto", "Bogor, 07 Januari 2010", "03333333",
                                "32023678912", 3, matkulDiajars2, presensiStaffs, 300000);
                dosens.add(dosenTetap1);
                dosens.add(dosenHonorer1);

                List<User> users = new ArrayList<>();
                users.add(mahasiswaSarjana1);
                users.add(mahasiswaMagister1);
                users.add(mahasiswaDoktor1);
                users.add(dosenTetap1);
                users.add(dosenHonorer1);

                for (Mahasiswa mhsSarjana : mahasiswaSarjana) {
                        String print = mhsSarjana.toString();
                        System.out.println(print);
                }
                for (Mahasiswa mhsMagister : mahasiswaMagister) {
                        String print = mhsMagister.toString();
                        System.out.println(print);
                }
                for (Mahasiswa mhsDoktor : mahasiswaDoktor) {
                        String print = mhsDoktor.toString();
                        System.out.println(print);
                }
                for (Staff karyawann : karyawan) {
                        String print = karyawann.toString();
                        System.out.println(print);
                }
                for (Staff dosenn : dosens) {
                        String print = dosenn.toString();
                        System.out.println(print);
                }
        }
}
