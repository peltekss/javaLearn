package j20_StaticKeyword.Tasks.Task02;

public class ElektrikHesabi {
    int toplamTuketim;
    double oran = 0.7;
    double fatura;


    public void tuketimEkle(int tuketim) {
        toplamTuketim += tuketim;

    }

    public double ödenecekTutar() {
        fatura = toplamTuketim * oran;
        return fatura;


    }

    public String toString() {
        return
                "toplamTuketim=" + toplamTuketim +
                        ", fatura=" + fatura;


    }
}