package Model;

import java.util.List;

public class MhsSarjana extends Mahasiswa {

    private List<ListMKdiambil> matkulDiambil;

    public MhsSarjana(String nama, String alamat, String tTL, String telp, String nIM, String jurusan,
            List<ListMKdiambil> matkulDiambil) {
        super(nama, alamat, tTL, telp, nIM, jurusan);
        this.matkulDiambil = matkulDiambil;
    }

    public List<ListMKdiambil> getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(List<ListMKdiambil> matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    @Override
    public String toString() {
        return super.toString() + "MhsSarjana [matkulDiambil=" + matkulDiambil + "]";
    }

}
