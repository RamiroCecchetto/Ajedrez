package com.cecchetto.piezas;

import com.cecchetto.Casilla;
import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Torre extends Pieza{

    public Torre(Color color) {
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/torre/torreBlanca_casillaBlanca.png");
            this.piezaBlancaFondoNegro = Util.getImage("piezas/torre/torreBlanca_casillaNegra.png");
        } else  {
            this.piezaNegraFondoNegro = Util.getImage("piezas/torre/torreNegra_casillaNegra.png");
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/torre/torreNegra_casillaBlanca.png");
        }
    }

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();

        for (int y = punto.y + 1; y < 8; y++) {
            Point nextPoint = new Point(punto.x, y);
            if (Tablero.isInRange(nextPoint) && !Tablero.tablero[nextPoint.x][nextPoint.y].isPieza()) {
                puntos.add(nextPoint);
            } else {
                break;
            }
        }

        for (int y = punto.y - 1; y >= 0; y--) {
            Point nextPoint = new Point(punto.x, y);
            if (Tablero.isInRange(nextPoint) && !Tablero.tablero[nextPoint.x][nextPoint.y].isPieza()) {
                puntos.add(nextPoint);
            } else {
                break;
            }
        }

        for (int x = punto.x + 1; x < 8; x++) {
            Point nextPoint = new Point(x, punto.y);
            if (Tablero.isInRange(nextPoint) && !Tablero.tablero[nextPoint.x][nextPoint.y].isPieza()) {
                puntos.add(nextPoint);
            } else {
                break;
            }
        }

        for (int x = punto.x - 1; x >= 0; x--) {
            Point nextPoint = new Point(x, punto.y);
            if (Tablero.isInRange(nextPoint) && !Tablero.tablero[nextPoint.x][nextPoint.y].isPieza()) {
                puntos.add(nextPoint);
            } else {
                break;
            }
        }

        return puntos;
    }


}
