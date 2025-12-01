import java.util.Scanner;

class ScholarshipEligibility{
    public static void main(String[] x){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter Attendance: ");
        double attendance = y.nextDouble();
        
        System.out.println("Enter GPA: ");
        double GPA = y.nextDouble();
        
        System.out.println("Enter Attitude score: ");
        double attitude_score = y.nextDouble();
        
        if(attendance > 100 || attendance < 0){
            System.out.println("Please Enter Valid GPA");
        }
        if(GPA > 4 || GPA < 0){
            System.out.println("Please Enter Valid Attendance");
        }
        if(attitude_score>10 || attitude_score<0){
            System.out.println("Please Enter Valid Attitude Score");
        }
        if (GPA >=3.2 && GPA<=4){
             if (attendance >= 80 && attendance <= 100) {
                if (attitude_score >5 && attitude_score <=10){
                        System.out.println("You are eligible for scholarship!");
                    }
                }
            }else{
                System.out.println("You are not eligible for Scholarship!");
                 }
        }
}