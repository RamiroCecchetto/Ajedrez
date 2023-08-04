package com.cecchetto;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Tablero extends JPanel{
    int width = 8, height = 8;
    Casilla[][] tablero;
    public Tablero() {
        this.setLayout(new GridLayout(width, height));

        tablero = new Casilla[width][height];
        for (int x=0 ; x<width ; x++) {
            for (int y=0 ; y<height ; y++) {
                tablero[x][y] = new Casilla();

                if ((x+y)%2 == 0)
                    tablero[x][y].setColor(Color.WHITE);
                else
                    tablero[x][y].setColor(Color.BLACK);

                this.add(tablero[x][y].getButton());
            }
        }
    }

}
