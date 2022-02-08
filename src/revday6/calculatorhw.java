package revday6;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

class calculator {

    Object calculate(String operations, int num1, int num2) {
        switch(operations.toLowerCase()) {
            case "multiplication":
                return "Result is " + (num1 * num2);
            case "division":
                float fl1 = num1;
                float fl2 = num2;
                float f = fl1/fl2;
                return "Result is " + f;
            case "addition":
                return "Result is " + (num1 + num2);
            case "subtraction":
                return "Result is " + (num1 - num2);
            default:
                return "You need to enter an operator";
        }
    }
}

public class calculatorhw {

    public static void main(String[] args) {
        System.out.println("This is a calculator. Enter two numbers and then the operation");
        System.out.println("Enter first number: ");
        Scanner num1scan = new Scanner(System.in);
        String num1str = num1scan.nextLine();
        int num1 = 1;
        try {
            num1 = parseInt(num1str);
        }
        catch (NumberFormatException e) {
            System.out.println("Oops have to enter integer");
            return;
        }
        int num2;
        System.out.println("Enter second number: ");
        Scanner num2scan = new Scanner(System.in);
        String num2str = num2scan.nextLine();
        try {
            num2 = parseInt(num2str);
        }
        catch (NumberFormatException e) {
            System.out.println("Oops you have to enter integer");
            return;
        }
        System.out.println("What operation would you like to do? Addition, subtraction, multiplication or division?");
        Scanner operationscan = new Scanner(System.in);
        String operationstr = operationscan.nextLine();
        operationscan.close();
        calculator operator = new calculator();
        System.out.println("Output");
        System.out.println(operator.calculate(operationstr, num1, num2));
        }

    }

