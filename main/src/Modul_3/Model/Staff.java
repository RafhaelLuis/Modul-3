package Model;

abstract class Staff extends User {

    private int NIK;

    public Staff(String nama, String alamat, String tTL, int telp, int nIK) {
        super(nama, alamat, tTL, telp);
        NIK = nIK;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int nIK) {
        NIK = nIK;
    }
}
