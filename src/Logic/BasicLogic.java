package Logic;

public class BasicLogic {
    public int n;
    public String[][] arrayLogic2;
    public String[] arrayLogic1;

    public BasicLogic(int n) {
        this.n = n;
        this.arrayLogic1 = new String[n];
        this.arrayLogic2 = new String[n][n];
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(this.arrayLogic1[i] + "\t");
        }
        System.out.print("\n");
    }

    public void printLogic2() {
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayLogic2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("\n");
    }
}
