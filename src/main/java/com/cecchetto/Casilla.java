package com.cecchetto;

import org.example.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

import static java.awt.Transparency.TRANSLUCENT;

public class Casilla{

    JButton casilla;
    Color color;
    public Casilla() {
        casilla = new JButton();
        casilla.setPreferredSize(new Dimension(55, 55));
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    }

    public void setColor(Color color) {
        this.color = color;
        casilla.setBackground(color);
    }

    public JButton getButton() {
        return casilla;
    }
}
