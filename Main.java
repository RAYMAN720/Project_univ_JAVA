import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        int numberLive = 5;
        boolean start = true;
        String name = "";
        int min = 0;
        int max = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        while (start) {
            System.out.println("Welcome " + name + ". You have " + numberLive + " lives left.");

            int guessed = (int) (Math.random() * (max - min + 1)) + min;

            int guessedChoice = -1;

            while (guessedChoice < min || guessedChoice > max) {
                System.out.print("Guess a number in range 0 to 5: ");
                guessedChoice = scanner.nextInt();

                if (guessedChoice < min || guessedChoice > max) {
                    System.out.println("Enter a valid number in range 0-5.");
                }
            }

            if (guessedChoice == guessed) {
                System.out.println("Congratulations, you guessed right!!");
                score += 1;
            } else {
                numberLive -= 1;
                System.out.println("You missed it. The number was " + guessed + ". Lives left: " + numberLive);
            }

            if (numberLive == 0) {
                start = false;
            }
        }

        System.out.println("Game over, " + name + "!");
        System.out.println("Your final score is: " + score);

        scanner.close();
    }
}
