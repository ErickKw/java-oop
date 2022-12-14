package day2;

public class Logic01S1 extends BasicLogic{
    public Logic01S1(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(angka);
            angka = angka+1;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }

}
