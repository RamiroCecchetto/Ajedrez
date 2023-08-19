package com.cecchetto;

import com.cecchetto.piezas.*;

import com.cecchetto.piezas.Color;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tablero extends JPanel{
    static int width = 8, height = 8;
    public static Casilla[][] tablero;
    public static Boolean dibujado = false;
    public static ArrayList<Pieza> reyes;

    public Tablero() {
        this.setLayout(new GridLayout(width, height));
        tablero = new Casilla[width][height];
        reyes = new ArrayList<>();

        for (int x=0 ; x<width ; x++) {
            for (int y=0 ; y<height ; y++) {

                if ((x+y)%2 == 0)
                    tablero[x][y] = new Casilla(new Point(x, y), Color.blanca);
                else
                    tablero[x][y] = new Casilla(new Point(x, y), Color.negra);

                this.add(tablero[x][y].getButton());
            }
        }

        reyes.add(new Rey(Color.blanca));
        reyes.add(new Rey(Color.negra));

    }

    public static void moverPieza(Point llegada) {

        tablero[llegada.x][llegada.y].setPieza(casillaMarcada.getPieza());
        tablero[casillaMarcada.punto.x][casillaMarcada.punto.y].removePieza();
        casillaMarcada = null;

        limpiarTablero();
        dibujado = false;

    }

    public void setTurno(Color turno) {
        for (Casilla[] casillas : tablero)
            for (Casilla casilla : casillas)
                casilla.setTurno(turno);

    }

    public static void eliminarPieza(Casilla casilla) {
        tablero[casilla.punto.x][casilla.punto.y].removePieza();
    }

    static Casilla casillaMarcada;
    public static void setPiezaMarcada(Casilla casilla) {
        casillaMarcada = casilla;
    }

    public static Casilla getCasillaMarcada() {
        return casillaMarcada;
    }

    public static void limpiarTablero() {

        for (Casilla[] casillas : tablero)
            for (Casilla casilla : casillas)
                casilla.limpiarCasilla();

        dibujado = false;
        casillaMarcada = null;
    }

    public static void marcarPuntosPosibles(ArrayList<Point> puntos) {
        if (puntos.isEmpty())
            return;

        dibujado = true;

        for (Point punto : puntos)
                tablero[punto.x][punto.y].marcarCasilla();

    }

    public static boolean isInRange(Point punto) {
        return (punto.x >= 0) && (punto.x < width) && (punto.y >= 0) && (punto.y < height);
    }

    public static Boolean isDibujado() {
        return dibujado;
    }


    public void addPiezas() {
        tablero[6][0].setPieza(new Peon(Color.blanca));     tablero[7][0].setPieza(new Torre(Color.blanca));
        tablero[6][1].setPieza(new Peon(Color.blanca));     tablero[7][1].setPieza(new Caballo(Color.blanca));
        tablero[6][2].setPieza(new Peon(Color.blanca));     tablero[7][2].setPieza(new Alfil(Color.blanca));
        tablero[6][3].setPieza(new Peon(Color.blanca));     tablero[7][3].setPieza(new Reina(Color.blanca));
        tablero[6][4].setPieza(new Peon(Color.blanca));     tablero[7][4].setPieza(reyes.get(0));
        tablero[6][5].setPieza(new Peon(Color.blanca));     tablero[7][5].setPieza(new Alfil(Color.blanca));
        tablero[6][6].setPieza(new Peon(Color.blanca));     tablero[7][6].setPieza(new Caballo(Color.blanca));
        tablero[6][7].setPieza(new Peon(Color.blanca));     tablero[7][7].setPieza(new Torre(Color.blanca));

        tablero[1][0].setPieza(new Peon(Color.negra));     tablero[0][0].setPieza(new Torre(Color.negra));
        tablero[1][1].setPieza(new Peon(Color.negra));     tablero[0][1].setPieza(new Caballo(Color.negra));
        tablero[1][2].setPieza(new Peon(Color.negra));     tablero[0][2].setPieza(new Alfil(Color.negra));
        tablero[1][3].setPieza(new Peon(Color.negra));     tablero[0][3].setPieza(reyes.get(1));
        tablero[1][4].setPieza(new Peon(Color.negra));     tablero[0][4].setPieza(new Reina(Color.negra));
        tablero[1][5].setPieza(new Peon(Color.negra));     tablero[0][5].setPieza(new Alfil(Color.negra));
        tablero[1][6].setPieza(new Peon(Color.negra));     tablero[0][6].setPieza(new Caballo(Color.negra));
        tablero[1][7].setPieza(new Peon(Color.negra));     tablero[0][7].setPieza(new Torre(Color.negra));

//        tablero[4][5].setPieza(new Rey(Color.blanca));
//        tablero[4][4].setPieza(new Caballo(Color.negra));
//        tablero[3][5].setPieza(new Torre(Color.blanca));

    }

}
