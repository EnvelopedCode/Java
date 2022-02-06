package curso;

public class Operadores {
    
    public static void relacionales(){
        
        System.out.println("");
        System.out.println("OPERADORES RELACIONALES");
        
        int a = 1;
        int b = 3;
        boolean result;
        
        System.out.println(a);
        System.out.println(b);
        
        result = a == b;
        System.out.println("== " + result);
        
        result = a != b;
        System.out.println("!= " + result);
        
        result = a > b;
        System.out.println("> " + result);
        
        result = a < b;
        System.out.println("< " + result);
        
        result = a >= b;
        System.out.println(">= " + result);
        
        result = a <= b;
        System.out.println("<= " + result);
    };
    
    public static void logicos(){

        boolean result;
        
        /*
        Not(!): Convierte un booleano a su contrario
        */
        result = ! true;
        System.out.println(result);
        
        /*
        And(&&) solo retorna true si ambos operandos son true
        */
        
        /*
        Or(||) retorna true si alguno de los operandos es true
        */

    };
    
}
