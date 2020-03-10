import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) throws Exception {
        Scanner Sinput = new Scanner(System.in);
        System.out.println("Enter Password");
        String s = Sinput.nextLine();


        System.out.println(passwordIsOk(s));
    }

    public static boolean is_Valid_Password(String password) throws Exception {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean isSpecialChar = false;
        final int PASSWORD_LENGTH = 8;


        String SpecialChars = "{<>,.!@#$%^&*()_+| \\/~`}";
        char[] convertSpecialChars = SpecialChars.toCharArray();
        if (password.length() < PASSWORD_LENGTH) {
            throw new Exception("Password should be longer than than 8 characters");
        } else if (password.isEmpty()) {
            throw new Exception("Password should exists!");
        } else {
            char[] characters = password.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if (Character.isUpperCase(characters[i])) {
                    uppercase = true;
                }
                if (Character.isDigit(characters[i])) {
                    digit = true;
                }
                if (Character.isLowerCase(characters[i])) {
                    lowercase = true;
                }
                for (int j = 0; j < convertSpecialChars.length; j++) {
                    if (characters[i] == convertSpecialChars[j]) {
                        isSpecialChar = true;
                    }
                }
            }
            if (!uppercase) {
                throw new Exception("password should have at least one uppercase letter");
            }
            if (!lowercase) {
                throw new Exception("password should have at least one lowercase letter");
            }
            if (!digit) {
                throw new Exception("password should have at least one digit");
            }
            if (!isSpecialChar) {
                throw new Exception("password should have at least one special character");
            }
        }

        return true;
    }

    public static boolean passwordIsOk(String password) {
        boolean uppercase = true;
        boolean lowercase = true;
        boolean digit = true;
        boolean isSpecialChar = true;
        final int PASSWORD_LENGTH = 8;
        boolean p=true;


        String SpecialChars = "{<>,.!@#$%^&*()_+| \\/~`}";
        char[] convertSpecialChars = SpecialChars.toCharArray();
        if (password.isEmpty()) {
            char[] characters = password.toCharArray();
            for (int i = 0; i < characters.length; i++) {
                if (Character.isUpperCase(characters[i])) {
                    uppercase = false;
                }
                if (Character.isDigit(characters[i])) {
                    digit = false;
                }
                if (Character.isLowerCase(characters[i])) {
                    lowercase = true;
                }
                for (int j = 0; j < convertSpecialChars.length; j++) {
                    if (characters[i] == convertSpecialChars[j]) {
                        isSpecialChar = true;
                    }
                }

        }


        }
        System.out.println("Password is Okay");
        return p;
    }
}


