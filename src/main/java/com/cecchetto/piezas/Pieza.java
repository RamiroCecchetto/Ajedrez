package com.cecchetto.piezas;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Pieza {

    BufferedImage piezaBlancaFondoNegro, piezaBlancaFondoBlanco, PiezaNegraFondoBlanco, piezaNegraFondoNegro;
    protected Color color;

    public abstract ArrayList<Point> getPuntosPosibles();


}
