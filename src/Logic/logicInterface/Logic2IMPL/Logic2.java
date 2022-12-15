package Logic.logicInterface.Logic2IMPL;

import Logic.BasicLogic;
import Logic.logicInterface.LogicInterface;

public class Logic2 implements LogicInterface {
    private final BasicLogic Logic;

    public Logic2(BasicLogic logic) {
        this.Logic = logic;
    }

    public void Soal1() {
        for (int i = 0; i < this.Logic.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.Logic.n; j++) {
                if (i == j || i + j == this.Logic.n - 1) {
                    this.Logic.arrayLogic2[i][j] = String.valueOf(angka);
                } else {
                    this.Logic.arrayLogic2[i][j] = "";
                }
                angka += 3;
            }
        }
    }

    public void Soal2() {
        for (int i = 0; i < this.Logic.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.Logic.n; j++) {
                if (j == 0 || i == 0 || i == this.Logic.n - 1 || j == this.Logic.n - 1 ||
                        i == j || i + j == this.Logic.n - 1) {
                    this.Logic.arrayLogic2[i][j] = String.valueOf(angka);
                }
                angka += 2;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.Soal1();
        this.Logic.printLogic2();
    }

    @Override
    public void cetakArray2() {
        this.Soal2();
        this.Logic.printLogic2();
    }
}
