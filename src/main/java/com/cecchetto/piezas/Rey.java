package com.cecchetto.piezas;

import org.example.Util;

import java.awt.*;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class Rey extends Pieza{

    public Rey(Color color) {
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
    public ArrayList<Point> getPuntosPosibles() {
        return null;
    }
}
