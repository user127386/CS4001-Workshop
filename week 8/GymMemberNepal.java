import java.util.Date;//for the usage to store time and date of the member joining the gym

public class GymMemberNepal{
    //Attributes
    String memberName;
    String membershipType;//basic,premium,vip
    double monthlyFee;
    Date joinDate;
    //parameterized constructor
    public GymMemberNepal(String memberName, String membershipType, double monthlyFee, Date joinDate){
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.monthlyFee = monthlyFee;
        this.joinDate = joinDate;
    }
    //annual fee with 13% vat
    double calculateAnnualFee(){
        double annualFee = monthlyFee*12;
        return annualFee + (annualFee*0.13);
    }
    //discounted monthly fee for students and seniors
    double getDiscountedFee(double discountPercent){
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }
    //loyalty discount if time is greater then 6 months
    boolean isEligibleForDiscount(){
        Date d1 = new Date();
        int joinedMonth = joinDate.getYear() * 12 + joinDate.getMonth();
        int presentMonth = d1.getYear() * 12 + d1.getMonth();
        return (presentMonth - joinedMonth) > 6;
    }
    //display all the members and their plans in nepali format(?)
    void displayMemberInfo(){
        System.out.println("नाम             : " + memberName);
        System.out.println("सदस्य प्रकार : " + membershipType);
        System.out.println("मासिक शुल्क: रु " + monthlyFee);
        System.out.println("ज्वाइन मिति  : " + joinDate);
        System.out.println("वार्षिक शुल्क (VAT सहित): रु " + calculateAnnualFee());
        if(isEligibleForDiscount()){
            System.out.println("You get loyalty discount");
        }else{
            System.out.println("You wont get any discount");
        }
        System.out.println();
    }
    //displaying all the members and their plans
    public static void main(String[] x){
        GymMemberNepal basic = new GymMemberNepal("Ramesh", "Basic", 1500, new Date(124, 0, 10));//the java year starts from 1900 so 124 actually is 2024 
        GymMemberNepal premium = new GymMemberNepal("Biraj", "Premium", 2500, new Date(125, 6, 11));//likewise the month january starts from 0 
        GymMemberNepal vip = new GymMemberNepal("Divyamani", "VIP", 4000, new Date(123, 8, 23));
        basic.displayMemberInfo();//calling the methods, without calling no output whatsoever
        premium.displayMemberInfo();
        vip.displayMemberInfo();
    }
}