package Model;

import java.util.List;

abstract public class Dosen extends Staff {

    private int departemen;
    private List<ListMKdiajar> matkulDiajar;
    private List<PresensiStaff> PresensiStaff;

    public Dosen(String nama, String alamat, String tTL, String telp, String nIK, int departemen,
            List<ListMKdiajar> matkulDiajar, List<Model.PresensiStaff> presensiStaff) {
        super(nama, alamat, tTL, telp, nIK);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
        PresensiStaff = presensiStaff;
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

    public List<PresensiStaff> getPresensiStaff() {
        return PresensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        PresensiStaff = presensiStaff;
    }

}
