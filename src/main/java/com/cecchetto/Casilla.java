package com.cecchetto;

import com.cecchetto.piezas.Pieza;

import javax.swing.*;
import java.awt.*;
import com.cecchetto.piezas.Color;

public class Casilla{

    JButton casilla;
    com.cecchetto.piezas.Color color;
    Pieza pieza;
    public Point punto;
    Boolean casillaMarcada = false;

    public Casilla(Point punto) {
        this.punto = punto;
        casilla = new JButton();
        casilla.setPreferredSize(new Dimension(55, 55));
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));

        casilla.addActionListener( e -> action());
    }

    private void action() {


        if (Tablero.getCasillaMarcada() == this) {
            Tablero.limpiarTablero();
            return;
        }

        if (pieza != null && pieza.getColor().equals(turno)) {
            Tablero.limpiarTablero();
            Tablero.marcarPuntosPosibles(pieza.getPuntosPosibles(punto));
            Tablero.setPiezaMarcada(this);
        }


        if (Tablero.isDibujado() && casillaMarcada) {

            if (pieza != null && !pieza.getColor().equals(turno))
                Tablero.eliminarPieza(this);

            Tablero.moverPieza(punto);
            casillaMarcada = false;


        }


    }

    Color turno;
    public void setTurno(Color turno) {
        this.turno = turno;
    }

    public void limpiarCasilla() {
        casilla.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK));
    }

    public void marcarCasilla() {
        casillaMarcada = true;

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

        if (color.equals(Color.blanca))
            casilla.setBackground(java.awt.Color.WHITE);
        else
            casilla.setBackground(java.awt.Color.BLACK);
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
