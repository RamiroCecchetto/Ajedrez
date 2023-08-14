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
    Point punto;
    Boolean seleccionada = false;

    public Casilla(Point punto) {
        this.punto = punto;
        casilla = new JButton();
        casilla.setPreferredSize(new Dimension(55, 55));
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));

        casilla.addActionListener( e -> action());
    }

    private void action() {

        if (Tablero.isDibujado() && pieza==null && seleccionada) {
            Tablero.moverPieza(punto);
        }
        else {
            if (pieza != null) {
                Tablero.marcarPuntosPosibles(pieza.getPuntosPosibles(punto));
                pieza.setSeleccionada(true);
            }
        }
    }

    public void limpiarCasilla() {
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    }

    public void marcarCasilla() {
        seleccionada = true;

        if (pieza == null)
            casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.YELLOW, 4));
        else
            casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.RED, 4));
    }

    public void removePieza() {
        pieza = null;
        setColor(color);
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
        casilla.setIcon(new ImageIcon(pieza.getFoto(color)));
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setColor(com.cecchetto.piezas.Color color) {
        this.color = color;
        casilla.setIcon(null);

        if (color == com.cecchetto.piezas.Color.blanca)
            casilla.setBackground(Color.WHITE);
        else
            casilla.setBackground(Color.BLACK);
    }

    public Boolean isPieza() {
        return (Tablero.isInRange(punto) && pieza != null);
    }

    public com.cecchetto.piezas.Color getColor() {
        return color;
    }

    public JButton getButton() {
        return casilla;
    }
}
