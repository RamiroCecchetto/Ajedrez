package com.cecchetto.piezas;

import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.util.ArrayList;

import static com.cecchetto.Tablero.tablero;

public class Caballo extends Pieza{

    public Caballo(Color color) {
        this.color = color;

        if (color == Color.blanca) {
            this.piezaBlancaFondoNegro = Util.getImage("piezas/caballo/caballoBlanco_casillaNegra.png");
            this.piezaBlancaFondoBlanco = Util.getImage("piezas/caballo/caballoBlanco_casillaBlanca.png");
        } else {
            this.PiezaNegraFondoBlanco = Util.getImage("piezas/caballo/caballoNegro_casillaBlanca.png");
            this.piezaNegraFondoNegro = Util.getImage("piezas/caballo/CaballoNegro_casillaNegra.png");
        }

    }

    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();



        return puntos;
    }
}
