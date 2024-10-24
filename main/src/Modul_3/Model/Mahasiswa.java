package Model;

abstract class Mahasiswa extends User {

    private int NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String tTL, int telp, int nIM, String jurusan) {
        super(nama, alamat, tTL, telp);
        this.NIM = nIM;
        this.jurusan = jurusan;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}
