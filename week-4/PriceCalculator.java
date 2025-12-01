import java.util.Scanner;

class PriceCalculator{
    public static void main(String[] x){
        Scanner ex = new Scanner(System.in);
        
        System.out.println("Enter Marked Price: ");
        double mp = ex.nextDouble();
        
        System.out.println("Enter Catergory(A/B/C/D): ");
        String cat = ex.next();
        
        double discountedprice = 0;
        
        switch(cat){
            case "A":
                discountedprice = 60;
                break;
            case "B":
                discountedprice = 40;
                break;
            case "C":
                discountedprice = 20;
                break;  
            case "D":
                discountedprice = 10;
                break;
            default: 
                System.out.println("Please enter valid Category!");
        }
        double discountprice = (discountedprice/100) * mp;
        double sp = mp - discountprice;
        System.out.println("Your Discount is: " + discountprice);
        System.out.println("Your Final Price is: " + sp);
    }
}