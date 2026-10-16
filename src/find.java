import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNum = 7;
        int maxAttempts = 5;
        boolean guessed = false;

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNum) {
                System.out.println("Correct!");
                System.out.println("You needed " + i + " attempts.");
                guessed = true;
                break;
            } else if (guess < secretNum) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessed) {
            System.out.println("Game over!");
            System.out.println("The secret number was " + secretNum + ".");
        }
    }
}