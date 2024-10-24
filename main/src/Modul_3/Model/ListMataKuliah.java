package Model;

public class ListMataKuliah {
    private int kodeMK;
    private int sks;
    private String namaMK;

    public ListMataKuliah(int kodeMK, int sks, String namaMK) {
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.namaMK = namaMK;
    }

    public int getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(int kodeMK) {
        this.kodeMK = kodeMK;
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
}
