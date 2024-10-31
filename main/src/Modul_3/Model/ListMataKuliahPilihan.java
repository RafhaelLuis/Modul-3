package Model;

public class ListMataKuliahPilihan extends ListMataKuliah {

    private int minMhs;

    public ListMataKuliahPilihan(String kodeMK, int sks, String namaMK, int minMhs) {
        super(kodeMK, sks, namaMK);
        this.minMhs = minMhs;
    }

    public ListMataKuliahPilihan(int minMhs) {
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Minimum Mahasiswa: " + minMhs;
    }

}