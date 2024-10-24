package Model;

import java.util.List;

abstract class Dosen extends Staff {

    private int departemen;
    private List<ListMKdiajar> matkulDiajar;

    public Dosen(String nama, String alamat, String tTL, int telp, int nIK, int departemen,
            List<ListMKdiajar> matkulDiajar) {
        super(nama, alamat, tTL, telp, nIK);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
    }

    public int getDepartemen() {
        return departemen;
    }

    public void setDepartemen(int departemen) {
        this.departemen = departemen;
    }

    public List<ListMKdiajar> getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(List<ListMKdiajar> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

}
