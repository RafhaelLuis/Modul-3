package Model;

public class Presensi {

    private int tanggal;
    private int status;

    public Presensi(int tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
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

    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + status + "]";
    }

}