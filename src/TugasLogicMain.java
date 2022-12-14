import Logic.Logic1;
import Logic.Logic2;
// import day2.Logic01S1;
// import day2.Logic02S9;

public class TugasLogicMain {
    public static void main(String[] args) {
        System.out.println("Logic 01");
        Logic1 logic1 = new Logic1(9);
        logic1.cetakSoal1();
        logic1.cetakSoal2();
        logic1.cetakSoal3();
        logic1.cetakSoal4();
        logic1.cetakSoal5();
        logic1.cetakSoal6();
        logic1.cetakSoal7();
        logic1.cetakSoal8();
        logic1.cetakSoal9();
        logic1.cetakSoal10();

        System.out.println(" Logic 02");
        Logic2 logic2 = new Logic2(9);
        logic2.cetakSoal1();

        // System.out.println("\n\nSample Logic 02 Soal 09");
        // Logic02S2 logic02Soal02 = new Logic02S2(9);
        // logic02Soal02.cetakArray();
    }
}