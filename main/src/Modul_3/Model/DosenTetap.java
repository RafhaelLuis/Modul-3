package Model;

import java.util.List;

public class DosenTetap extends Dosen {

    private double salary;

    public DosenTetap(String nama, String alamat, String tTL, String telp, String nIK, int departemen,
            List<ListMKdiajar> matkulDiajar, List<Model.PresensiStaff> presensiStaff, double salary) {
        super(nama, alamat, tTL, telp, nIK, departemen, matkulDiajar, presensiStaff);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalary: " + salary + "\n";
    }

}
