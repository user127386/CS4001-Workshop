class DefaultValues{
    //without initializing
    byte b;
    int i;
    short s;
    long l;
    float f;
    double d;
    char name;
    boolean bool;
    
    public static void main(String[] x){ 
        //creating an object of the class
        DefaultValues obj = new DefaultValues();
        /* This wouldnt work for local variables because
         * local variables donot get default values
         * they must be assigned before using them.
         */
        System.out.println("Byte: " + obj.b);
        System.out.println("Int: " + obj.i);
        System.out.println("Short: " + obj.s);
        System.out.println("Long: " + obj.l);
        System.out.println("Float: " + obj.f);
        System.out.println("Double: " + obj.d);
        System.out.println("Character: " + obj.name);
        System.out.println("Boolean: " + obj.bool);
    }
}