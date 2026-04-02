import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Enter your name :");
        name = scanner.nextLine();


        String password;
        System.out.print("Enter a password (min 8 chars, 1 number, 1 uppercase, 1 symbol): ");
        password = scanner.nextLine();

        int lengthPassword = password.length();
        int numberDetect = 0;
        int bigLetterDetect = 0;
        int specialCharacterDetect = 0;

        for (int i = 0; i < lengthPassword; i++) {
            char passwordCharacter = password.charAt(i);

            if (Character.isDigit(passwordCharacter)) {
                numberDetect++;
            }

            if (Character.isUpperCase(passwordCharacter)) {
                bigLetterDetect++;
            }

            if (!Character.isLetterOrDigit(passwordCharacter)) {
                specialCharacterDetect++;
            }



        }

        // Validation
        String passwordSimilarCheck= password.toLowerCase();
        if (passwordSimilarCheck.contains(name.toLowerCase())){
            System.out.println("Password match with name !! try back");
            return;
        }
        if (lengthPassword < 8) {
            System.out.println("❌ Password too short");
        } else if (numberDetect == 0) {
            System.out.println("❌ Password must contain a number");
        } else if (bigLetterDetect == 0) {
            System.out.println("❌ Password must contain an uppercase letter");
        } else if (specialCharacterDetect == 0) {
            System.out.println("❌ Password must contain a special character");
        } else {
            System.out.println("✅ Strong password!");
        }

        scanner.close();
    }
}
