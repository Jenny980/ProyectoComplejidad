package com.mycompany.proyectocomplejidad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Plano extends JPanel {
    
    //variables de entrada:
    public int N;
    public int limiteHV;
    public String matrizCiudades[][];
    
    //n_porcentaje: variable real que determina el factor para
    //la posición relativa de elementos dentro del plano (lineas, circulos).
    public double n_porcentaje;
    
    //diametro_relativo: variable real que determina el diametro que tendrán los
    //circulos que representan las ciudades, a partir del tamaño del cuadrado del plano.
    public double diametro_relativo;
    
    Plano(int N, int limiteHV, String matrizCiudades[][]){
        this.N =N;
        this.limiteHV = limiteHV;
        this.matrizCiudades = matrizCiudades;
        //_______________________________________________________
        this.n_porcentaje = limiteHV*1.0/N;
        this.diametro_relativo = 300*1.0/N;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Pintar las lineas del plano.
        g.setColor (new Color(168,165,165));
        for (int i = 0; i < N; i++){
            g.drawLine (0, obtenerPosicionRelativa(i), limiteHV, obtenerPosicionRelativa(i));
            g.drawLine (obtenerPosicionRelativa(i), 0, obtenerPosicionRelativa(i), limiteHV);
        }
        
        Graphics2D ciudad = (Graphics2D) g;
        ciudad.setStroke(new BasicStroke(10.f));
        ciudad.setPaint(Color.blue);
        ciudad.fillOval(obtenerPosicionRelativaCirculo(2,diametro_relativo), 
                obtenerPosicionRelativaCirculo(2,diametro_relativo),
                (int) diametro_relativo, 
                (int) diametro_relativo);
    }
    
    public int obtenerPosicionRelativa(int posicion){
        return (int) Math.floor(posicion*n_porcentaje);
    }
    
    public int obtenerPosicionRelativaCirculo(int posicion, double diametro){
        return (int) Math.floor((posicion*n_porcentaje) - (diametro/2));
    }
}