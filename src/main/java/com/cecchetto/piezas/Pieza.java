package com.cecchetto.piezas;

import com.cecchetto.Tablero;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Pieza {

    protected BufferedImage piezaBlancaFondoNegro, piezaBlancaFondoBlanco, PiezaNegraFondoBlanco, piezaNegraFondoNegro;
    protected Color color;
    private int[][] movimientos;
    private Boolean seleccionada;

    public abstract ArrayList<Point> getPuntosPosibles(Point punto);

    public Pieza(int[][] movimientos) {

        this.movimientos = movimientos;
        this.seleccionada = false;
    }

    public Color getColor() {
        return color;
    }

    public ArrayList<Point> mover(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();
        puntos.add(punto);

        for (int[] movimiento : movimientos) {
            int x = punto.x + movimiento[0];
            int y = punto.y + movimiento[1];

            while (Tablero.isInRange(new Point(x, y))) {
                if (!Tablero.tablero[x][y].isPieza()) {
                    // Casilla vacía
                    puntos.add(new Point(x, y));
                } else if (Tablero.tablero[x][y].getPieza().getColor() != Tablero.tablero[punto.x][punto.y].getPieza().getColor()) {
                    puntos.add(new Point(x, y));
                    break;
                } else {
                    break;
                }

                x += movimiento[0];
                y += movimiento[1];
            }
        }

        return puntos;
    }

    public Boolean isSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(Boolean bool) {
        this.seleccionada = bool;
    }

    public BufferedImage getFoto(Color color) {
        BufferedImage retu = null;

        if (this.color.equals(Color.blanca) && color.equals(Color.blanca))
            retu = piezaBlancaFondoBlanco;

        if (this.color.equals(Color.blanca) && color.equals(Color.negra))
            retu = piezaBlancaFondoNegro;

        if (this.color.equals(Color.negra) && color.equals(Color.blanca))
            retu = PiezaNegraFondoBlanco;

        if (this.color.equals(Color.negra) && color.equals(Color.negra))
            retu = piezaNegraFondoNegro;

        return retu;

    }


}
