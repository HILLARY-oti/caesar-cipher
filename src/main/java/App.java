
import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to Ceaser Cipher");
        System.out.println("");

        System.out.println("\tEnter 1 for Cipher\n");
        System.out.println("\tEnter 2 for Decipher\n");
        System.out.println("\tEnter 3 to exit\n");
        System.out.println("");
        System.out.println("Enter Operation to be executed:");
        String value = myConsole.readLine();


        Cipher ciphered = new Cipher();
        Decipher deciphered = new Decipher();

            if (value.equals("1")) {
                System.out.println("Enter Text to cipher");
                String input = myConsole.readLine();
                System.out.println("Enter Key");
                String userNumber = myConsole.readLine();
                int key = Integer.parseInt(userNumber);
                System.out.println("Your encrypted message: " + ciphered.encrypt(input, key));

            } else if (value.equals("2")) {
                System.out.println("Enter Text to decipher");
                String input = myConsole.readLine();
                System.out.println("Enter Key");
                String userNumber = myConsole.readLine();
                int key = Integer.parseInt(userNumber);
                System.out.println("Your encrypted message: " + deciphered.decrypt(input, key));
            } else {
                System.out.println("Exiting");
                System.exit(0);
            }

    }
}