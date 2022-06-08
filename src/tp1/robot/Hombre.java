/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesRob;

import java.util.Scanner;

/**
 *
 * @author william
 */
public class Hombre {
    private String nombre;

    public Hombre() {
    }

    public Hombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void jugarConRobot(Robot rob1){
        /*o JugarConRobot() para que: El robot Avance 500 pasos. El robot Retroceda 20 pasos.
        Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.
        */
        rob1.avanzar(500);
        rob1.retroceder(20);
        System.out.println("Energia restante:"+rob1.bateriaActual());
        rob1.dormir();
    }
}
