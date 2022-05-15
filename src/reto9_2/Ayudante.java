
package reto9_2;

import java.util.Random;

public class Ayudante {
    private int numeroOjos;
    private String colorPiel;
    private String altura;
    private int nivelCrearObjetos;
    private int nivelArreglarObjetos;
    private int nivelDestructivo;
    
    // constructor ---> código directo
    // constructor ---> asignarCaracteristicas

    public Ayudante() {
        Random random = new Random();
        String[] coloresPiel = { "amarillo", "morado" };
        String[] alturas = { "mediano", "alto" };
        numeroOjos = random.nextInt(2) + 1;
        colorPiel = coloresPiel[random.nextInt(2)];
        altura = alturas[random.nextInt(2)];
        nivelCrearObjetos =  random.nextInt(5) + 1;
        nivelArreglarObjetos =  random.nextInt(5) + 1;
        nivelDestructivo =  random.nextInt(5) + 1;
    }

    public Ayudante(int numeroOjos, String colorPiel, String altura, int nivelCrearObjetos, int nivelArreglarObjetos, int nivelDestructivo) {
        this.numeroOjos = numeroOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelCrearObjetos = nivelCrearObjetos;
        this.nivelArreglarObjetos = nivelArreglarObjetos;
        this.nivelDestructivo = nivelDestructivo;
    }
    
    public int getNumeroOjos() {
        return numeroOjos;
    }

    public void setNumeroOjos(int numeroOjos) {
        this.numeroOjos = numeroOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getNivelCrearObjetos() {
        return nivelCrearObjetos;
    }

    public void setNivelCrearObjetos(int nivelCrearObjetos) {
        this.nivelCrearObjetos = nivelCrearObjetos;
    }

    public int getNivelArreglarObjetos() {
        return nivelArreglarObjetos;
    }

    public void setNivelArreglarObjetos(int nivelArreglarObjetos) {
        this.nivelArreglarObjetos = nivelArreglarObjetos;
    }

    public int getNivelDestructivo() {
        return nivelDestructivo;
    }

    public void setNivelDestructivo(int nivelDestructivo) {
        this.nivelDestructivo = nivelDestructivo;
    }
    
    public void imprimirDatos(){
        System.out.println("Numero de ojos " + numeroOjos);
        System.out.println("Color de piel " + colorPiel);
        System.out.println("Altura " + altura);
        System.out.println("nivelCrearObjetos: " + nivelCrearObjetos);
        System.out.println("nivelArreglarObjetos " + nivelArreglarObjetos);
        System.out.println("nivelDestructivo " + nivelDestructivo);
    }
    
}
