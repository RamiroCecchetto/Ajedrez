package com.cecchetto.piezas;

import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Dama extends Pieza{

    public Dama(Color color) {
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/dama/damaBlanca_casillaBlanca.png");
            this.piezaBlancaFondoNegro = Util.getImage("piezas/dama/damaBlanca_casillaNegra.png");
        } else {
            this.piezaNegraFondoNegro = Util.getImage("piezas/dama/damaNegra_casillaNegra.png");
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/dama/damaNegra_casillaBlanca.png");
        }
    }

    @Override
    public ArrayList<Point> getPuntosPosibles() {
        return null;
    }
}
