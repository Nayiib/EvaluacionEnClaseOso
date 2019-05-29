/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author estudiantes
 */
public class Ojos implements CaraOso {
    int x,y,ancho,alto;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    public Ojos(int x,int y, int ancho, int alto) {
        setX(x);
        setY(y);
        setAncho(ancho);
        setAlto(alto);
    }
    
    @Override
    public int Dimensiones(int x, int y, int ancho, int alto) {
        return Dimensiones(this.x, this.y, this.ancho, this.alto);
    }
    
}
