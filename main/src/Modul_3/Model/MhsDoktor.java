package Model;

public class MhsDoktor extends Mahasiswa {

    private String judulPenelitianDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public MhsDoktor(String nama, String alamat, String tTL, String telp, String nIM, String jurusan,
            String judulPenelitianDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, tTL, telp, nIM, jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "MhsDoktor [judulPenelitianDisertasi=" + judulPenelitianDisertasi + ", nilaiSidang1="
                + nilaiSidang1
                + ", nilaiSidang2=" + nilaiSidang2 + ", nilaiSidang3=" + nilaiSidang3 + "]";
    }
}
