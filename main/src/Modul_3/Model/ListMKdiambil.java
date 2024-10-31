package Model;

import java.util.List;

public class ListMKdiambil extends ListMataKuliah {

    private ListMataKuliah listMK;
    private List<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public ListMKdiambil(String kodeMK, int sks, String namaMK, ListMataKuliah listMK, List<Presensi> presensi, int n1,
            int n2, int n3) {
        super(kodeMK, sks, namaMK);
        this.listMK = listMK;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ListMKdiambil(ListMataKuliah listMK, List<Presensi> presensi, int n1, int n2, int n3) {
        this.listMK = listMK;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ListMataKuliah getListMK() {
        return listMK;
    }

    public void setListMK(ListMataKuliah listMK) {
        this.listMK = listMK;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString() + "ListMKdiambil [listMK=" + listMK + ", presensi=" + presensi + ", n1=" + n1 + ", n2="
                + n2 + ", n3=" + n3
                + "]";
    }

    public double rataRata(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0;
    }

}
