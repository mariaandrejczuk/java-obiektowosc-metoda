public class Main {
    public static void main(String[] args) {
        char[] red = {'r', 'e', 'd'};
        char[] blue = {'b', 'l', 'u', 'e'};
        Radiator r1 = new Radiator(red, weight: 55, power: 1025);
        Radiator r2 = new Radiator(blue, weight: 120, power: 5105);
        Radiator r3 = new Radiator(red, weight: 15, power: 500);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for(Radiator r : radiators){
            System.out.println("Color: "+r.color);
            for(char c : r.color){
                System.out.println(c);
            }
            System.out.println();
            System.out.println("Weight: "+r.weight);
            System.out.println("Power: "+r.power);
        }
    }
}
