package Model;

public class ListMataKuliah {
    private String kodeMK;
    private int sks;
    private String namaMK;

    public ListMataKuliah(String kodeMK, int sks, String namaMK) {
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.namaMK = namaMK;
    }

    public ListMataKuliah() {
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    @Override
    public String toString() {
        return "ListMataKuliah [kodeMK=" + kodeMK + ", sks=" + sks + ", namaMK=" + namaMK + "]";
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }
}
