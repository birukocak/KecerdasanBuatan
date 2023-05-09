public class rules {
    double [] alphaPred = new double[4];
    double [] z = new double[4];
    double hasil;

    Persediaan sedia = new Persediaan();
    Permintaan minta = new Permintaan();
    Produksi prod = new Produksi();

    void hitungAlphaPred(double a,double b) {
        // hasil alpha predikat untuk Rule 1
        alphaPred[0] = Math.min(minta.permintaanTurun(a), sedia.persediaanBanyak(b));
        // hasil alpha predikat untuk Rule 2
        alphaPred[1] = Math.min(minta.permintaanTurun(a), sedia.persediaanSedikit(b));
        // hasil alpha predikat untuk Rule 3
        alphaPred[2] = Math.min(minta.permintaanNaik(a), sedia.persediaanBanyak(b));
        // hasil alpha predikat untuk Rule 4
        alphaPred[3] = Math.min(minta.permintaanNaik(a), sedia.persediaanSedikit(b));
    }

    void nilai_z() {
        z[0] = prod.nilaiProduksiBerkurang(alphaPred[0]);
        z[1] = prod.nilaiProduksiBerkurang(alphaPred[1]);
        z[2] = prod.nilaiProduksiBertambah(alphaPred[2]);
        z[3] = prod.nilaiProduksiBertambah(alphaPred[3]);
    }

    double defuzzifikasi() {
        nilai_z();
        double atas = 0,bawah = 0;
        for (int i=0; i<4; i++) {
            atas = atas + (alphaPred[i]*z[i]);
            bawah = bawah + alphaPred[i]; 
        }
        hasil = atas/bawah;
        System.out.println("atas = "+atas);
        System.out.println("bawah = "+bawah);
        System.out.println("alpha 0 = "+alphaPred[0]);
        System.out.println("alpha 1 = "+alphaPred[1]);
        System.out.println("alpha 2 = "+alphaPred[2]);
        System.out.println("alpha 3 = "+alphaPred[3]);
        System.out.println("z 0 = "+z[0]);
        System.out.println("z 1 = "+z[1]);
        System.out.println("z 2 = "+z[2]);
        System.out.println("z 3 = "+z[3]);
        return hasil;
    }
}
