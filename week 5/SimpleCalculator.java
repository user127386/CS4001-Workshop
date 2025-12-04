import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] x) {
        Scanner ex = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.print("Enter first number: ");
            double num1 = ex.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = ex.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            String op = ex.next();

            double result = 0;

            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    continue;
                }
            } else {
                System.out.println("Invalid operation!");
                continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = ex.next();
            if (choice.equals("no")) {
                run = false;
            }
        }
        ex.close();
    }
}