package tp1.robot;

import java.util.Scanner;

public class Hombre {

    private String nombre;

    public Hombre() {
    }

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot rob1) {
        /* JugarConRobot() para que: El robot Avance 500 pasos. El robot Retroceda 20 pasos.
        Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.
         */
        rob1.avanzar(500d);
        rob1.retroceder(20d);
        System.out.println("Energia restante: " + rob1.bateriaActual());
        rob1.dormir();
    }
}
