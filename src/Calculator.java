public class Calculator {
    int sum(int a, int b){
        return a+b;           //metoda. która przyjmuje elementy i zwraca elementy
    }
    int sum5Arguments(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    int sumArray (int[] values) {     //metoda sumująca elementy w tablicy
        int sum = 0;
        for(int v : values){
            sum+=v;
        }
        return sum;
    }
    double avg(int[] values){
        return sumArray(values)/values.length;
    }
}
