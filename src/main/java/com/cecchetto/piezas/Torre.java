package com.cecchetto.piezas;

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
    public ArrayList<Point> getPuntosPosibles() {
        return null;
    }
}
