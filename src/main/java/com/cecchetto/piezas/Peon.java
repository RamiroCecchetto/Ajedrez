package com.cecchetto.piezas;

import com.cecchetto.Ajedrez;
import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.net.CookieHandler;
import java.util.ArrayList;

public class Peon extends Pieza{


    public Peon(Color color) {
        super(movimientosPeon);
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoNegro = Util.getImage("piezas/peon/peonBlanco_casillaNegra.png");
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/peon/peonBlanco_casillaBlanca.png");
        }
        else {
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/peon/peonNegro_casillaBlanca.png");
            this.piezaNegraFondoNegro = Util.getImage("piezas/peon/peonNegro_casillaNegra.png");
        }

    }

    private static final int[][] movimientosPeon = { {1, 1}, {1, -1} };
    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();

        int direccion = (color.equals(Color.blanca)) ? -1 : 1;
        Point casillaFrontal = new Point(punto.x + direccion, punto.y);

        if (Tablero.isInRange(casillaFrontal) && !Tablero.tablero[casillaFrontal.x][casillaFrontal.y].isPieza()) {
            puntos.add(casillaFrontal);

            int posicionInicial = (color.equals(Color.blanca)) ? 6 : 1;
            if (punto.x == posicionInicial) {
                Point casillaDosPasos = new Point(punto.x + 2 * direccion, punto.y);
                if (!Tablero.tablero[casillaDosPasos.x][casillaDosPasos.y].isPieza()) {
                    puntos.add(casillaDosPasos);
                }
            }
        }

        Point[] casillasDiagonales = {
                new Point(punto.x + direccion, punto.y + direccion),
                new Point(punto.x + direccion, punto.y - direccion)
        };

        for (Point casillaDiagonal : casillasDiagonales) {
            if (Tablero.isInRange(casillaDiagonal)) {
                if (Tablero.tablero[casillaDiagonal.x][casillaDiagonal.y].isPieza()
                        && !Tablero.tablero[casillaDiagonal.x][casillaDiagonal.y].getPieza().getColor().equals(color)) {
                    puntos.add(casillaDiagonal);
                }
            }
        }

        return puntos;
    }

}
