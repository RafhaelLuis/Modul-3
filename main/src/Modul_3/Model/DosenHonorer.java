package Model;

import java.util.List;

class DosenHonorer extends Dosen {

    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String tTL, int telp, int nIK, int departemen,
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

}
