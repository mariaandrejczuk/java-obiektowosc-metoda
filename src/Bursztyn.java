public class Bursztyn {
    char[] timbre;
    double hardness;
    double density;
    double celsius;

    Bursztyn(char[] timbre, double hardness, double density, double celsius) {
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
    double higherDensity(double increase) {
        return density+=increase;   // ? - uzunełam zmienną increase u góry
    }
}

