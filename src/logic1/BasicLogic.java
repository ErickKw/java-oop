package logic1;

public class BasicLogic {
    public int n;
    public String[][] array2D;
    public String[] arrayLogic1;

    public BasicLogic(int n) {
        this.n = n;
        this.arrayLogic1 = new String[n];
        this.array2D = new String[n][n];
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
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("\n");
    }
}
