class DataTypeInspector{
    public static void main(String[] x){
         
        //intergers types
        byte b=0; //stores the lowest value (-128 to 127)
        short s=20;// stores more than byte (-32768 to 32767)
        int i=300;// stores values from -2,147,483,648 to 2,147,483,647
        long l=4000000L;//must end with 'L'
        
        //decimal types
        float f=10.0f; //must end with 'f'
        double d=10.345;// default type for decimal
        
        //boolean type
        boolean e=true; //stores either true or false
        
        //character type
        char c=  'Z'; //stores a single character

        //Displaying all the primitive datatypes
        System.out.println("byte value: " +b);
        System.out.println("short value: " +s);
        System.out.println("int value: " +i);
        System.out.println("long value: " +l);
        System.out.println("float value: " +f);
        System.out.println("double value: " +d);
        System.out.println("boolean value: " +e);
        System.out.println("char value: " +c);
    }
}