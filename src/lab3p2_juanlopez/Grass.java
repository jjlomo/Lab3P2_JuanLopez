/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_juanlopez;

public class Grass extends Pokemon{
    private int dominio;
    private String habitat;

    public Grass(int dominio, String nombre, int serie, String naturaleza, boolean atrapado, Pokeball ball, String habitat)throws Exception {
        super(nombre, serie, naturaleza, atrapado, ball);
        if (dominio>=0&&dominio<=100){
        this.dominio = dominio;
        }else{
            throw new Exception();
        }
        this.habitat=habitat;
    }

    public Grass() {
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio)throws Exception {
        if (dominio>=0&&dominio<=100){
        this.dominio = dominio;
        }else{
            throw new Exception();
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    

    @Override
    public String toString() {
        return super.toString()+ "    Dominio de plantas: " + dominio + "    Habitat: " + habitat;
    }
    
}
