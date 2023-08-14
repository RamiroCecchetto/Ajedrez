package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class Rey extends Pieza{

    public Rey(Color color) {
        super(movimientosRey);
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/rey/reyBlanco_casillaBlanca.png");
            this.piezaBlancaFondoNegro = Util.getImage("piezas/rey/reyBlanco_casillaNegra.png");
        } else  {
            this.piezaNegraFondoNegro = Util.getImage("piezas/rey/reyNegro_casillaNegra.png");
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/rey/reyNegro_casillaBlanca.png");
        }

    }

    private static final int[][] movimientosRey = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0},
            {1, 1}, {-1, 1}, {1, -1}, {-1, -1}
    };

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();

        for (int [] movimiento : movimientosRey) {
            int x = punto.x + movimiento[0];
            int y = punto.y + movimiento[1];

            if (Tablero.tablero[x][y].isPieza() && !Tablero.tablero[x][y].getPieza().getColor().equals(color))
                puntos.add(new Point(x, y));

            if (!Tablero.tablero[x][y].isPieza())
                puntos.add(new Point(x, y));


        }

        return puntos;
    }

}
