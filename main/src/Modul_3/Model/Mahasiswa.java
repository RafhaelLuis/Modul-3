package Model;

abstract public class Mahasiswa extends User {

    private String NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String tTL, String telp, String nIM, String jurusan) {
        super(nama, alamat, tTL, telp);
        this.NIM = nIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}
