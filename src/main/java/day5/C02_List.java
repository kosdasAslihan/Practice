package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        /*

        - Bir List olusturunuz.
        - 1'den 15'e kadar sayilar ekleyiniz.
        - Devaminda, 10'dan buyuk olan elemanlari 2 katina cikarin.

        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30

         */

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        for (int sayi : list){

            if (sayi > 10){
                //set(index,value)
                //indexOf(sayi)
                list.set(list.indexOf(sayi),sayi*2);
            }
        }
        System.out.println(list);
    }
}
