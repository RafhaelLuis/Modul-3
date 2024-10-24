package Model;

import java.util.List;

public class DosenHonorer extends Dosen {

    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String tTL, String telp, String nIK, int departemen,
            List<ListMKdiajar> matkulDiajar, double honorPerSKS) {
        super(nama, alamat, tTL, telp, nIK, departemen, matkulDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHonor per SKS: " + honorPerSKS + "\n";
    }

}
