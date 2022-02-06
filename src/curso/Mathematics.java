package curso;

public class Mathematics {
    
    public static void exponenciar(){
         System.out.println("");
         System.out.println("MATH LIBRARY (SQUARING UP)");
         System.out.println("Same as always, only worth to remember is that in order to square up a number you must use libraries");
        
         double y = 8;
         double result = Math.pow(y, 3); //Raise to the power
         System.out.println("Math.pow(): " + result);
                
         result = Math.sqrt(y); //Square root
         System.out.println("Math.sqrt(arg): " + result);
       
         result = Math.cbrt(y); //Cubic root
         System.out.println("Math.cbrt(arg): " + result);
        
    };
    
    public static void math(){
        
        System.out.println("");
        System.out.println("MATH LIBRARY (EXTRA STUFF)");
        
        byte a = 5;
        byte b = 6;
        
        int result = Math.max(a, b); //Maximo de dos valores
        System.out.println("Math.max: " + result);
    };
    
    public static void plusplus(){
        
        System.out.println("");
        System.out.println("INCREMENT AND DECREMENT");
        int c = 0;
        
        c++;
        System.out.println(c);
        c = 0;
        System.out.println(c++); //The increment only happens once the line is executed (passed)
        //By this line c equals 1, because the execution has now passed its declaration
        
        //This effect applies as well for decrement

    };
}
