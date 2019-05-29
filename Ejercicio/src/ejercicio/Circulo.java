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
public class Circulo implements CaraOso {

    int x, y, alto, ancho;

    @Override
    public int Dimensiones(int x, int y, int ancho, int alto) {
        x = this.x;
        y = this.y;
        ancho = this.ancho;
        alto = this.alto;
        return Dimensiones(x, y, ancho, alto);
    }

}
