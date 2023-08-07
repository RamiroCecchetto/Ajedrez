package com.cecchetto.piezas;

import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Alfil extends Pieza{

    public Alfil(Color color) {
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
        return null;
    }
}
