package Model;

import java.util.List;;

public class ListMKdiajar extends ListMataKuliah {

    private ListMataKuliah listMK;
    private List<PresensiStaff> presensiStaff;

    public ListMKdiajar(String kodeMK, int sks, String namaMK, ListMataKuliah listMK,
            List<PresensiStaff> presensiStaff) {
        super(kodeMK, sks, namaMK);
        this.listMK = listMK;
        this.presensiStaff = presensiStaff;
    }

    public ListMKdiajar(ListMataKuliah listMK, List<PresensiStaff> presensiStaff) {
        this.listMK = listMK;
        this.presensiStaff = presensiStaff;
    }

    public ListMataKuliah getListMK() {
        return listMK;
    }

    public void setListMK(ListMataKuliah listMK) {
        this.listMK = listMK;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "ListMKdiajar [listMK=" + listMK + ", presensiStaff=" + presensiStaff + "]";
    }

}
