import java.util.Scanner;

public class RickshawFareCalculator{
    public static void main(String[] nice) {
        Scanner sc = new Scanner(System.in);
        
        //Inputs
        System.out.print("Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Time (minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is the customer local? (yes/no): ");
        String isLocal = sc.next().toLowerCase();//toLowerCase command converts the entered string to lowercase

        System.out.print("Is it night time? (yes/no): ");
        String isNight = sc.next().toLowerCase(); //toLowerCase command converts the entered string to lowercase
        
        //Fares 
        double baseFare = 50;
        double perKm = 20 * distance ;
        double perMinute = 2 * time ;
        
        //Total before discount or subcharges
        double fare = baseFare + perKm + perMinute;
        
        //Discount for locals
        double discount = (isLocal.equals("yes") && distance > 10) //equals checks whether the entered string are same as the one we desire
                ? fare * 0.1 : 0;
        
        //Night surcharges
        double nightCharge = (isNight.equals("yes")) ? fare * 0.2 : 0;
        //Calculating total fares 
        double finalFare = fare - discount + nightCharge;
        
        //Displaying the final output
        System.out.println("Total Fare: Rs. " + finalFare);
    }
}