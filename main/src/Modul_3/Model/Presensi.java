package Model;

public class Presensi {

    private int tanggal;
    private Status status;

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

    public Presensi(int tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Status isHadir() {
        return this.status = Status.HADIR;
    }

    @Override
    public String toString() {
        return "Presensi [tanggal=" + tanggal + ", status=" + status + "]";
    }

}