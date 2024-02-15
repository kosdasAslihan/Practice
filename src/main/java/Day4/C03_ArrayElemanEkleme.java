package Day4;

import java.util.Arrays;

public class C03_ArrayElemanEkleme {
    public static void main(String[] args) {
        /*

        Belirtilen bir array'e, istenen elemanı ekleyin

        int[] arr = { 1, 4, 23, 12}

        Istenen eleman: 7

        */

        int[] arr = {1, 4, 23, 12};

        int sayi = 7;

        int[] arr1 = new int[arr.length+1];

        for (int i = 0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1)); //[1, 4, 23, 12, 0]

        arr1[arr1.length-1] = sayi;

        System.out.println(Arrays.toString(arr1)); //[1, 4, 23, 12, 7]

        arr = arr1;
        System.out.println(Arrays.toString(arr)); //[1, 4, 23, 12, 7]


    }
}
