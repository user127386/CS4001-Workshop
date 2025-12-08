import java.util.Scanner;

class TableGenerator{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        
        System.out.println("Enter a number to display the multiplication table: ");
        int num = ex.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int multi = num * i;
            System.out.println(num + " * " + i + " = " + multi);
        }
    }
}