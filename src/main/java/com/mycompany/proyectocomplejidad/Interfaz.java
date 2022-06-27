package com.mycompany.proyectocomplejidad;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import com.mycompany.proyectocomplejidad.FuncionesDispersion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jenny
 */
public class Interfaz extends javax.swing.JFrame implements ClipboardOwner{
    static String info;
    static String info2;
    static String total;
    String[] informacion;
    static int nKm;
    static int numCiudades;
    
    public Interfaz() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton1.setText("Solucionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton2.setText("Copiar al portapapeles");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("¿Donde Pongo mi academia Imperial?");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Entrada: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setText("Salida (Modelo ejecutable en MiniZinc)");

        jButton3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton3.setLabel("Abrir Minizinc");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //evento que capturá cuando se presiona el botón 1 (Solucionar)
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        info = jTextArea1.getText();
        info = info.replace("\n", ",");
        info = info.replace(" ", ",");
        
        //arreglo que contiene las instancias de las distancias de manhattan 
        //de las ciudades con las variables de posición de la academia.
        String arrayInstanciasManhattan[];
        // array para almacenar las ciudades [ciudad, [x, y]]
        String matrizCiudades[][];
        //array que contiene el nombre de las variables para las distancias
        //de las ciudades
        String arrayNombreVar[];

        informacion = info.split(",");
        //tamaño del area cuadrada NxN;
        nKm=Integer.parseInt(informacion[0]);
        //número de ciudades para la entrada
        numCiudades= Integer.parseInt(informacion[1]);
  
        // se instancia la matriz de ciudades.
        matrizCiudades = crearMatriz(numCiudades);
        //se instancian los nombres de las variables de distancia.
        arrayNombreVar = nombreVariablesCiudades(matrizCiudades);
        // se generan las líneas de código para las variables
        arrayInstanciasManhattan = funcionVariable(matrizCiudades);
        
        FuncionesDispersion f = new FuncionesDispersion(matrizCiudades);
        Interfaz i = new Interfaz();
        total =   "%Constantes\n" + i.constantes(f.dispersionXY) + "\n"
                + "%Posición academia\n" + i.variables() + "\n" 
                + "%Distancias de ciudades a la academias\n" 
                + instanciaDeDistancias(arrayInstanciasManhattan, arrayNombreVar) + "\n" 
                + "%Arreglo de las distancias de las ciudades:\n" 
                + arregloDeDistancias(arrayNombreVar) + "\n" 
                + "%Restricciones de Área\n" + i.restriccionesDeArea(nKm) + "\n" 
                + "%Restricciones de desigualdad\n" + restriccionesDeDesigualdad() + "\n"
                + "%Función Manhattan\n" + i.funcionManhattan() + "\n" 
                + "%z = suma de distancias\n" + i.z(arrayNombreVar) + "\n" 
                + "%%función objetivo, minimizar z.\nsolve minimize z;\n\n" 
                + "%salida:\n" + "output[\"x = \", show(x), \"y = \", show(y),"
                + " \", Distancia mínima = \", show(z)];";
        jTextArea2.setText(total);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setClipboard(jTextArea2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        openMinizinc();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public String constantes(int d){
        return "int: M ="+ numCiudades + "; %Número de ciudades." +"\n" 
                + "int: N ="+ nKm + "; %tamaño del area cuadrada NxN;"  +"\n"
                + "int: d ="+ d + "; %desviación estandar. Necesaria para el mínimo de distancia" +"\n";
    }
    
    public String variables(){
        return "var int: x;\n"
             + "var int: y;\n";
    }
    
    public String instanciaDeDistancias(String arrayInstanciasManhattan[], String arrayNombreVar[]){
        String aux = "";
        for(int i = 0; i < arrayInstanciasManhattan.length; i++){
            aux+= "var int: " + arrayNombreVar[i] + " = " + arrayInstanciasManhattan[i] +";\n";
        }
        return aux;
    }
    
    public String arregloDeDistancias(String arrayNombreVar[]){
        String aux = "";
        for(int i = 0; i < arrayNombreVar.length; i++){
            if(i==0){
                aux += "array[1..M] of var int: distancias =\n"
                      +"[" + arrayNombreVar[i] + "\n";
            }else if(i==(arrayNombreVar.length-1)){
                aux+= "," + arrayNombreVar[i] + "];\n";
            }else{
                aux+= "," + arrayNombreVar[i] + "\n";
            }
        }
        return aux;
    }
    
    public String restriccionesDeArea(int n){
        return "constraint x >= 0;\n"
             + "constraint y >= 0;\n" 
             + "constraint x <=N;\n"
             + "constraint y <=N;\n";
    }
    
    public String restriccionesDeDesigualdad(){
        String aux= "constraint forall(i in 1..M)(\n" +
                    "  forall(j in 1..M)(\n" +
                    "    distancias[i] <= distancias[j]+d\n" +
                    "  )\n"
                    + ");\n";
        return aux;
    }
    
    public String funcionManhattan(){
         return "function var int: manhattan(var int: x1, var int: y1,var int: x2, var int: y2)\n"
               + "= abs(x1 - x2) + abs(y1 - y2);\n";
    }
    
    public String z(String array[]){
        String z = "var int: z = ";
        for(int i = 0; i < array.length; i++){
            z+= array[i]; 
            if(i+1 != array.length){
                z += " +\n";
            }else {z += ";\n";}
        }
        return z;
        //"solve minimize z;"
    }
    
    public String[] nombreVariablesCiudades(String matrizCiudades[][]){
        String arrayAux[];
        arrayAux = new String[matrizCiudades.length];
        for(int i = 0; i < matrizCiudades.length; i++ ){
            arrayAux[i] = "distancia_" + matrizCiudades[i][0] + "_academia";
        }
        return arrayAux;
    }
     
    public String[] funcionVariable(String matrizCiudades[][]){
         String arrayAux[];
         arrayAux = new String[matrizCiudades.length];
         for(int i = 0; i < matrizCiudades.length; i++ ){           
             arrayAux[i]="manhattan(" + matrizCiudades[i][1] + "," + matrizCiudades[i][2] + "," + "x,y)";
             System.err.println("hola");
             System.err.println(arrayAux[i]);
         }
         
         return arrayAux;
    }
     
    public String[][] crearMatriz(int n){
        String matriz[][];
        int count =2;
        matriz = new String[numCiudades][3];
        for(int i = 0; i < n; i++ ){
            for(int j= 0; j<3 ; j++ ){
                matriz[i][j]= informacion[count];
                count++;
                System.out.println(matriz[i][j]);
            }
        }
        
        return matriz;
    }
   
    public static void main(String args[]) {
  
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
        //Get txt in TxtArea and copy in clipboard
    public void setClipboard(String text){
        StringSelection txt = new StringSelection(text);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, this);
    }
    
    public void openMinizinc(){
         try {
            String[] parametros = new String[2];
            
            parametros[0] = "C:\\Program Files\\MiniZinc\\MiniZincIDE.exe";
            parametros[1] = System.getProperty("user.dir") + "\\Prueba.mzn"; 
            Process proceso = Runtime.getRuntime().exec(parametros, null);
            
            proceso.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error:" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
