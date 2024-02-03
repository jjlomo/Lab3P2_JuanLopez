/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_juanlopez;

/**
 *
 * @author jjlm1
 */
public class Fire extends Pokemon{
        
    int llamas;

    public Fire() {
        
    }

    public Fire(int llamas,String nombre,int serie,String naturaleza,boolean atrapado,Pokeball ball) {
        super(nombre,serie,naturaleza,atrapado,ball);
        this.llamas = llamas;
    }

    public int getLlamas() {
        return llamas;
    }

    public void setLlamas(int llamas) {
        this.llamas = llamas;
    }

    @Override
    public String toString() {
        return super.toString()+"     Potencia de llamas: " + llamas ;
    }
    
   
   

}
