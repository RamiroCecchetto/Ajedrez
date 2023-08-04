package com.cecchetto;

import javax.swing.*;

public class Ajedrez extends JFrame {

    public Ajedrez() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        this.add(new Tablero());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
