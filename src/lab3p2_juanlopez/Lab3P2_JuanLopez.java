package lab3p2_juanlopez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3P2_JuanLopez {
    
//Una vez cuando tenía siete años me senté en un plátano y claro eso cambió mi vida
    
    public static void main(String[] args) {
        int op=0;
        ArrayList <Pokemon> pokemon=new ArrayList();
        ArrayList <Pokeball> bolas=new ArrayList();
        Scanner leer =new Scanner(System.in);
        Random rand=new Random();
        Pokemon ball=null;
        while(op!=7){
            System.out.println("°°°°°°°°°°°°°°°°MENÚ PRINCIPAL°°°°°°°°°°°°°°°°");
            System.out.println("1. Crear pokemon");
            System.out.println("2. Crear pokebola");
            System.out.println("3. Listar pokemon");
            System.out.println("4. Eliminar pokemon");
            System.out.println("5. Capturar pokemon");
            System.out.println("6. Modificar pokemon");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.println("Ingrese opción");
            op=leer.nextInt();
            leer.nextLine();
            switch (op){
                case 1:
                    String nombre;
                    int serie;
                    int control=0;
                    String naturaleza="";
                    int nature;
                    System.out.println("1. Fuego\n2. Agua\n3. Planta");
                    int tipo=leer.nextInt();
                    leer.nextLine();
                    if (tipo==1){
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        System.out.println("Ingrese naturaleza");
                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
                        nature=leer.nextInt();
                        if (nature==1){
                            naturaleza="Tímido";
                        }else if (nature==2) {
                            naturaleza="Energético";
                        }else if(nature==3){
                            naturaleza="Misterioso";
                        }
                        System.out.println("Ingrese potencia de llamas");
                        int llamas=leer.nextInt();
                        pokemon.add(new Fire(llamas, nombre, serie, naturaleza, false, null));
                    }else if (tipo==2) {
                        boolean vivir=false;
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        System.out.println("Ingrese naturaleza");
                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
                        nature=leer.nextInt();
                        if (nature==1){
                            naturaleza="Tímido";
                        }else if (nature==2) {
                            naturaleza="Energético";
                        }else if(nature==3){
                            naturaleza="Misterioso";
                        }
                        System.out.println("Puede vivir fuera el agua?");
                        System.out.println("1. Si\n2. No");
                        int nada=leer.nextInt();
                        if (nada==1){
                            vivir=true;
                        }else if (nada==2) {
                            vivir=false;
                        }
                        System.out.println("Ingrese velocidad bajo el agua:");
                        int nadar=leer.nextInt();
                        pokemon.add(new Water(vivir, nadar, nombre, serie, naturaleza, false, null));
                    }else if (tipo==3) {
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        System.out.println("Ingrese naturaleza");
                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
                        nature=leer.nextInt();
                        leer.nextLine();
                        if (nature==1){
                            naturaleza="Tímido";
                        }else if (nature==2) {
                            naturaleza="Energético";
                        }else if(nature==3){
                            naturaleza="Misterioso";
                        }
                        System.out.println("Ingrese nombre del habitat");
                        String habitat=leer.nextLine();
                        System.out.println("Ingrese dominio sobre las plantas:(0-100)");
                        int dominio=leer.nextInt();
                try {
                    pokemon.add(new Grass(dominio, nombre, serie, naturaleza, false, null,habitat));
                } catch (Exception ex) {
//                    Logger.getLogger(Lab3P2_JuanLopez.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("El dominio escapa del rango 0-100");
                }
                    }
                    break;
                    
                case 2:
                    String color="";
                    int numero;
                    int eficiencia;
                    int cont=0;
                    System.out.println("Ingrese el color:");
                    color=leer.nextLine();
                    System.out.println("Ingrese numero de serie");
                    numero=leer.nextInt();
                    for (int i = 0; i < bolas.size(); i++) {
                            if(bolas.get(i).getSerie()==numero){
                                cont++;
                            }
                        }
                        if (cont>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        System.out.println("Ingrese eficiencia (1-3)");
                        eficiencia=leer.nextInt();
                {
                    try {
                        bolas.add(new Pokeball(color, numero, eficiencia));
                                } catch (Exception ex) {
//                        Logger.getLogger(Lab3P2_JuanLopez.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("El numero de serie debe ser entre 1 y 3");
                    }
                }
                    break;

                    
                case 3:
                    System.out.println("Tipo Fuego");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Fire){
                        System.out.println("--->  "+p);
                        }
                    }
                    System.out.println("");
                    System.out.println("Tipo Agua");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Water){
                        System.out.println("--->  "+p);
                        }
                    }
                    System.out.println("");
                    System.out.println("Tipo planta");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Grass){
                        System.out.println("--->  "+p);
                        }
                    }
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("Ingrese tipo del pokemon a eliminar:");
                    System.out.println("1. Fuego\n2. Agua\n3. Planta");
                    int pos;
                    int type=leer.nextInt();
                    if(type==1){
                        System.out.println("Tipo Fuego");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Fire){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                        System.out.println("Ingrese posición del pokemon a eliminar:");
                        pos=leer.nextInt();
                        if(pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Fire){
                            pokemon.remove(pos);
                        }else{
                            System.out.println("Posición ingresada no válida");
                        }
                    }else if (type==2) {
                        System.out.println("Tipo Agua");
                        for (Pokemon p : pokemon) {
                        if(p instanceof Water){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                        System.out.println("Ingrese posición del pokemon a eliminar:");
                        pos=leer.nextInt();
                        if(pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Water){
                            pokemon.remove(pos);
                        }else{
                            System.out.println("Posición ingresada no válida");
                        }
                    }else if (type==3) {
                        System.out.println("Tipo Grass");
                        for (Pokemon p : pokemon) {
                        if(p instanceof Grass){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                        System.out.println("Ingrese posición del pokemon a eliminar:");
                        pos=leer.nextInt();
                        if(pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Grass){
                            pokemon.remove(pos);
                        }else{
                            System.out.println("Posición ingresada no válida");
                        }
                    }
                    break;
                    
                case 5:
                    int pokem;
                    if(!bolas.isEmpty()){
                    System.out.println("");
                    int probable;
                    int poke=0;
                    for (Pokeball b : bolas) {
                        System.out.println(bolas.indexOf(b)+".  "+b);
                    }
                    System.out.println("");
                    System.out.println("Escoja pokebola");
                    int bola=leer.nextInt();
                    if(bola<0||bola>=bolas.size()){
                        System.out.println("Bola fuera de rango");
                        break;
                    }
                    String name="";
                    boolean atrapado=true;
                    while(atrapado==true){
                        poke=rand.nextInt(pokemon.size());
                        name=pokemon.get(poke).getNombre();
                        atrapado=pokemon.get(poke).isAtrapado();
                    }
                        System.out.println("EL POKEMON [ "+name+" ] HA APARECIDO");
                        System.out.println("");
                        System.out.println("¿Desea atraparlo o huir?");
                        System.out.println("1. Atrapar\n2. Huir");
                        int accion=leer.nextInt();
                        if (accion==2){
                            System.out.println("Got away safely!");
                            break;
                        }else if (accion==1) {
                            int rate=bolas.get(bola).getEficiencia();
                            if (rate==1){
                                probable=rand.nextInt(3)+1;
                                if (probable==1){
                                    System.out.println("EL POKEMON [ "+name+" ] HA SIDO ATRAPADO");
                                    pokemon.get(poke).setBall(bolas.get(bola));
                                    pokemon.get(poke).setAtrapado(true);
                                    bolas.remove(bola);
                                }else{
                                    System.out.println("EL POKEMON HA LOGRADO ESCAPAR");
                                    bolas.remove(bola);
                                }
                            }else if(rate==2){
                                probable=rand.nextInt(3)+1;
                                if (probable==1||probable==2){
                                    System.out.println("EL POKEMON [ "+name+" ] HA SIDO ATRAPADO");
                                    pokemon.get(poke).setBall(bolas.get(bola));
                                    pokemon.get(poke).setAtrapado(true);
                                    bolas.remove(bola);
                                }else{
                                    System.out.println("EL POKEMON HA LOGRADO ESCAPAR");
                                    bolas.remove(bola);
                                }
                            }else if (rate==3){
                                System.out.println("EL POKEMON [ "+name+" ] HA SIDO ATRAPADO");
                                    pokemon.get(poke).setBall(bolas.get(bola));
                                    pokemon.get(poke).setAtrapado(true);
                                    bolas.remove(bola);
                            }
                        }
                    
                    
                    
                    }else{
                        System.out.println("No hay pokebolas con las cuales capturar");
                    }
                    break;
                    
                case 6:
                    System.out.println("Ingrese tipo del pokemon a eliminar:");
                    System.out.println("1. Fuego\n2. Agua\n3. Planta");
                    type=leer.nextInt();
                    if (type==1){
                    System.out.println("Tipo Fuego");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Fire){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                    System.out.println("Ingrese posición del pokemon a modificar");
                    pos=leer.nextInt();
                    leer.nextLine();
                    control=0;
                    naturaleza="";
                    if(pos>=0&&pos<pokemon.size()){
                    if(pokemon.get(pos).isAtrapado()&&pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Fire){
                        System.out.println("1. Nombre\n2. Serie\n3. Llamas");
                        int dato=leer.nextInt();
                        leer.nextLine();
                        if(dato==1){
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        ((Fire)pokemon.get(pos)).setNombre(nombre);
                        }else if(dato==2){
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        ((Fire)pokemon.get(pos)).setSerie(serie);
                        }else if (dato==3){
//                        System.out.println("Ingrese naturaleza");
//                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
//                        nature=leer.nextInt();
//                        if (nature==1){
//                            naturaleza="Tímido";
//                        }else if (nature==2) {
//                            naturaleza="Energético";
//                        }else if(nature==3){
//                            naturaleza="Misterioso";
//                        }
//                        ((Fire)pokemon.get(pos)).setNaturaleza(naturaleza);
                        System.out.println("Ingrese potencia de llamas");
                        int llamas=leer.nextInt();
                        ((Fire)pokemon.get(pos)).setLlamas(llamas);
                        }
                    }
                    }else{
                        System.out.println("Solo se pueden modificar pokemones atrapados");
                    }
                    }else if (type==2) {
                       System.out.println("Tipo Agua");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Water){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                    System.out.println("Ingrese posición del pokemon a modificar");
                    pos=leer.nextInt();
                    control=0;
                    naturaleza="";
                    if(pos>=0&&pos<pokemon.size()){
                    if(pokemon.get(pos).isAtrapado()&&pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Water){
                        System.out.println("1. Nombre\n2. Serie\n3. Resistencia");
                        int dato=leer.nextInt();
                        leer.nextLine();
                        if (dato==1){
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        ((Water)pokemon.get(pos)).setNombre(nombre);
                        }else if(dato==2){
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        ((Water)pokemon.get(pos)).setSerie(serie);
                        }else if(dato==3){
                        boolean vivir=false;
//                        System.out.println("Ingrese naturaleza");
//                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
//                        nature=leer.nextInt();
//                        if (nature==1){
//                            naturaleza="Tímido";
//                        }else if (nature==2) {
//                            naturaleza="Energético";
//                        }else if(nature==3){
//                            naturaleza="Misterioso";
//                        }
//                        ((Water)pokemon.get(pos)).setNaturaleza(naturaleza);
                        System.out.println("Puede vivir fuera el agua?");
                        System.out.println("1. Si\n2. No");
                        int nada=leer.nextInt();
                        if (nada==1){
                            vivir=true;
                        }else if (nada==2) {
                            vivir=false;
                        }
                        ((Water)pokemon.get(pos)).setVivir(vivir);
                        }
//                        System.out.println("Ingrese velocidad bajo el agua:");
//                        int nadar=leer.nextInt();
//                        ((Water)pokemon.get(pos)).setNadar(nadar);
                    }
                    }else{
                        System.out.println("Solo se pueden modificar pokemones atrapados");
                    } 
                    }else if (type==3) {
                        System.out.println("Tipo Planta");
                    for (Pokemon p : pokemon) {
                        if(p instanceof Grass){
                        System.out.println(pokemon.indexOf(p)+".  "+p);
                        }
                    }
                    System.out.println("Ingrese posición del pokemon a modificar");
                    pos=leer.nextInt();
                    control=0;
                    naturaleza="";
                    if(pos>=0&&pos<pokemon.size()){
                    if(pokemon.get(pos).isAtrapado()&&pos>=0&&pos<pokemon.size()&&pokemon.get(pos) instanceof Grass){
                        System.out.println("1. Nombre\n2. Serie\n3. Habitat");
                        int dato=leer.nextInt();
                        leer.nextLine();
                        if (dato==1){
                        System.out.println("Ingrese nombre:");
                        nombre=leer.nextLine();
                        ((Grass)pokemon.get(pos)).setNombre(nombre);
                        }else if(dato==2){
                        System.out.println("Ingrese serie");
                        serie=leer.nextInt();
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i).getSerie()==serie){
                                control++;
                            }
                        }
                        if (control>0){
                            System.out.println("Número de serie existente");
                            break;
                        }
                        ((Grass)pokemon.get(pos)).setSerie(serie);
                        }else if(dato==3){
//                        System.out.println("Ingrese naturaleza");
//                        System.out.println("1. Tímido\n2. Energético\n3. Misterioso");
//                        nature=leer.nextInt();
//                        if (nature==1){
//                            naturaleza="Tímido";
//                        }else if (nature==2) {
//                            naturaleza="Energético";
//                        }else if(nature==3){
//                            naturaleza="Misterioso";
//                        }
//                        ((Grass)pokemon.get(pos)).setNaturaleza(naturaleza);
                        System.out.println("Ingrese nombre del habitat");
                        String habitat=leer.nextLine();
                        ((Grass)pokemon.get(pos)).setHabitat(habitat);
                        }
//                        System.out.println("Ingrese dominio sobre las plantas:(0-100)");
//                        int dominio=leer.nextInt();
//                try {
//                    ((Grass)pokemon.get(pos)).setDominio(dominio);
//                } catch (Exception ex) {
////                    Logger.getLogger(Lab3P2_JuanLopez.class.getName()).log(Level.SEVERE, null, ex);
//                      System.out.println("El dominio escapa del rango 0-100");
//                }
                    }
                    }else{
                        System.out.println("Solo se pueden modificar pokemones atrapados");
                    } 
                    }
                    break;
                    
            }//FIN DEL SWITCH
            
            
        }//FIN DEL WHILE
        
    }//FIN DEL MAIN
    
}//FIN DE LA CLASE
