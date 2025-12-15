import java.util.Scanner;

class StudentArray{
    public static void main(String[] x){
        String[] names = {"Asha", "Ramesh","Sita", "Binod", "Sabita"};
        
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("Name at second index is " + names[2]);
        
        names[4] = ("Yodin");
        System.out.println("Updated value for the fourth index is: " + names[4]);
        
        Scanner ex = new Scanner(System.in);
        System.out.println("Enter a name to update the array: ");
        String name = ex.next();
        names[0] = name;
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}