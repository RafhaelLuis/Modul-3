package Model;

abstract class User {

    private String nama;
    private String alamat;
    private String TTL;
    private int telp;

    public User(String nama, String alamat, String tTL, int telp) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = tTL;
        this.telp = telp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String tTL) {
        TTL = tTL;
    }

    public int getTelp() {
        return telp;
    }

    public void setTelp(int telp) {
        this.telp = telp;
    }

}
