public class Drawing {
    /*
    int n;
    char symbol = '$';
    char[][] drawing = new char[n][n];

    Drawing(int n, char symbol) {
        this.n = n;
        this.symbol = symbol;
    }

    void displayD() {
        System.out.println("-------------");
        System.out.println();
        for (char[] s : drawing) {
            System.out.println(s);
        }
    }*/

    int n;
    char r;
    void drawTab(int n, char r){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}

