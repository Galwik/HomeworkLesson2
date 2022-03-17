import java.util.*;

public class TokenGenerator {
    public static List<Integer> allowedChars = new ArrayList<>();

    public static int askForNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] tokenLength = {5, 10, 15};
        int input;

        System.out.println("Enter the length of the token you want to generate (ONLY 5,10 or 15):");

        while (true) {
            try {
                input = scanner.nextInt();
                int finalInput = input;
                if (Arrays.stream(tokenLength).anyMatch(x -> finalInput == x)) {
                    break;
                } else {
                    System.err.println("Wrong number! Please try again!");
                }
            } catch (InputMismatchException ex) {
                System.err.println("Enter the correct number!");
                scanner.nextLine();
            }
        }
        return input;
    }

    public static void tokenGenerator(int size) {
        fillListWithInt(33, 33);
        fillListWithInt(35, 38);
        fillListWithInt(40, 42);
        fillListWithInt(48, 57);
        fillListWithInt(64, 90);
        fillListWithInt(94, 94);
        fillListWithInt(97, 122);

        StringBuilder end = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int randomInt = allowedChars.get(new Random().nextInt(allowedChars.size()));
            char randomChar = (char) randomInt;
            end.append(randomChar);
        }
        System.out.println("Your token: \n" + end);
    }

    public static void fillListWithInt(int start, int end) {

        for (int i = start; i <= end; i++) {
            allowedChars.add(i);
        }
    }
}