package org.indigo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);
        do {
            System.out.println("Select Process - e-encode/d-decode!");
            String process = userInputObject.nextLine();

            System.out.println("Enter Message!");
            String msg = userInputObject.nextLine();

            System.out.println("Enter Key!");
            int key = userInputObject.nextInt();

            System.out.println("Processing...");
            System.out.println(process);

            if (process.toLowerCase().startsWith("e")){
                String output = CipherEncoding.encode(msg, key);
                System.out.println(output);

            } else if (process.startsWith("d")){
                System.out.println("decoding");
            } else {
                System.out.println("invalid process");
                continue;
            }
            //TO DO add logic for decoding

            System.out.println("Type q to quit or c to continue!");
            String nextStep = userInputObject.next();

            if (nextStep.startsWith("q")){
                break;
            }

            } while (true);
    }
}