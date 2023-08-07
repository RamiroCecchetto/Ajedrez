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

        int[][] movimientosTorre = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        for (int[] movimiento : movimientosTorre) {
            int x = punto.x + movimiento[0];
            int y = punto.y + movimiento[1];

            while (Tablero.isInRange(new Point(x, y)) && !Tablero.tablero[x][y].isPieza()) {
                puntos.add(new Point(x, y));
                x += movimiento[0];
                y += movimiento[1];
            }
        }

        return puntos;
    }



}
