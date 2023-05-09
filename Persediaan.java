public class Persediaan {
    double persediaan;
    double derajatPersediaan;

    void setPersediaan(double persediaan) {
        this.persediaan = persediaan;
    }

    double getPersediaan() {
        return persediaan;
    }

    int titik1 = 0;
    int titik2 = 10;
    int titik3 = 60;

    double persediaanBanyak(double persediaan) {
        if (persediaan >= titik3) {
            derajatPersediaan = 1;
        } else if (persediaan >= titik2 && persediaan <= titik3) {
            derajatPersediaan = (persediaan-titik2)/(titik3-titik2);
        } else if (persediaan <= titik2) {
            derajatPersediaan = 0;
        }
        return derajatPersediaan;
    }

    double persediaanSedikit(double persediaan) {
        if (persediaan <= titik2) {
            derajatPersediaan = 1;
        } else if (persediaan >= titik2 && persediaan <= titik3){
            derajatPersediaan = (titik3-persediaan)/(titik3-titik2);
        } else if (persediaan >= titik3){
            derajatPersediaan = 0;
        }
        return derajatPersediaan;
    }
}
