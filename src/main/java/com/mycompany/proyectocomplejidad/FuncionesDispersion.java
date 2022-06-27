package com.mycompany.proyectocomplejidad;

public final class FuncionesDispersion {
    public double mediaX =0.0;
    public double varianzaX = 0.0;
    public double dispersionX = 0.0;
    public double mediaY =0.0;
    public double varianzaY = 0.0;
    public double dispersionY = 0.0;
    public int dispersionXY = 0;
    
    FuncionesDispersion(String matrizCiudades[][]){
        calcularMedia(matrizCiudades,1);
        calcularMedia(matrizCiudades,2);
        calcularVarianza(matrizCiudades,1);
        calcularVarianza(matrizCiudades,2);
        calcularDispersion(matrizCiudades,1);
        calcularDispersion(matrizCiudades,2);
        this.dispersionXY = (int) (Math.floor(dispersionX)+ Math.floor(dispersionY));
    }

    public void calcularMedia(String matrizCiudades[][], int pos){
        int mediaAux =0;
        for (int i = 0; i < matrizCiudades.length; i++){
            mediaAux+= Integer.parseInt(matrizCiudades[i][pos]);
        }
        
        if(pos==1){
            this.mediaX = mediaAux*1.0/matrizCiudades.length;
        }else{
            this.mediaY = mediaAux*1.0/matrizCiudades.length;
        }
    }
    
    public void calcularVarianza(String matrizCiudades[][], int pos){
        double varianzaAux =0.0;
        for (int i = 0; i < matrizCiudades.length; i++){
            if(pos==1){
                varianzaAux += Math.pow(Integer.parseInt(matrizCiudades[i][1])*1.0 - mediaX, 2);
            }else{
                varianzaAux += Math.pow(Integer.parseInt(matrizCiudades[i][2])*1.0 - mediaY, 2);
            }
        }
        if(pos==1){
            this.varianzaX = varianzaAux*1.0/matrizCiudades.length;
        }else{
            this.varianzaY = varianzaAux*1.0/matrizCiudades.length;
        }
    }
    
    public void calcularDispersion(String matrizCiudades[][], int pos){
        if(pos==1){
            this.dispersionX = Math.sqrt(varianzaX);
        }else{
            this.dispersionY = Math.sqrt(varianzaY);
        }
    }
}
