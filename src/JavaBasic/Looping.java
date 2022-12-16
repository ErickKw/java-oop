public class Looping {
    public static void main(String[] args) {
        sample02(11);

        System.out.println();

        sample03(9);
    }

    public static void sample01(int n){
        for (int i=0; i <= n; i++){
            System.out.println(i);
        }
    }

    public static void sample02(int n){
        for (int i=0; i <= n; i++){
            if(i % 2 == 0){
                System.out.print("Fizz\t");
            }else {
                System.out.print(i + "\t");
            }
        }
    }

    public static void sample03(int n){
        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++){
                System.out.print("["+i+","+j+"]\t");
            }
            System.out.println("\n");
        }
    }
}

