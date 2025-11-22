class MathOperation{
    public static void main (String[] nice){
        int a = 20;
        int b = 30;
        //Arthmetic operators
        System.out.println("adition: " +(a+b));
        System.out.println("subtraction: " +(a-b));
        System.out.println("multiplication: " +(a*b));
        System.out.println("division: " +(a/b));
        System.out.println("modulus:" +(a%b));
        System.out.println("increment:" +(a++));
        System.out.println("decrement:" +(b--));
        
        //Relational operators
        System.out.println("adition: " +(a+b));
        System.out.println("subtraction: " +(a-b));
        System.out.println("multiplication: " +(a*b));
        System.out.println("division: " +(a/b));
        System.out.println("modulus:" +(a%b));
        System.out.println("increment:" +(a++));
        System.out.println("decrement:" +(b--));
        
        //Logical operators
        boolean x=true;
        boolean y=false;

        System.out.println("And:" +(x&&y));
        System.out.println("Or:" +(x||y));
        System.out.println("Not:" +(!x));
        
        //Assignment operators
        int c=23;

        System.out.println("=" +c);
        System.out.println("+=" +c);
        System.out.println("-=" +c);
        System.out.println("*=" +c);
        System.out.println("/=" +c);
        System.out.println("%=" +c);
        
        //Ternary operators
        var num = 9;
        var type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + type);
        
        //bitwise operators
        int d=8;
        int e=4;

        System.out.println("And:" +(d&e));
        System.out.println("Or:" +(d|e));
        System.out.println("X:" +(d^e));
    }
}