/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_juanlopez;

/**
 *
 * @author jjlm1
 */
public class Pokeball {
    String color;
    int serie;
    int eficiencia;

    public Pokeball() {
    }

    public Pokeball(String color, int serie, int eficiencia)throws Exception  {
        this.color = color;
        this.serie = serie;
        if(eficiencia<4&&eficiencia>0){
        this.eficiencia = eficiencia;
        }else{
            throw new Exception();
        }
    }

    public String getColor() {
        return color;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public int getSerie() {
        return serie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEficiencia(int eficiencia)throws Exception {
        if(eficiencia<4&&eficiencia>0){
        this.eficiencia = eficiencia;
        }else{
            throw new Exception();
        }
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Color de la Pokebola: " + color + "   Serie: " + serie + "    Eficiencia: " + eficiencia ;
    }
    
}
