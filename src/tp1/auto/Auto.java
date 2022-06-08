/*
    Para el Video Juego Carrera Mortal, nos piden modelar un Auto
    con las siguientes caracteristicas y comportamiento para poder ser
    anexado al proyecto.
    El auto debe tener: color, patente y combustible con una carga inicial
    de 50lts.
    El auto solo tendra como comportamiento:
    Avanzar: Al que le indicaremos la cantidad de metros que deseamos
    avance y deberemos tener en cuenta que por cada 10 mts consume 1lt
    de combustible y solo podra avanzar si hay combustible suficiente.
    Retroceder: Al que le indicaremos la cantidad de metros que
    deseamos retroceda y deberemos tener en cuenta que por cada 10
    mts consume 1lt de combustible y solo podra avanzar si hay
    combustible suficiente.
    LlenarTanque: Llenara el tanque de este auto nuevamente con 50lts
    de combustible.
 */

package tp1.auto;

import java.util.ArrayList;

public class Auto {
    private String patente;
    private String color;
    private Double combustible;
    private final int CRUEDAS = 4;
    private ArrayList<Rueda> ruedas = new ArrayList<Rueda>();

    public Auto() {
        super();
    }

    public Auto(String patentes, String color) {
        //setear atributos
        this.patente = patentes;
        this.color = color;
        this.combustible = 50.0;
        
        //crear ruedas
        for(int i=0;i<CRUEDAS;i++){
            ruedas.add(new Rueda());
        }
    }

    public String getColor() {
        return color;
    }

    public Double getCombustible() {
        return combustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCombustible(Double combustible) {
        this.combustible = combustible;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void avanzar(Integer distancia) {
        if (combustible >= distancia / 10) {
            combustible -= distancia / 10;
        } else {
            System.out.println("Combustible insuficiente");
        }
    }

    public void retroceder(Integer distancia) {
        avanzar(distancia);
    }

    public void llenarTanque() {
        combustible = 50.0;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
}
