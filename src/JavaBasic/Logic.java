package JavaBasic;

public class Logic {
    public static void main(String[] args) {
        System.out.println("Soal 01");
        soal01(7);
        System.out.println("Soal 02");
        soal02(9);
    }

    public static void soal01(int n) {
        int[] deret = new int[n];
        for (int i = 0; i < deret.length; i++) {
            if (i == 0 || i == 1) {
                deret[i] = 1;
            } else {
                deret[i] = deret[i - 1] + deret[i - 2];
            }
            System.out.println(deret[i]);
        }
    }

    public static void soal02(int n) {
        // deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 1;

        // proses mengisi array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                deret[i][j] = angka;
                angka++;
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                System.out.print(deret[b][k] + "\t\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        System.out.println();

    }

}

