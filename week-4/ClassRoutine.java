import java.util.Scanner;

class ClassRoutine{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = ex.nextLine().toLowerCase();
        switch(day){
            case "sunday" : 
                System.out.println("Lecture - Hardware and software & Programming");
                break;   
            case "monday" : 
                System.out.println("Lecture - Introduction to Information system & Logic and problem solving"); 
                break;
            case "tuesday" : 
                System.out.println("Tutorial- Hardware and software & Programming"); 
                break;
            case "wednesday" : 
                System.out.println("Tutrial- Introduction to Information system & Logic and problem solving"); 
                break;
            case "thursday" : 
                System.out.println("Workshop- Introduction to Information system & Logic and problem solving"); 
                break;
            case "friday" : 
                System.out.println("Workshop- Hardware and software & Programming"); 
                break;
            case "saturday" : 
                System.out.println("Holiday"); 
                break;
            default:  
                System.out.println("Please enter the days in the week"); 
                break;
        }
    }
}