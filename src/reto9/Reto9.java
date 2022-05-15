
package reto9;
import java.util.ArrayList;
import reto9_2.Ayudante; // carpetas y sirven para organizar el código/proyecto

public class Reto9 {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota();
        System.out.println(pelota1.getPoder());
        pelota1.color = "Negro";
        
        Pelota pelota2 = new Pelota("Rojo",10,100);
        System.out.println(pelota2.getPoder());
        System.out.println(pelota2.color);
        pelota2.color = "Verde";
        System.out.println(pelota2.color);
        pelota2.setPoder(200);
        System.out.println(pelota2.getPoder());
        pelota2.disminuirRapidez();
        System.out.println(pelota2.getRapidez());
        
        //Ayudante ayudante1 = new Ayudante();
        //ayudante1.imprimirDatos();
        

        // array
        // primer escenario
        Ayudante[] ayudantes = new Ayudante[5];
        // Personaje1 
        // Personaje2
        
        /*Ayudante ayudante1 = new Ayudante();
        Ayudante ayudante2 = new Ayudante();
        Ayudante ayudante3 = new Ayudante();
        Ayudante ayudante4 = new Ayudante();
        Ayudante ayudante5 = new Ayudante();
        ayudantes[0] = ayudante1;
        ayudantes[1] = ayudante2;
        ayudantes[2] = ayudante3;
        ayudantes[3] = ayudante4;
        ayudantes[4] = ayudante5;
        for(int i = 0; i < ayudantes.length; i++){
            System.out.println("Ayudante " + (i + 1) );
            ayudantes[i].imprimirDatos();
            System.out.println("--------------------");
        } */
        
        // segundo escenario
        /*ayudantes[0] = new Ayudante();
        ayudantes[1] = new Ayudante();
        ayudantes[2] = new Ayudante();
        ayudantes[3] = new Ayudante();
        ayudantes[4] = new Ayudante();*/
        
        
        // array o vector
        for(int i = 0; i < ayudantes.length; i++){
            ayudantes[i] = new Ayudante();
        }
        
        for(int i = 0; i < ayudantes.length; i++){
            System.out.println("Ayudante " + (i + 1) );
            ayudantes[i].imprimirDatos();
            System.out.println("--------------------");
        }
        
        /*
        // arraylist
        ArrayList<Ayudante> minis = new ArrayList<Ayudante>(); // object
        //Ayudante ayudante1 = new Ayudante();
        for(int i = 0; i < 5; i++){
            minis.add(new Ayudante());
        }
        
        for(int i = 0; i < minis.size(); i++){
            System.out.println("Ayudante " + (i + 1) );
            Ayudante aux = minis.get(i);
            aux.imprimirDatos();
            //minis.get(i).imprimirDatos();
            System.out.println("--------------------");
        }
        
        for (Ayudante mini : minis) {
            System.out.println("--------------------");
            mini.imprimirDatos();
            System.out.println("--------------------");
        } */
    }
    
}
