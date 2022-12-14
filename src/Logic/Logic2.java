package Logic;

public class Logic2 extends BasicLogic {
    public Logic2(int n) {
        super(n);
    }

    public void isiArray1() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    this.arrayLogic2[i][j] = String.valueOf(j + 1);
                else if (i == n - j - 1)
                    this.arrayLogic2[i][j] = String.valueOf(j + 1);
                else
                    this.arrayLogic2[i][j] = "";
            }
        }
    }

    public void cetakSoal1() {
        this.isiArray1();
        this.printLogic2();
    }
}