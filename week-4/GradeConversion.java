import java.util.Scanner;

class GradeConversion{
    public static void main(String[] x){
        Scanner ex = new Scanner (System.in);
        
        System.out.println("Enter your gpa: ");
        double gpa = ex.nextDouble();
        
        if (gpa < 0.00 || gpa > 4.00){
            System.out.println("Please enter valid gpa!");
        }else if(gpa > 3.6){
             System.out.println("A+");
        }else if(gpa > 3.2 && gpa <= 3.6){
            System.out.println("A");
        }else if(gpa > 2.8 && gpa <= 3.2){
            System.out.println("B+");
        }else if(gpa > 2.4 && gpa <= 2.8){
            System.out.println("B");
        }else if(gpa > 2 && gpa <= 2.4){
            System.out.println("C+");
        }else if(gpa > 1.6 && gpa <= 2.00){
            System.out.println("C");
        }else if(gpa > 1.2 && gpa <= 1.6){
            System.out.println("D+");
        }else {
            System.out.println("You failed.");  
        }
    }
}