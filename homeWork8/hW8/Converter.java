package homeWork8.hW8;

import java.util.Scanner;

public class Converter {

    public static void  main(String[] arg){

        int choice;
        double amount;
        double dollar, euro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Options:");
        System.out.println("Enter 1: Dollar");
//        System.out.println("Enter 2: Euro");
        System.out.println("\nChoose your option: ");

        choice = sc.nextInt();

        System.out.println("Your number is: " + choice );

        System.out.println("Enter the amount you want to convert?");
        amount =sc.nextFloat();
        System.out.println("Your amount is: "+ amount);

//        euro = amount * 1.02;
//
//        System.out.println(amount + " Dollar = " + euro + "Euro" );

        dollar = amount / 1.02;

        System.out.println(amount + " Euro = " + dollar + "Dollar" );


    }
}
