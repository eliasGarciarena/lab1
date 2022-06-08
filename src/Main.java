
import tp1.auto.*;

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
    }
    
}
