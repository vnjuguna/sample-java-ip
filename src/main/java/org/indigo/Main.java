package org.indigo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);
        do {
            System.out.println("Select Process - e-encode/d-decode!");
            String process = userInputObject.next();

            System.out.println("Enter Message!");
            String msg = userInputObject.next();

            System.out.println("Enter Key!");
            int key = userInputObject.nextInt();

            System.out.println("Processing...");
            //TO DO add logic for encoding
            //TO DO add logic for decoding

            System.out.println("Do You Want to quit or would you like to continue!");
            String nextStep = userInputObject.next();

            if (nextStep.startsWith("q")){
                break;
            }

        } while (true);
    }
}