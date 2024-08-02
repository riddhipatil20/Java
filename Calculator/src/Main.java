import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.println("Welcome to calculator");
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operator(+,-,*,/): ");
        operator=scanner.next();

        System.out.println("Enter the second number: ");
        num2=scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2!=0){
                    result= num1/num2;
                }else{
                    validOperation=false;
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                validOperation = false;
                System.out.println("Error: Invalid operator. Please use +,-,*,/.");
                break;
        }
        if(validOperation){
            System.out.println("The result is: "+result);
        }
        scanner.close();
    }

}