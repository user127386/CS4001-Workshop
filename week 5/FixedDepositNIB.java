import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] x) {
        Scanner ex = new Scanner(System.in);
        while (true) {
            System.out.print("Enter deposit amount (min Rs. 1000): ");
            double principal = ex.nextDouble();
            if (principal < 1000) {
                System.out.println("Minimum deposit is Rs. 1000.");
                continue;
            }
            System.out.print("Enter annual interest rate (8% - 12%): ");
            double rate = ex.nextDouble();
            if (rate < 8 || rate > 12) {
                System.out.println("Interest rate must be between 8% and 12%.");
                continue;
            }
            System.out.print("Enter duration in years (max 5 years): ");
            int years = ex.nextInt();
            if (years < 1 || years > 5) {
                System.out.println("Duration must be between 1 and 5 years.");
                continue;
            }
            double processingFee = principal * 0.005;
            double monthlyRate = rate / 100 / 12;
            int totalMonths = years * 12;
            double si = principal * Math.pow((1 + monthlyRate), totalMonths);
            double netAmount = si - processingFee;
            System.out.println("Amount before the fee: Rs. " + si);
            System.out.println("Amount : Rs. " + netAmount);

            System.out.print("Do you want to calculate another FD? (yes/no): ");
            String choice = ex.next().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }
        ex.close();
    }
}