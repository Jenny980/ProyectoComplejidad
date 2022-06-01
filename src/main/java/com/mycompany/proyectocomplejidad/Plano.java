package com.mycompany.proyectocomplejidad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Plano extends JPanel {
    
    int n =10;
    int limiteHV = 450;
    int n_porcentaje = limiteHV/n;
    String matrizCiudades[][];
    
    Plano(){
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Pintar las lineas del plano.
        g.setColor (new Color(168,165,165));
        for (int i = 0; i < n; i++){
            g.drawLine (0, (int) Math.floor(limiteHV - (i*n_porcentaje)), limiteHV, (int) Math.floor(limiteHV - (i*n_porcentaje)));
            g.drawLine ((int) Math.floor(limiteHV - (i*n_porcentaje)), 0, (int) Math.floor(limiteHV - (i*n_porcentaje)), limiteHV);
        }
        
        
        //Graphics2D g2d = (Graphics2D) g;
        //g2d.drawOval(150, 150, 100, 100);
    }
}