package org.indigo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

            System.out.println("Select Process enter e for encode/d-decode!");
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
                String output = CipherDecoding.decode(msg, key);
                System.out.println(output);
            } else {
                System.out.println("invalid process");

            }




    }
}