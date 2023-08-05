package com.cecchetto;

import com.cecchetto.piezas.Color;
import com.cecchetto.piezas.Peon;
import com.cecchetto.piezas.Pieza;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Tablero extends JPanel{
    int width = 8, height = 8;
    Casilla[][] tablero;
    ArrayList<Pieza> piezasBlancas;
    ArrayList<Pieza> piezasNegras;
    public Tablero() {
        this.setLayout(new GridLayout(width, height));

        tablero = new Casilla[width][height];
        for (int x=0 ; x<width ; x++) {
            for (int y=0 ; y<height ; y++) {
                tablero[x][y] = new Casilla();

                if ((x+y)%2 == 0)
                    tablero[x][y].setColor(Color.blanca);
                else
                    tablero[x][y].setColor(Color.negra);

                this.add(tablero[x][y].getButton());
            }
        }

    }

    public void addPieza(Pieza pieza) {

    }

}
