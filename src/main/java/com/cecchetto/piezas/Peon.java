package com.cecchetto.piezas;

import com.cecchetto.Ajedrez;
import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Peon extends Pieza{
    public Peon(Color color) {
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoNegro = Util.getImage("piezas/peon/peonBlanco_casillaNegra.png");
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/peon/peonBlanco_casillaBlanca.png");
        }
        else {
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/peon/peonNegro_casillaBlanca.png");
            this.piezaNegraFondoNegro = Util.getImage("piezas/peon/peonNegro_casillaNegra.png");
        }

    }

    @Override
    public ArrayList<Point> getPuntosPosibles() {

        

        return null;
    }

}
