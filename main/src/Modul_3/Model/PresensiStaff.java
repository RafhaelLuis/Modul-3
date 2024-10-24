package Model;

public class PresensiStaff {

    private int tanggal;
    private int status;
    private int jam;

    public PresensiStaff(int tanggal, int status, int jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff [tanggal=" + tanggal + ", status=" + status + ", jam=" + jam + "]";
    }

}