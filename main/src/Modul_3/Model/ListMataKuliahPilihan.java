package Model;

class ListMataKuliahPilihan extends ListMataKuliah {

    private int minMhs;

    public ListMataKuliahPilihan(int kodeMK, int sks, String namaMK, int minMhs) {
        super(kodeMK, sks, namaMK);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

}