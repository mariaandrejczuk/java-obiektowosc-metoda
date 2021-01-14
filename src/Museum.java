public class Museum {
    char[] timbre;
    double hardness;
    double density;
    double celsius;
    double increase = 0.02;

    Museum(char[] timbre, double hardness, double density, double celsius) {
        this.timbre = timbre;
        this.hardness = hardness;
        this.density = density;
        this.celsius = celsius;
    }

    //metoda drukująca temperaturę przeliczoną na F:
    void displayF() {
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Temperatura przeliczona na F: " + fahrenheit);
    }

    //metoda zwiększająca gęstość bursztynu o dowolną wartość, przekazaną do obiektu:
    double higherDensity() {
        return density + increase;
    }
}


