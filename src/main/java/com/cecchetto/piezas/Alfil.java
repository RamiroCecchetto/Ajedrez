package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Alfil extends Pieza{

    private static final int[][] movimientosAlfil = {
            {1, 1}, {-1, -1}, {-1, 1}, {1, -1}
    };

    public Alfil(Color color) {
        super(movimientosAlfil);
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/alfil/alfilBlanco_casillaBlanca.png");
            this.piezaBlancaFondoNegro = Util.getImage("piezas/alfil/alfilBlanco_casillaNegra.png");
        } else {
            this.piezaNegraFondoNegro = Util.getImage("piezas/alfil/alfilNegro_casillaNegra.png");
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/alfil/alfilNegro_casillaBlanca.png");
        }

    }

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        return mover(punto);
    }



}
