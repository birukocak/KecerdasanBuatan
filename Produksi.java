public class Produksi {
    double produksi;
    double derajatProduksi;
    
    void setProduksi(double produksi) {
        this.produksi = produksi;
    }

    double getProduksi() {
        return produksi;
    }

    int titik1 = 0;
    int titik2 = 200;
    int titik3 = 700;

    double produksiBerkurang(double produksi) {
        if (produksi >= titik3) {
            derajatProduksi = 1;
        } else if (produksi >= titik2 && produksi <= titik3) {
            derajatProduksi = (produksi-titik2)/(titik3-titik2);
        } else if (produksi <= titik2) {
            derajatProduksi = 0;
        }
        return derajatProduksi;
    }

    double produksiBertambah(double produksi) {
        if (produksi <= titik2) {
            derajatProduksi = 0;
        } else if (produksi >= titik2 && produksi <= titik3) {
            derajatProduksi = (titik3-produksi)/(titik3-titik2);
        } else if (produksi >= titik3) {
            derajatProduksi = 1;
        }
        return derajatProduksi;
    }

    double nilaiProduksiBertambah(double derajatProduksi) {
        produksi = (derajatProduksi*(titik3-titik2)) - titik2;
        return produksi;
    }

    double nilaiProduksiBerkurang(double derajatProduksi) {
        produksi = titik3 - (derajatProduksi*(titik3-titik2));
        return produksi;
    }
}
