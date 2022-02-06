package curso;

public class Variables {
    
    public void variables(){
        
        System.out.println("");
        System.out.println("ASIGNACIONES");
        
         /*
         Java es tipado, por tanto es muy estricto en cuanto
         al identificador de sus variables, no se le puede asignar 
         por ejemplo un String a una variable que fue declarada como Int
         */
        
         String nombre;
         nombre = "Alex";
         int edad = 19;
         int a, b, c; //Añadir mismo tipo a varias variables
         a = 1;
         b = 2;
         c = 3;
        
         System.out.println(nombre);
         System.out.println(edad);
         System.out.println(a + b + c);
         
         //Nueva forma de definir variables
         
         var apellido = "Krissanova"; //
         var nombresCompleto = nombre + " " + apellido;
         System.out.println("Mi nombre es: " + nombresCompleto);
         
         };
         
    public static void tipos(){
        
        System.out.println("");
        System.out.println("VARIABLES");
        
         //TIPOS DE VARIABLE
         //*numericos enteros:
         
         /* 
         BYTE 
         Rango: -128 a 127
         */
         byte a_Byte = -128;
         byte b_Byte = -127;
         
         /*
         SHORT
         Rango: -32,768 a 32,767
         */
         short a_Short = -32768;
         short b_Short = 32767;
         
         /*
         INT
         Rango: -2,147,483,648 a 2,147,483,647
         */
         int a_Int = -2147483648;
         int b_Int = 2147483647;
         
         /*
         LONG
         Rango: -9,233,372,036,854,775,808 a 9,233,372,036,854,775,807
         Nota: el valor debe apendizarse con "L"
         */
         long a_Long = -9223372036854775808L;
         long b_Long = 9223372036854775807L;
         
         //*numericos flotantes:
         
         /*
         FLOAT
         Rango: para almacenar hasta 7 digitos decimales
         Nota: el valor debe apendizarse con "F"
         */
         float a_Float = 9.9999999F;
         
         /*
         DOUBLE
         Rango: para almacenar hasta 15 digitos decimales
         Nota: el valor debe adepndizarse con "D"
         */
         double a_Double = 9.999999999999999D;
         
         //*Strings:
         
         /*
         CHAR
         Rango: almacena caracteres individuales o codigo ASCII
         Nota: el caracter debe de connotarse con comillas simples ''
         */
         char a_Char = 'a';
         char b_Char = 65; //ASCII code for "A"
         
         /*
         STRING
         */
         String a_String = "Nombre";
         
         //*Estado
         
         /*
         BOOLEAN
         Rango: 0 a 1 (1 = ON, 0 = OFF)
         */
         boolean a_Bool = true;
         boolean b_Bool = false;
         
         System.out.println("Byte: " + b_Byte);
         System.out.println("Short: " + b_Short);
         System.out.println("Int: " + b_Int);
         System.out.println("Long: " + b_Long);
         System.out.println("Float: " + a_Float);
         System.out.println("Double: " + a_Double);
         System.out.println("Char: " + a_Char);
         System.out.println("Char: " + b_Char);
         System.out.println("String: " + a_String);
         System.out.println("Boolean: " + a_Bool);

    };
    
}
