package Model;

import java.util.List;

public class Karyawan extends Staff {

    private double salary;
    private List<PresensiStaff> PresensiStaff;

    public Karyawan(String nama, String alamat, String tTL, String telp, String nIK, double salary,
            List<PresensiStaff> presensiStaff) {
        super(nama, alamat, tTL, telp, nIK);
        this.salary = salary;
        PresensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return PresensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        PresensiStaff = presensiStaff;
    }
}
