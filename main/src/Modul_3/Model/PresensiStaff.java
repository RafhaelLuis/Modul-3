package Model;

public class PresensiStaff {

    private int tanggal;
    private Status status;
    private int jam;

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public PresensiStaff(int tanggal, Status status, int jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff [tanggal=" + tanggal + ", status=" + status + ", jam=" + jam + "]";
    }

}