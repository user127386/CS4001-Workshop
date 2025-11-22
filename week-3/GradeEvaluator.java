import java.util.Scanner;

class GradeEvaluator{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        
        System.out.println("Enter your Grade: ");
        double grade = ex.nextDouble();
        
        String a = (grade>=40) ? "You Passed":"You Failed";
        System.out.print(a);
    }
}