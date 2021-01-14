public class Main {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println("-------- Zadanie 1 -------");
        char[] red = {'r', 'e', 'd'};
        char[] blue = {'b', 'l', 'u', 'e'};
        Radiator r1 = new Radiator(red,  55, 1025);
        Radiator r2 = new Radiator(blue,  120,  5105);
        Radiator r3 = new Radiator(red,  15,  500);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for(Radiator r : radiators){
            r.display();
        }
        radiators[1].weight = 119;
        radiators[1].display();

        //zadanie 2
        System.out.println("-------- Zadanie 2 -------");

        //wyświetl w kWh
        double powerInKwh = radiators[1].powerInKwh();
        //System.out.println("Power kWh: "+powerInKwh+"kWh");
        if(powerInKwh >= 5){
            System.out.println("High-power radiator.");
        } else {
            System.out.println("Low-power radiator.");
        }
        System.out.println();

        //zadanie 3
        System.out.println("-------- Zadanie 3 - Calculator-------");
        Calculator c = new Calculator();

        int sum = c.sum(4, 5);
        System.out.println("4 + 5 = "+sum);

        sum = c.sum(100, 54);
        System.out.println("100 + 54 = "+sum);
        System.out.println("100 + 54 = "+c.sum(100, 54) );
        System.out.println("5+1+5+1+5 = "+c.sum5Arguments(5,1,5,1,5) );

    }
}
