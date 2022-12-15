package Logic.logicInterface.Logic1IMPL;

import Logic.BasicLogic;
import Logic.logicInterface.LogicInterface;

public class Logic1 implements LogicInterface {
    private final BasicLogic logic;

    public Logic1(BasicLogic logic) {
        this.logic = logic;
    }

    public void Soal1() {
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.arrayLogic1[i] = String.valueOf(i + 1);
        }
    }

    public void Soal2() {
        for (int i = 0; i < this.logic.n; i++) {
            if (i == 0)
                this.logic.arrayLogic1[i] = String.valueOf(1);
            else if (i == 1)
                this.logic.arrayLogic1[i] = String.valueOf(3);
            else if (i % 2 == 1)
                this.logic.arrayLogic1[i] = String.valueOf(Integer.parseInt(this.logic.arrayLogic1[i - 2]) + 3);
            else
                this.logic.arrayLogic1[i] = String.valueOf(Integer.parseInt(this.logic.arrayLogic1[i - 2]) + 1);
        }
    }

    public void cetakArray() {
        this.Soal1();
        this.logic.print();
    }

    public void cetakArray2() {
        this.Soal2();
        this.logic.print();
    }
}
