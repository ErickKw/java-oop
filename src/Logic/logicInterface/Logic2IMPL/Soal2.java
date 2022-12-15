package Logic.logicInterface.Logic2IMPL;

import Logic.BasicLogic;
import Logic.logicInterface.LogicInterface;

public class Soal2 implements LogicInterface {
    private final BasicLogic logic;

    public Soal2(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for (int i = 0; i < this.logic.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.logic.n; j++) {
                if (j == 0 || i == 0 || i == this.logic.n - 1 || j == this.logic.n - 1 ||
                        i == j || i + j == this.logic.n - 1) {
                    this.logic.arrayLogic2[i][j] = String.valueOf(angka);
                }
                angka += 2;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
