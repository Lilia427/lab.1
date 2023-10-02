package task1;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }

    public double ValidNumber(String message) {
        while (true) {
            try {
                System.out.print(message);
                double num = Double.parseDouble(scanner.nextLine());

                if (message.equals("Enter the second number: ") && num == 0) {
                    System.out.println("Error: Division by zero is not allowed. Enter the second number again.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid number.");
            }
        }
    }


    public String ValidOperator() {
        String operator;
        while (true) {
            System.out.print("Enter the operator (+, -, *, /): ");
            operator = scanner.nextLine();
            if (operator.matches("[+\\-*/]")) {
                break;
            }
            System.out.println("Invalid operator. Enter a valid operator.");
        }
        return operator;
    }
}
