package JavaBasic;
public class TugasLogic1 {
    public static void main(String[] args) {
        System.out.println("Soal 01");
        soal01(9);

        System.out.println();
        System.out.println("Soal 02");
        soal02(9);

        System.out.println();
        System.out.println("Soal 03");
        soal03(9);

        System.out.println();
        System.out.println("Soal 04");
        soal04(9);

        System.out.println();
        System.out.println("Soal 05");
        soal05(9);

        System.out.println();
        System.out.println("Soal 06");
        soal06(25);

        System.out.println();
        System.out.println("Soal 07");
        soal07(9);

        System.out.println();
        System.out.println("Soal 08");
        soal08(9);

        System.out.println();
        System.out.println("Soal 09");
        soal09(9);

        System.out.println();
        System.out.println("Soal 10");
        soal10(9);
    }
    public static void soal01(int n) {
        int[] nilai01 = new int[n];
        for(int i=1; i<=9; i++){
            System.out.print(i +"\t");
        }
    }

    public static void soal02(int n){
        int[] nilai02 = new int[n];
        int n1 = 1;
        int n2 = 1;
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                nilai02[i] = n1;
                n1++;
                System.out.print(nilai02[i] + "\t");
            }
            else {
                nilai02[i] = n2 += 2;
                n2++;
                System.out.print(nilai02[i] + "\t");
            }
        }

    }

    public static void soal03(int n){
        int[] nilai03 = new int[n];
        int nilaiAngka = 0;

        for (int a = 0; a < n; a++) {
            nilai03[a] = nilaiAngka;
            nilaiAngka += 2;
            System.out.print(nilai03[a] + "\t");
        }

    }

    public static void soal04(int n){
        int[] nilai04 = new int[n];
        for (int i = 0; i < nilai04.length; i++) {
            if (i == 0 || i == 1) {
                nilai04[i] = 1;
            } else {
                nilai04[i] = nilai04[i - 1] + nilai04[i - 2];
            }
            System.out.print(nilai04[i] +"\t");
        }

    }

    public static void soal05(int n){
        int[] nilai05 = new int[n];

        for (int i = 0; i < nilai05.length; i++) {
            if(i == 0 || i == 1 || i == 2){
                nilai05[i] = 1;
            } else {
                nilai05[i] = nilai05[i - 1] + nilai05[i - 2] + nilai05[i - 3];
            }
            System.out.print(nilai05[i] + "\t");
        }
    }

    public static void soal06(int n){
        int[] nilai06 = new int[n];
        int tampungN = 0;

        for(int i = 0; i <= nilai06.length; i++){
            tampungN = 0;
            for (int j = 1; j <= i; j++){
                if(i % j == 0){
                    tampungN += 1;
                }
            } if (tampungN == 2){
                System.out.print(i+ "\t");
            }
        }
    }

    public static  void soal07(int n) {
        char[] arr = new char[n];
        int j = 0;
        for (char i = 'A'; i <= 'I'; i++) {
            arr[j] = i;
            j++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

    public static void soal08(int n) {
        String[] nilai08 = new String[n];
        char huruf = 'A';
        int angka = 2;
        for(int i =  0; i < n; i++){
           if(i % 2 == 0){
               nilai08[i] = String.valueOf(huruf);
           } else {
               nilai08[i] = String.valueOf(angka);
               angka+=2;
           }
           huruf++;
        }
        PrintArray.print(nilai08);
    }
    public static void soal09(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(3,i);
        }

        // print array
        PrintArray.print(deret);
    }

    public static void soal10(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(i,3);
        }

        // print array
        PrintArray.print(deret);
    }

}
