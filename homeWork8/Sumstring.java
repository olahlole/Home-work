package homeWork8;

import java.util.Scanner;

public class Sumstring {
    public static void main(String[] arg) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первое слово");
       String word = scanner.nextLine();

       System.out.println("Введите второе слово");
       String secondWord = scanner.nextLine();

       System.out.println(word.substring(0, word.length()/2) + secondWord.substring(secondWord.length()/2));


        System.out.println( "Введите первое число");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();

        double sum = add(num1, num2);
        System.out.println(num1 + "+" + num2 + "=" + sum);

        double minus = subtract(num1, num2);
        System.out.println(num1 + "-" + num2 + "=" + minus);

        double multiplication = multiply(num1, num2);
        System.out.println(num1 + "*" + num2 + "=" + multiplication);

        double division = divide(num1,num2);
        System.out.println( num1 + "/" + num2 + " = " + division);
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

}
