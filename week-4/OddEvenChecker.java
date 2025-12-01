import java.util.Scanner;

class OddEvenChecker{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ex.nextInt();
        if(num %2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number number is odd");
        }
    }
}