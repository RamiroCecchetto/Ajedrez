package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class Rey extends Pieza{

    private static final int[][] movimientosRey = {    };

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

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();



        return puntos;
    }

}
