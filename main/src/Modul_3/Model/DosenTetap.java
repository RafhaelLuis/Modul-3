package Model;

import java.util.List;

class DosenTetap extends Dosen {

    private double salary;

    public DosenTetap(String nama, String alamat, String tTL, int telp, int nIK, int departemen,
            List<ListMKdiajar> matkulDiajar, double salary) {
        super(nama, alamat, tTL, telp, nIK, departemen, matkulDiajar);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
