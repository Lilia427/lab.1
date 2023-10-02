package task3;
import java.util.Scanner;

public class Task3 {

    public static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex > 0 && dotIndex > atIndex) {
            if (dotIndex < email.length() - 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        if (validateEmail(email)) {
            System.out.println("email is valid.");
        } else {
            System.out.println("email is not valid.");
        }
    }
}
