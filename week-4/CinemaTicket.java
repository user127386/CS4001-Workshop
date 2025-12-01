import java.util.Scanner;

class CinemaTicket{
    public static void main(String[] x) {
        Scanner ex = new Scanner(System.in);

        System.out.println("Enter the Age Group (child/adult/senior): ");
        String agegroup = ex.next().toLowerCase();
        double BasePrice = 0;

        switch (agegroup) {
            case "child": BasePrice = 150; break;
            case "adult": BasePrice = 250; break;
            case "senior": BasePrice = 200; break;
            default:
                System.out.println("Invalid age group!");
        }
        System.out.println("Enter the Movie language (hindi/english):");
        String language = ex.next().toLowerCase();
        double priceafterlanguage = 0;

        switch(language) {
            case "hindi": priceafterlanguage = BasePrice + 50; break;
            case "english": priceafterlanguage = BasePrice + 100; break;
            default:
                System.out.println("Invalid language!");
        }
        System.out.println("Are you a Student? (yes/no):");
        String student = ex.next().toLowerCase();
        double discountamount1 = 0;
        
        if (student.equals("yes")) {
            discountamount1 = priceafterlanguage * 0.20; 
        }

        System.out.println("Is there a Festival? (yes/no):");
        String festival = ex.next().toLowerCase();
        double discountamount2 = 0;
        
        if (festival.equals("yes")) {
            discountamount2 = priceafterlanguage * 0.15; 
        }
        double Finalprice = priceafterlanguage - discountamount1 - discountamount2;
        System.out.println("Final Price: " + Finalprice);
    }
}