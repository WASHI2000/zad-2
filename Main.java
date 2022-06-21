class OblicznieSredniejOcen {

    public static void main(String[] args) {
        
        double[] ocenyUczniow = {5, 3, 4};
        double suma = 0.0;
        int iloscOcenUczniow = ocenyUczniow.length;

        for (int i = 0; i < ocenyUczniow.length; i++) {
            suma += ocenyUczniow[i];
        }

        // dzielimy zsumowaną tablicę przez ilość ocen uczniów w tablicy
        double sredniaOcenUczniow = suma / iloscOcenUczniow;

        System.out.println(sredniaOcenUczniow); // 4.0
    }
}