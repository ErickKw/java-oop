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

    @Override
    public void cetakArray() {
        this.Soal1();
        this.logic.print();
    }
}
