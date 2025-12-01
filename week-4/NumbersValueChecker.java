import java.util.Scanner;

class NumbersValueChecker{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ex.nextInt();
        if(num > 0){
            System.out.println("Given number is positive");
        }
        if(num < 0){
            System.out.println("Given number number is negative");
        }
        if(num == 0){
            System.out.println("Given number is neutral");
        }
    }
}