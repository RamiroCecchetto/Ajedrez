package com.cecchetto;

import com.cecchetto.piezas.Pieza;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Casilla{

    JButton casilla;
    com.cecchetto.piezas.Color color;
    Pieza pieza;
//    Pieza pieza;
    public Casilla() {
        casilla = new JButton();
        casilla.setPreferredSize(new Dimension(55, 55));
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    }

    public void setPieza(Pieza pieza) {

    }

    public void setColor(com.cecchetto.piezas.Color color) {
        this.color = color;

        if (color == com.cecchetto.piezas.Color.blanca)
            casilla.setBackground(Color.WHITE);
        else
            casilla.setBackground(Color.BLACK);
    }

    public JButton getButton() {
        return casilla;
    }
}
