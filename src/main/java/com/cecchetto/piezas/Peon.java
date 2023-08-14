package com.cecchetto.piezas;

import com.cecchetto.Ajedrez;
import com.cecchetto.Tablero;
import org.example.Util;

import java.awt.*;
import java.net.CookieHandler;
import java.util.ArrayList;

public class Peon extends Pieza{


    public Peon(Color color) {
        super(movimientosPeon);
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

    private static final int[][] movimientosPeon = {  };
    @Override
    public ArrayList<Point> getPuntosPosibles(Point punto) {
        ArrayList<Point> puntos = new ArrayList<>();

        int posicion = (color.equals(Color.blanca)) ? 6 : 1;
        int direccion = (color.equals(Color.blanca)) ? -1 : 1;

        if (!Tablero.tablero[punto.x+direccion][punto.y].isPieza()) {
            puntos.add(new Point(punto.x+direccion, punto.y));
            if (punto.x == posicion && !Tablero.tablero[punto.x+(direccion*2)][punto.y].isPieza())
                puntos.add(new Point(punto.x+(direccion*2), punto.y));
        }

        //Los peones que estan en lso extremos tiran exepciones


            if (Tablero.tablero[punto.x+direccion][punto.y+direccion].isPieza() && !Tablero.tablero[punto.x+direccion][punto.y+direccion].getPieza().getColor().equals(color))
                puntos.add(new Point(punto.x+direccion, punto.y+direccion));

            if (Tablero.tablero[punto.x+direccion][punto.y-direccion].isPieza() && !Tablero.tablero[punto.x+direccion][punto.y-direccion].getPieza().getColor().equals(color))
                puntos.add(new Point(punto.x+direccion, punto.y-direccion));



        return puntos;
    }
}
