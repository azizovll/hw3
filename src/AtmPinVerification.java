import java.util.Scanner;

public class AtmPinVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPin = "1234";
        int maxAttempts = 3;

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter PIN: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(correctPin)) {
                System.out.println("Access granted!");

            } else {
                System.out.println("Incorrect PIN.");
                int attemptsLeft = maxAttempts - i;
                if (attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Card blocked.");
                }
            }
        }
    }
}