import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Enter the length of the token you want to generate (ONLY 5,10 or 15):");

        while (true) {

            input = scanner.nextInt();

            if (input == 5 || input == 10 || input == 15) {
                break;
            } else {
                System.err.println("Wrong number! Please try again!");
            }
        }

        System.out.println("Your token:");
        System.out.println(tokenGenerator(input));

    }

    public static String tokenGenerator(int size) {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";

        StringBuilder end = new StringBuilder();

        for (int i = 0; i < size; i++) {
            end.append(s.charAt(new Random().nextInt(s.length())));

        }

        return end.toString();
    }


}
