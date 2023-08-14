package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

import static com.cecchetto.Tablero.tablero;

public class Caballo extends Pieza{

    public Caballo(Color color) {
        super(movimientosCaballo);
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoNegro = Util.getImage("piezas/caballo/caballoBlanco_casillaNegra.png");
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/caballo/caballoBlanco_casillaBlanca.png");
        } else {
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/caballo/caballoNegro_casillaBlanca.png");
            this.piezaNegraFondoNegro = Util.getImage("piezas/caballo/CaballoNegro_casillaNegra.png");
        }

    }

    private static final int[][] movimientosCaballo = {
            {-2, 1}, {-2, -1}, {-1, 2}, {-1, -2},
            {1, 2}, {1, -2}, {2, 1}, {2, -1}
    };

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();
        puntos.add(punto);

        for (int[] movimiento : movimientosCaballo) {
            int x = punto.x + movimiento[0];
            int y = punto.y + movimiento[1];

            if (Tablero.isInRange(new Point(x, y))) {

                if (!Tablero.tablero[x][y].isPieza())
                    puntos.add(new Point(x, y));
                else if (Tablero.tablero[x][y].getPieza().getColor() != Tablero.tablero[punto.x][punto.y].getPieza().getColor())
                    puntos.add(new Point(x, y));

            }
        }

        return puntos;


    }
}
