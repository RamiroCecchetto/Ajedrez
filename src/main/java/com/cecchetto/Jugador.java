package com.cecchetto;

import com.cecchetto.piezas.Color;
import com.cecchetto.piezas.Pieza;

import javax.swing.*;
import java.awt.*;

public class Jugador  {

    JPanel panel;
    JFrame frame;
    public Jugador(Color color) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String jugador = JOptionPane.showInputDialog("Quien juega para las "+ (color.equals(Color.blanca) ? "blancas" : "negras") +" :");
        if (jugador == null)
            System.exit(0);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel jugadorLbl = new JLabel(jugador + " :");
        jugadorLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(jugadorLbl);

        frame.setSize(new Dimension(133, 100));
        frame.setTitle(color.name() + "s");
        frame.add(panel);
        frame.setVisible(true);
    }

    public void addPieza(Pieza pieza) {
        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon(pieza.getFoto(Color.blanca)));
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lbl);

        frame.pack();

    }

}
