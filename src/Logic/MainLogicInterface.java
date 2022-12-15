package Logic;

import Logic.logicInterface.LogicInterface;
import Logic.logicInterface.Logic1IMPL.Logic1;
// import Logic.logicInterface.Logic1IMPL.Logic1Soal2;

import Logic.logicInterface.Logic2IMPL.Logic2;

public class MainLogicInterface {
    public static void main(String[] args) {
        System.out.println("Logic 1");
        LogicInterface logic1 = new Logic1(new BasicLogic(9));
        logic1.cetakArray();
        logic1.cetakArray2();

        // LogicInterface logic1soal2 = new Logic1Soal2(new BasicLogic(9));
        // logic1soal2.cetakArray();

        System.out.println("");
        System.out.println("==========");
        System.out.println("Logic 2");
        LogicInterface Logic2 = new Logic2(new BasicLogic(9));
        Logic2.cetakArray();
        Logic2.cetakArray2();
    }
}
