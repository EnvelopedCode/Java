package curso;

public class Main {
    public static void main(String[] args){
        System.out.println("<All systems online (hacker music)/>");
        
        Variables objVariables = new Variables(); //Creamos un objeto de la clase de donde queremos llamar metodos
        objVariables.variables(); //Accedemos al metodo a traves de la clase
        
        Variables.tipos(); //tipos es un metodo estatico, por tanto no necesitamos instanciar objeto
        Mathematics.exponenciar();
        Mathematics.math();
        Operadores.relacionales();
        Mathematics.plusplus();
        Console.input();
        Console.output();
    }
}