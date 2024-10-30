package Model;

abstract public class User {

    private String nama;
    private String alamat;
    private String TTL;
    private String telp;

    public User(String nama, String alamat, String tTL, String telp) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = tTL;
        this.telp = telp;
    }

    public User() {
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

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    @Override
    public String toString() {
        return "User [nama=" + nama + ", alamat=" + alamat + ", TTL=" + TTL + ", telp=" + telp + "]";
    }

}
