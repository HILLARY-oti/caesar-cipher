import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myConsole = new Scanner(System.in);
        System.out.println("Welcome to Ceaser Cipher");
        System.out.println("");

        System.out.println("\tEnter 1 for Cipher\n");
        System.out.println("\tEnter 2 for Decipher\n");
        System.out.println("\tEnter 3 to exit\n");
        System.out.println("");
        System.out.println("Enter Operation to be executed:");
        int value = myConsole.nextInt();


        Cipher ciphered = new Cipher();
        Decipher deciphered = new Decipher();

        if (value == 1) {
            System.out.println("Enter Text to cipher");
            String input = myConsole.next();
            System.out.println("Enter Key");
            int key = myConsole.nextInt();
            System.out.println("Your encrypted message:" + ciphered.encrypt(input, key));
        } else if (value == 2) {
            System.out.println("Enter Text to decipher");
            String input = myConsole.next();
            System.out.println("Enter Key");
            int key = myConsole.nextInt();
            System.out.println("Your encrypted message:" + deciphered.decrypt(input, key));
        } else {
            System.out.println("Exiting");
            System.exit(0);
        }

    }
}