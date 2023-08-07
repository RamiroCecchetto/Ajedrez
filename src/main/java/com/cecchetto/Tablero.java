package com.cecchetto;

import com.cecchetto.piezas.*;

import com.cecchetto.piezas.Color;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tablero extends JPanel{
    static int width = 8, height = 8;
    public static Casilla[][] tablero;
    ArrayList<Pieza> piezas;
    public Tablero() {
        this.setLayout(new GridLayout(width, height));
        tablero = new Casilla[width][height];

        for (int x=0 ; x<width ; x++) {
            for (int y=0 ; y<height ; y++) {
                tablero[x][y] = new Casilla(new Point(x, y));

                if ((x+y)%2 == 0)
                    tablero[x][y].setColor(Color.blanca);
                else
                    tablero[x][y].setColor(Color.negra);

                this.add(tablero[x][y].getButton());
            }
        }
    }

    public static void marcarPuntosPosibles(ArrayList<Point> puntos) {

        for (Point punto : puntos) {
            tablero[punto.x][punto.y].getButton().setBorder(BorderFactory.createLineBorder(java.awt.Color.YELLOW, 4));
        }

    }

    public static Boolean isInRange(Point punto) {
        return ( (punto.x>0) && (punto.x<width) && (punto.y>0) && (punto.y<height) );
    }

    public void addPiezas() {
        tablero[6][0].setPieza(new Peon(Color.blanca));     tablero[7][0].setPieza(new Torre(Color.blanca));
        tablero[6][1].setPieza(new Peon(Color.blanca));     tablero[7][1].setPieza(new Caballo(Color.blanca));
        tablero[6][2].setPieza(new Peon(Color.blanca));     tablero[7][2].setPieza(new Alfil(Color.blanca));
        tablero[6][3].setPieza(new Peon(Color.blanca));     tablero[7][3].setPieza(new Dama(Color.blanca));
        tablero[6][4].setPieza(new Peon(Color.blanca));     tablero[7][4].setPieza(new Rey(Color.blanca));
        tablero[6][5].setPieza(new Peon(Color.blanca));     tablero[7][5].setPieza(new Alfil(Color.blanca));
        tablero[6][6].setPieza(new Peon(Color.blanca));     tablero[7][6].setPieza(new Caballo(Color.blanca));
        tablero[6][7].setPieza(new Peon(Color.blanca));     tablero[7][7].setPieza(new Torre(Color.blanca));

        tablero[1][0].setPieza(new Peon(Color.negra));     tablero[0][0].setPieza(new Torre(Color.negra));
        tablero[1][1].setPieza(new Peon(Color.negra));     tablero[0][1].setPieza(new Caballo(Color.negra));
        tablero[1][2].setPieza(new Peon(Color.negra));     tablero[0][2].setPieza(new Alfil(Color.negra));
        tablero[1][3].setPieza(new Peon(Color.negra));     tablero[0][3].setPieza(new Rey(Color.negra));
        tablero[1][4].setPieza(new Peon(Color.negra));     tablero[0][4].setPieza(new Dama(Color.negra));
        tablero[1][5].setPieza(new Peon(Color.negra));     tablero[0][5].setPieza(new Alfil(Color.negra));
        tablero[1][6].setPieza(new Peon(Color.negra));     tablero[0][6].setPieza(new Caballo(Color.negra));
        tablero[1][7].setPieza(new Peon(Color.negra));     tablero[0][7].setPieza(new Torre(Color.negra));

        tablero[4][4].setPieza(new Torre(Color.blanca));

    }

}
