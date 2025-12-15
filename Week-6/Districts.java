import java.util.Scanner;

public class Districts{
    public static void main(String[] x){
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for(int i = 0; i < districts.length; i++){
            System.out.println( i+1 + ". " + districts[i]);
        }
        
        Scanner ex = new Scanner(System.in);
        System.out.print("Enter a distict to update the array: ");
        String district = ex.next();
        districts[1] = district;
        
        for(int i = 0; i < districts.length; i++){
            System.out.println(districts[i]);
        }
    }
}