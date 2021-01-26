public class Main {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("-------- Zadanie 1 -------");
        char[] red = {'r', 'e', 'd'};
        char[] blue = {'b', 'l', 'u', 'e'};
        Radiator r1 = new Radiator(red, 55, 1025);
        Radiator r2 = new Radiator(blue, 120, 5105);
        Radiator r3 = new Radiator(red, 15, 500);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for (Radiator r : radiators) {
            r.display();
        }
        radiators[1].weight = 119;
        radiators[1].display();

        //zadanie 2
        System.out.println("-------- Zadanie 2 -------");

        //wyświetl w kWh
        double powerInKwh = radiators[1].powerInKwh();
        //System.out.println("Power kWh: "+powerInKwh+"kWh");
        if (powerInKwh >= 5) {
            System.out.println("High-power radiator.");
        } else {
            System.out.println("Low-power radiator.");
        }
        System.out.println();

        //zadanie 3
        System.out.println("-------- Zadanie 3 - Calculator-------");
        Calculator c = new Calculator();

        int sum = c.sum(4, 5);
        System.out.println("4 + 5 = " + sum);

        sum = c.sum(100, 54);
        System.out.println("100 + 54 = " + sum);
        System.out.println("100 + 54 = " + c.sum(100, 54));
        System.out.println("5+1+5+1+5 = " + c.sum5Arguments(5, 1, 5, 1, 5));
        System.out.println();

        //zadanie 4
        System.out.println("-------- Zadanie 4 - Calculator-------");
        int[] values = {2, 5, 234, 234, 2, 41, 23, 12, 31};
        sum = c.sumArray(values);
        System.out.println("Wynik dodawania elementów tablicy [2,5,234,234,2,41,23,12,31] = " + sum);

        int[] values2 = {1, 1};
        sum = c.sumArray(values2);
        System.out.println("Wynik dodawania elementów tablicy [1,1] = " + sum);

        System.out.println("Srednia tablicy [2,5,234,234,2,41,12,31] = "+c.avg(values));
        System.out.println("Srednia tablicy [1,1] = "+c.avg(values2));
        System.out.println();

        //zadanie 6
        System.out.println("-------- Zadanie 6 --------");
        Drawing drawing = new Drawing();
        drawing.drawTab(9, '$');

        //zadanie 5
        System.out.println();
        System.out.println("-------- Zadanie 5 --------");

        //przechowanie informacji o zbiorach:
        char[] yellow = {'y', 'e', 'l', 'l', 'o', 'w'};
        char[] orange = {'o', 'r', 'a', 'n', 'g', 'e'};
        char[] black = {'b', 'l', 'a', 'c', 'k'};

        Bursztyn b1 = new Bursztyn(yellow, 2.0, 1.05, 287);
        Bursztyn b2 = new Bursztyn(orange, 2.3, 1.06, 290);
        Bursztyn b3 = new Bursztyn(black, 2.5, 1.07, 300);

        Bursztyn[] bursztyn = new Bursztyn[3];

        bursztyn[0] = b1;
        bursztyn[1] = b2;
        bursztyn[2] = b3;

        //wyświetlenie temp. w Fahrenheit:
        bursztyn[1].displayF();

        //wyświetlenie zwiększonej gęstości:
        double higherDensity = bursztyn[1].higherDensity(0.02);
        System.out.println("Zwiększona gęstość wybranego bursztynu: " + higherDensity);
    }
}
