import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        String strength = checkPasswordStrength(password);
        System.out.println("Password strength: " + strength);
        
        scanner.close();
    }

    public static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Weak: Password must be at least 8 characters long.";
        }
        
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
            return "Strong: Password meets all criteria.";
        } else {
            return "Weak: Password must include uppercase letters, lowercase letters, digits, and special characters.";
        }
    }
}
