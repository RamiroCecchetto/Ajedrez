package com.cecchetto.piezas;

import com.cecchetto.Casilla;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Pieza {

    protected BufferedImage piezaBlancaFondoNegro, piezaBlancaFondoBlanco, PiezaNegraFondoBlanco, piezaNegraFondoNegro;
    protected Color color;

    public abstract ArrayList<Point> getPuntosPosibles();

    public BufferedImage getFoto(Color color) {
        BufferedImage retu = null;

        if (this.color.equals(Color.blanca) && color.equals(Color.blanca))
            retu = piezaBlancaFondoBlanco;

        if (this.color.equals(Color.blanca) && color.equals(Color.negra))
            retu = piezaBlancaFondoNegro;

        if (this.color.equals(Color.negra) && color.equals(Color.blanca))
            retu = PiezaNegraFondoBlanco;

        if (this.color.equals(Color.negra) && color.equals(Color.negra))
            retu = piezaNegraFondoNegro;

        return retu;

    }


}
