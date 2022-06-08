/*
    Hacer la clase Rueda con atributo marca y presion. Luego el auto debe tener 4 ruedas, y desde el main el 
    auto debe inflar sus ruedas, la presion a 28.0
 */
package tp1.auto;

public class Rueda {

    private String marca = "Generica";
    private double presion;
    private double maxPresion = 28d;

    public Rueda() {
        setPresion(maxPresion);
    }
    
    public Rueda(String marca) {
        setMarca(marca);
        setPresion(maxPresion);
    }

    public void desinflar() {
        if(!(getPresion()<=0.5)){
            setPresion(getPresion()-0.5);
        } else{
            setPresion(0);
            System.out.println("\nLa rueda está totalmente desinflada!\nVaya a la gomeria más cercana");
        }
    }
    
    public void inflar(){
        setPresion(maxPresion);
    }

    public String getMarca() {
        return marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    public String toString(){
        return "\nMarca: " + getMarca() + "\nPresion: " + getPresion();
    }
    
}
