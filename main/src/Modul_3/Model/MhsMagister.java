package Model;

import java.util.List;

public class MhsMagister extends Mahasiswa {

    private List<ListMKdiambil> matkulDiambil;
    private String judulPenelitianTesis;

    public MhsMagister(String nama, String alamat, String tTL, String telp, String nIM, String jurusan,
            List<ListMKdiambil> matkulDiambil, String judulPenelitianTesis) {
        super(nama, alamat, tTL, telp, nIM, jurusan);
        this.matkulDiambil = matkulDiambil;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public List<ListMKdiambil> getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(List<ListMKdiambil> matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "MhsMagister [matkulDiambil=" + matkulDiambil + ", judulPenelitianTesis="
                + judulPenelitianTesis + "]";
    }

}
