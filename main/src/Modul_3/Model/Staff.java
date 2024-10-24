package Model;

abstract public class Staff extends User {

    private String NIK;

    public Staff(String nama, String alamat, String tTL, String telp, String nIK) {
        super(nama, alamat, tTL, telp);
        NIK = nIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    public String toString() {
        return super.toString() + "\n" +
                "NIK: " + NIK;
    }
}
