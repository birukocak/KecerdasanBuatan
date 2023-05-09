public class Permintaan {
    double permintaan;
    double derajatPermintaan;    

    void setPermintaan(double permintaan) {
        this.permintaan = permintaan;
    }

    double getPermintaan() {
        return permintaan;
    }

    int titik1 = 0;
    int titik2 = 100;
    int titik3 = 500;

    double permintaanNaik(double permintaan) {
        if (permintaan >= titik3) {
            derajatPermintaan = 1;
        } else if (permintaan >= titik2 && permintaan <= titik3) {
            derajatPermintaan = (permintaan-titik2)/(titik3-titik2);
        } else if (permintaan <= titik2) {
            derajatPermintaan = 0;
        }
        return derajatPermintaan;
    }

    double permintaanTurun(double permintaan){
        if (permintaan <= titik2){
            derajatPermintaan = 1;
        } else if (permintaan >= titik2 && permintaan <= titik3) {
            derajatPermintaan = (titik3-permintaan)/(titik3-titik2);
        } else if (permintaan >= titik3) {
            derajatPermintaan = 0;
        }
        return derajatPermintaan;
    }
}
