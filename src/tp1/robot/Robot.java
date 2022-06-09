package tp1.robot;

public class Robot {

    private double bateria = 1000;
    private long numeroS;
    private boolean despierto = true;

    public Robot() {
    }

    public Robot(long numeroS) {
        this.numeroS = numeroS;
    }

    public long getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(long numeroS) {
        this.numeroS = numeroS;
    }

    public void avanzar(double pasos) {
        double pas = (pasos / 100) * 10;
        if (despierto) {
            if (pas <= bateria) {
                bateria -= pas;
                System.out.println("Avanzo exitosamente los " + pasos + " pasos, le queda de energia: " + bateria);
            } else {
                System.out.println("No alcanza la enegia");
            }
        } else {
            System.out.println("El robot esta dormido, no puede avanzar");
        }
    }

    public void retroceder(double paso) {
        double pas = (paso / 100) * 10;
        if (despierto) {
            if (pas <= bateria) {
                bateria -= pas;
                System.out.println("Retrocedio exitosamente los " + paso + " pasos, le queda de energia: " + bateria);
            } else {
                System.out.println("No alcanza la enegia para retroceder");
            }
        } else {
            System.out.println("El robot esta dormido, no puede retroceder");
        }
    }

    public void dormir() {
        this.despierto = false;
    }

    public void despertar() {
        this.despierto = true;
    }

    public void recargar() {
        bateria = 1000;
    }

    public boolean bateriaLlena() {
        return bateria == 1000;
    }

    public boolean bateriaVacia() {
        return bateria == 0;
    }

    public int bateriaActual() {
        return (int) bateria;
    }
}
