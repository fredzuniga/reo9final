
package reto9;

public class Pelota {
    public String color;
    private int rapidez;
    private int poder;

    public Pelota(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    public Pelota() {
    }
    
    public void disminuirRapidez(){
        rapidez--;
    }
    
    public void aumentarPoder(){
        poder--;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
}
