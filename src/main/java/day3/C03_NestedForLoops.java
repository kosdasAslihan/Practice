package day3;

public class C03_NestedForLoops {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int sayi = 5;
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2.yol
        /*for (int i = 1; i < sayi + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //1.yol
        for(int i = sayi-1; i>0;i--){
            for(int j =0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2.yol
        /*for (int m = 0; m < 4; m++) {
            for (int n = 4; n > m; n--){
                System.out.println("* ");
            }
            System.out.println();
        }*/
    }
}
