package day5;

import java.util.Scanner;

public class C04_FahrenheitToCelsius {
    public static void main(String[] args) {
        //Fahrenheit'i, Celsius'a çeviren kodu yazınız.
        //Formül: Celsius = (Fahrenheit - 32) / 1.8

        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();

        //System.out.println(fahrenheitToCelsius(fahrenheit));
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius);

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}
