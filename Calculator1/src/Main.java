import java.util.Scanner;

class Calculator {
    
    public double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation = "yes";

        while (continueCalculation.equalsIgnoreCase("yes")) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);

            if (!Double.isNaN(result)) {
                System.out.println("The result is: " + result);
            }

            System.out.println("Do you want to perform another calculation? (yes/no):");
            continueCalculation = scanner.next();
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
}
