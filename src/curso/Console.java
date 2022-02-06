package curso;

import java.util.Scanner; //We use import to bring methods from classes

public class Console {
    
        public static void input(){
            
            System.out.println("");
            System.out.println("SCANNER OBJECT");
            
            Scanner read = new Scanner(System.in);
            
            String username = read.nextLine(); //El metodo a usar del objeto read depende del tipo de dato a leer
            //Referencia: https://oregoom.com/java/entrada-de-datos/
            
            System.out.println("Input entered: " + username);
            
            read.close();
    };
        
        public static void output(){
            
            System.out.println("");
            System.out.println("OUTPUT FORMATING");
            
            String username = "Reichskleinodien";
            Byte level = 46;
            
            System.out.printf("Username: %s / Level: %d", username, level); //Reference: https://oregoom.com/java/salida-de-datos/
            
            System.out.println("\""); //Escapar caracteres, para escapar caracteres se debe posicionar un \ a la izquierda del caracter
            
        };
    
        
}
