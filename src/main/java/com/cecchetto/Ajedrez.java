package com.cecchetto;


import com.cecchetto.piezas.Color;

import javax.swing.*;
import java.util.ArrayList;

public class Ajedrez extends JFrame {

    public Ajedrez() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Tablero tablero = new Tablero();
        tablero.addPiezas();

        this.add(tablero);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        while (Tablero.reyes.size() == 2) {



        }

    }

}
