import java.util.Scanner;

class Calculator{
    public static void main (String[] x)
    {
         Scanner ex= new Scanner(System.in); //calls in methods from library
         System.out.println("Enter second number: ");
         int store1 = ex.nextInt();//stores numbers
         System.out.println("Your first number is:" + store1);
         
         System.out.println("Enter second number: ");
         int store2 = ex.nextInt();//stores numbers
         System.out.println("Your second number is:" + store2);
         
         ex.close();
    }
}