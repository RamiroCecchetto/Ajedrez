package com.cecchetto;

import javax.swing.*;
import java.awt.*;

import static java.awt.Transparency.TRANSLUCENT;

public class Casilla{

    JButton casilla;
    public Casilla() {
        casilla = new JButton();
        casilla.setPreferredSize(new Dimension(60, 60));
        casilla.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }

    public JButton getButton() {
        return casilla;
    }
}
