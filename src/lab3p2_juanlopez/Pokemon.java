
package lab3p2_juanlopez;

public class Pokemon {
    protected String nombre;
    int serie;
    String naturaleza;
    boolean atrapado;
    Pokeball ball;

    public Pokemon() {
    }

    public Pokemon(String nombre, int serie, String naturaleza, boolean atrapado, Pokeball ball) {
        this.nombre = nombre;
        this.serie = serie;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
        this.ball = ball;
    }

    public Pokeball getBall() {
        return ball;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSerie() {
        return serie;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public void setBall(Pokeball ball) {
        this.ball = ball;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Nombre del Pokemon: " + nombre + "    No. de Serie: " + serie + "    Naturaleza: " + naturaleza + "    Atrapado: " + atrapado + "    Pokeball:" + ball;
    }
    
}
