/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_juanlopez;

/**
 *
 * @author jjlm1
 */
public class Water extends Pokemon{
    private boolean vivir;
    private int nadar;

    public Water(boolean vivir, int nadar, String nombre, int serie, String naturaleza, boolean atrapado, Pokeball ball) {
        super(nombre, serie, naturaleza, atrapado, ball);
        this.vivir = vivir;
        this.nadar = nadar;
    }

    public Water() {
    }

    public int getNadar() {
        return nadar;
    }

    public void setNadar(int nadar) {
        this.nadar = nadar;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    @Override
    public String toString() {
        return super.toString()+"     Resistencia fuera del agua: " + vivir + "    Velocidad de nado: " + nadar+ " km/h";
    }
    
    
}
