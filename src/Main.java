import tp1.auto.*;
import tp1.robot.*;

public class Main {

    public static void main(String[] args) {
        //Crea un Auto e imprime un mensaje
        Auto auto1 = new Auto("AD330RF", "NEGRO");
        System.out.println("Nuevo Auto creado!");
        
        //Toma la rueda en la posicion 0 del ArrayList, imprime su estado y la desinfla por completo
        System.out.println(auto1.getRuedas().get(0));
        auto1.getRuedas().get(0).setPresion(0);
        System.out.println( "\nRueda en llanta!\n"+ auto1.getRuedas().get(0));
        //Procede a inflarla
        auto1.getRuedas().get(0).inflar();
        //Muestra la presion resultante
        System.out.println("\nRueda inflada!\n" + auto1.getRuedas().get(0));
        
        //Crea un Robot, un Hombre y hace al Hombre jugar con el Robot
        Robot rob1 = new Robot();
        System.out.println("\nRobot creado!\n");
        Hombre h1 = new Hombre("Pepito");
        System.out.println("Hombre creado!\n");
        h1.jugarConRobot(rob1);
    }
    
}
