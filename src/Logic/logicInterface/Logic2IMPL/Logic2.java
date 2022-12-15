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
      for (int j = 0; j < this.Logic.n; j++) {
        if (j == 0)
          this.Logic.arrayLogic2[i][j] = String.valueOf(1);
        else if (i == 0 && j >= 1) {
          this.Logic.arrayLogic2[i][j] = String
              .valueOf(Integer.parseInt(this.Logic.arrayLogic2[i][j - 1]) + 2);
        } else if (j == this.Logic.n - 1 || i == this.Logic.n - 1) {
          this.Logic.arrayLogic2[i][j] = this.Logic.arrayLogic2[0][j];
        } else {
          this.Logic.arrayLogic2[i][j] = "";
        }
      }
    }
  }

  public void Soal3() {
    for (int i = 0; i < this.Logic.n; i++) {
      for (int j = 0; j < this.Logic.n; j++) {
        if (j == 0)
          this.Logic.arrayLogic2[i][j] = String.valueOf(0);
        else if (i == 0) {
          this.Logic.arrayLogic2[i][j] = String
              .valueOf(Integer.parseInt(this.Logic.arrayLogic2[i][j - 1]) + 2);
        } else if (i == j || i == this.Logic.n - j - 1 || i == this.Logic.n - 1 || j == this.Logic.n - 1) {
          this.Logic.arrayLogic2[i][j] = this.Logic.arrayLogic2[0][j];
        } else {
          this.Logic.arrayLogic2[i][j] = "";
        }
      }
    }
  }

  public void Soal4() {
    for (int i = 0; i < this.Logic.n; i++) {
      for (int j = 0; j < this.Logic.n; j++) {
        if (j <= 1 && i == 0) {
          this.Logic.arrayLogic2[i][j] = String.valueOf(1);
        } else if (i == 0) {
          this.Logic.arrayLogic2[i][j] = String.valueOf(
              Integer.parseInt(this.Logic.arrayLogic2[i][j - 1]) + Integer.parseInt(this.Logic.arrayLogic2[i][j - 2]));
        } else if (j == 0 || j == this.Logic.n / 2 || j == this.Logic.n - 1 || i == this.Logic.n / 2
            || i == this.Logic.n - 1) {
          this.Logic.arrayLogic2[i][j] = this.Logic.arrayLogic2[0][j];
        } else {
          this.Logic.arrayLogic2[i][j] = "";
        }
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

  @Override
  public void cetakArray3() {
    this.Soal3();
    this.Logic.printLogic2();
  }

  @Override
  public void cetakArray4() {
    this.Soal4();
    this.Logic.printLogic2();
  }
}
