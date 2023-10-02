package task1;
public class Task1 {
    public static void main(String[] args) {
        Input input = new Input();

        double num1 = input.ValidNumber("Enter the first number: ");
        String operator = input.ValidOperator();
        double num2 = input.ValidNumber("Enter the second number: ");

        double result = CalculatorOperations.calculateResult(num1, operator, num2);
        System.out.println("Result: " + result);
    }
}


