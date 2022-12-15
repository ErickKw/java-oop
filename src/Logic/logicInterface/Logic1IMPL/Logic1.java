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

    public void Soal3() {
        for (int i = 0; i < this.logic.n; i++) {
            if (i == 0)
                this.logic.arrayLogic1[i] = String.valueOf(0);
            else
                this.logic.arrayLogic1[i] = String.valueOf(Integer.parseInt(this.logic.arrayLogic1[i - 1]) + 2);
        }
    }

    public void Soal4() {
        for (int i = 0; i < this.logic.n; i++) {
            if (i <= 1)
                this.logic.arrayLogic1[i] = String.valueOf(1);
            else
                this.logic.arrayLogic1[i] = String
                        .valueOf(Integer.parseInt(this.logic.arrayLogic1[i - 1])
                                + Integer.parseInt(this.logic.arrayLogic1[i - 2]));
        }
    }

    public void Soal5() {
        for (int i = 0; i < this.logic.n; i++) {
            if (i <= 2) {

                this.logic.arrayLogic1[i] = String.valueOf(1);
            } else {
                this.logic.arrayLogic1[i] = String.valueOf(Integer.parseInt(this.logic.arrayLogic1[i - 1])
                        + Integer.parseInt(this.logic.arrayLogic1[i - 2])
                        + Integer.parseInt(this.logic.arrayLogic1[i - 3]));
            }

        }
    }

    public void Soal6() {
        int awal = 1;
        int akhir = 10;
        int bil, batas = 0;
        for (int i = awal; i <= akhir; i++) {
            bil = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bil = bil + 1;
                }
            }
            if (bil == 2) {
                this.logic.arrayLogic1[batas] = String.valueOf(i);
                if (batas == this.logic.n - 1)
                    break;
                else {
                    batas++;
                    akhir = (int) (Math.pow(akhir, i));
                }
            }
        }
    }

    public void Soal7() {
        char huruf = 'A';
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.arrayLogic1[i] = String.valueOf(huruf);
            huruf++;
        }
    }

    public void Soal8() {
        char huruf = 'A';
        int angka = 2;

        for (int i = 0; i < this.logic.n; i++) {
            if (i % 2 == 0) {
                this.logic.arrayLogic1[i] = String.valueOf(huruf);
                huruf += 2;
            } else {
                this.logic.arrayLogic1[i] = String.valueOf(angka);
                angka += 2;
            }
        }
    }

    public void Soal9() {
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.arrayLogic1[i] = String.valueOf((int) Math.pow(3, i));
        }
    }

    public void Soal10() {
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.arrayLogic1[i] = String.valueOf((int) (Math.pow(i, 3)));
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

    public void cetakArray3() {
        this.Soal3();
        this.logic.print();
    }

    public void cetakArray4() {
        this.Soal4();
        this.logic.print();
    }

    public void cetakArray5() {
        this.Soal5();
        this.logic.print();
    }

    public void cetakArray6() {
        this.Soal6();
        this.logic.print();
    }

    public void cetakArray7() {
        this.Soal7();
        this.logic.print();
    }

    public void cetakArray8() {
        this.Soal8();
        this.logic.print();
    }

    public void cetakArray9() {
        this.Soal9();
        this.logic.print();
    }

    public void cetakArray10() {
        this.Soal10();
        this.logic.print();
    }
}
