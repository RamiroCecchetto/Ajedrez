package com.cecchetto.piezas;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Pieza {

    BufferedImage piezaBlancaFondoNegro, PiezaBlancaFondoBlanco, PiezaNegraFondoBlanco, piezNegraFondoNegro;
    protected Color color;

    protected abstract ArrayList<Point> getPuntosPosibles();

    public abstract void action();

}
