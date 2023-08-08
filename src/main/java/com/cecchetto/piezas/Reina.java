package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

public class Reina extends Pieza{

    public Reina(Color color) {
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/reina/reinaBlanca_casillaBlanca.png");
            this.piezaBlancaFondoNegro = Util.getImage("piezas/reina/reinaBlanca_casillaNegra.png");
        } else {
            this.piezaNegraFondoNegro = Util.getImage("piezas/reina/reinaNegra_casillaNegra.png");
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/reina/reinaNegra_casillaBlanca.png");
        }
    }

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();



        return puntos;
    }
}
