package proyectoipc1;
import java.util.Random;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
public int pasaje_peq, pasaje_med, pasaje_grande, cant_maletas, cant_doc, n_turno, turno, contador_avion=1,turnovion;
public static int id_pasajero;
public String cad_peq = "", cad_grande="", cad_med="";
public int  avion_peq=0, avion_med=0, avion_grande=0;
public static int identificador_avion;
public  Controlador controlador;


    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_turnos = new javax.swing.JTextField();
        txt_aviones = new javax.swing.JTextField();
        txt_escritorios = new javax.swing.JTextField();
        txt_registro = new javax.swing.JTextField();
        txt_estaciones = new javax.swing.JTextField();
        txt_servicios = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btt_inicio = new javax.swing.JButton();
        btt_sig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulación");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Turnos para finalizar la simulación:");

        jLabel2.setText("Cantidad de aviones:");

        jLabel3.setText("Cantidad de escritorios de registro:");

        jLabel4.setText("Tamaño de la fila de registro:");

        jLabel5.setText("Cantidad de estaciones de servicio");

        jLabel6.setText("Tamaño de la fila de servicios:");

        txt_turnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_turnosKeyTyped(evt);
            }
        });

        txt_aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_avionesActionPerformed(evt);
            }
        });
        txt_aviones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_avionesKeyTyped(evt);
            }
        });

        txt_escritorios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_escritoriosKeyTyped(evt);
            }
        });

        txt_registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_registroKeyTyped(evt);
            }
        });

        txt_estaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estacionesActionPerformed(evt);
            }
        });
        txt_estaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estacionesKeyTyped(evt);
            }
        });

        txt_servicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_serviciosKeyTyped(evt);
            }
        });

        salida.setEditable(false);
        salida.setBackground(new java.awt.Color(51, 51, 51));
        salida.setColumns(20);
        salida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        salida.setForeground(new java.awt.Color(204, 204, 0));
        salida.setRows(5);
        jScrollPane1.setViewportView(salida);

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel7.setText("Consola de Salida");

        btt_inicio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btt_inicio.setText("Iniciar Simulación");
        btt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inicioActionPerformed(evt);
            }
        });

        btt_sig.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btt_sig.setText(">>");
        btt_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_sigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_registro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txt_escritorios, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_aviones, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_turnos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_estaciones)
                            .addComponent(txt_servicios)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_sig, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_aviones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_escritorios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btt_sig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_estacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estacionesActionPerformed

    private void btt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inicioActionPerformed

        if (txt_turnos.getText().isEmpty() || txt_aviones.getText().isEmpty() || txt_escritorios.getText().isEmpty() || txt_registro.getText().isEmpty() || txt_estaciones.getText().isEmpty() || txt_servicios.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para seguir con la ejecución no debe dejar campos de textos vacios.");
        }
        else{
            btt_inicio.setEnabled(false);
txt_turnos.setEnabled(false);
txt_aviones.setEnabled(false);
txt_escritorios.setEnabled(false);
txt_registro.setEnabled(false);
txt_estaciones.setEnabled(false);
txt_servicios.setEnabled(false);
turno = Integer.parseInt(txt_turnos.getText());
        pasajero();
       // salida.setText(mostrar()+"\n"+probabilidad()+"\n"+pasajero()+"\n"+mantenimiento());
     
     
      controlador = new Controlador(Integer.parseInt(txt_registro.getText()), Integer.parseInt(txt_escritorios.getText()));
     ControladorMaleta maleta = new ControladorMaleta();
     ControladorAvion avion = new ControladorAvion();
     probabilidad();
     
     salida.setText(salida.getText() + mostrar()+ " ");
        for (int k = 0; k < avion_peq; k++) {
        identificador_avion++;  
       
        avion.insertar(identificador_avion, "Desabordo" , turno);
        for (int i = 0; i < pasaje_peq; i++) {
            id_pasajero++;
            
            controlador.insertar(id_pasajero, cant_doc, n_turno, "Aviones pequeños", identificador_avion);
            //Revisar
            int nmaletas;
            nmaletas = (int)(Math.random()*(0-5+1)+5);
            for (int j = 0; j < nmaletas; j++) {
                //Son las maletas que tiene el pasajero
            maleta.insertar(id_pasajero);
            } 
        }
      }
        
        controlador.mostrar();
       
        //copiar desde aqui
        int contavion=0;int idpasajer=0;
        Pasajero[][] pasaggero = controlador.pasajero;
        for (int i = 0; i < pasaggero.length; i++) {
            for (int j = 0; j < pasaggero[i].length; j++) {
                if (pasaggero[i][j]!= null) {
                    
                
                if (pasaggero[i][j].tipo_avion == 1) {
                    idpasajer = pasaggero[i][j].getId();
                  Maleta[] male = ControladorMaleta.maleta;
                  
        int contador=0; 
        for (int h = 0; h < male.length; h++) {
            if (male[h] !=null) {
                if (male[h].getId_pasajero() == idpasajer) {
                    contador++;
                   
                }
                
            }
        }
       // salida.setText(salida.getText() + "\n" + "Número de maletas del cliente: "+idpasajer+" : "+contador+" .Del avion "+pasaggero[i][j].getTipo());
       
            } 
               } 
                //aqui
            }
           
        }
      //hasta qui 
        
        for (int k = 0; k < avion_med; k++) {
            identificador_avion++; 
        
        for (int i = 0; i < pasaje_med; i++) {
            id_pasajero++;
             
       
        avion.insertar(identificador_avion, "Desabordo" , turno);
            controlador.insertar(id_pasajero, cant_doc, n_turno, "Aviones medianos",identificador_avion);
            
            //Revisar cantidad de maletas para el pasajero mediano 
            int nmaletas;
            nmaletas = (int)(Math.random()*(0-5+1)+5);
            for (int j = 0; j < nmaletas; j++) {
                //Son las maletas que tiene el pasajero
            maleta.insertar(id_pasajero);
            }
        }
        controlador.mostrar();
        int contador1=0; 
       }
        //ha
//  Ingreso de  las maletas para el pasajero del avion grande        
for (int v = 0; v < avion_grande; v++) {
            identificador_avion++; 
       
        for (int i = 0; i < pasaje_grande; i++) {
            id_pasajero++;
             
        
        avion.insertar(identificador_avion, "Desabordo" , turno);
            controlador.insertar(id_pasajero, cant_doc, n_turno, "Aviones grande", identificador_avion);
            int nmaletas;
            nmaletas = (int)(Math.random()*(0-5+1)+5);
            for (int j = 0; j < nmaletas; j++) {
                //Son las maletas que tiene el pasajero
            maleta.insertar(id_pasajero);
            }
        }
        System.out.println("Si llega aqui");
        controlador.mostrar();
        
        int contador2=0; 
         }

        }

       
        
    }//GEN-LAST:event_btt_inicioActionPerformed

    private void txt_avionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_avionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_avionesActionPerformed

    //Solo acepte numeros en las cajas de texto
    private void txt_turnosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_turnosKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txt_turnosKeyTyped

    private void txt_avionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_avionesKeyTyped
      char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txt_avionesKeyTyped

    private void txt_escritoriosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_escritoriosKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txt_escritoriosKeyTyped

    private void txt_registroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_registroKeyTyped
       char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txt_registroKeyTyped

    private void txt_estacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estacionesKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_txt_estacionesKeyTyped

    private void txt_serviciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_serviciosKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();// TODO add your handling code here:
    }//GEN-LAST:event_txt_serviciosKeyTyped

    //Botono para finalizar los metodos de los turnos de los aviones
    private void btt_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_sigActionPerformed
      
     salida.setText("");
       salida.setText(salida.getText() + mostrar1()+ " ");
        System.out.println("turno: "+turno);
        System.out.println("Contador acion"+ contador_avion);
        if (turno>1) {
          ControladorAvion avion = new ControladorAvion();
          contador_avion++;
          Avion buscado = avion.Buscar(contador_avion);
          
            if (buscado == null) {
              
                 //copiar desde aqui
        int contavion=0;int idpasajer=0;
        Pasajero[][] pasaggero = controlador.pasajero;
        for (int i = 0; i < pasaggero.length; i++) {
            for (int j = 0; j < pasaggero[i].length; j++) {
                if (pasaggero[i][j]!= null) {
                    
                
                if (pasaggero[i][j].tipo_avion == contador_avion) {
                    idpasajer = pasaggero[i][j].getId();
                  Maleta[] male = ControladorMaleta.maleta;
                  
        int contador=0; 
        for (int h = 0; h < male.length; h++) {
            if (male[h] !=null) {
                if (male[h].getId_pasajero() == idpasajer) {
                    contador++;
                   
                }
                
            }
        }
        salida.setText(salida.getText() + "\n" + "Número de maletas del cliente"+idpasajer+" : "+contador+" .\n       Del avion "+pasaggero[i][j].getTipo());
       
            } 
               } 
                //aqui
            }
           
        }
      //hasta qui 
            }else{
                System.out.println("No se encuentra el dato buscado");
            }
          
        }
        turno--;
    }//GEN-LAST:event_btt_sigActionPerformed

    private String mostrar()
    {
        String datos = "Turnos para"
                + " la simulación: "+ txt_turnos.getText()
                +"\nCantidad de aviones: " +  txt_aviones.getText()
                +"\nEscritorios de registros: " + txt_escritorios.getText()
                +"\nEstaciones de servicios: " +txt_estaciones.getText();
        return datos;
    }
     private String mostrar1()
    {
        //agregar documentos aqui 
        String datos = "Turnos para"
                + " la simulación: "+ contador_avion;
        return datos;
    }
    
    //Metodo para la probabilidad de los aviones.
    public void probabilidad()
            {
               int num = Integer.parseInt(txt_aviones.getText());
               
               for (int i = 0; i < num; i++) {
                 int llega = (int)(Math.random()*(0-101+1)+101);
                   if (llega < 25) {
                       avion_peq++;
                   }
                   else if (llega>=25 && llega < 55) {
                       avion_med++;
                   }
                   else
                   {
                       avion_grande++;
                   }
                }
                System.out.println("No avuoines p: "+avion_peq);
                 System.out.println("No avuoines p: "+avion_med);
                  System.out.println("No avuoines p: "+avion_grande);
                      
            }
    
 private void pasajero()
    {
        /*Interfaz p = new Interfaz();
        p.probabilidad();
      
        int n1, n2, n3;
        n1 = Integer.parseInt(cad_peq);
        n2 = Integer.parseInt(cad_med);
        n3 = Integer.parseInt(cad_grande);
        if (n1!=0) {*/
        pasaje_peq= (int)(Math.random()*(4-11+1)+11);
        //}
        //else if(n2!=0)
        //{
            pasaje_med=(int)(Math.random()*(14-26+1)+26);
        //}
        //else if (n3!=0) {
            pasaje_grande = (int)(Math.random()*(29-41+1)+41);
        //}else
        //{ 
            //String pasaje = "No hay arribos de aviones grandes para la simulación";
        //}
       
        
    }
 
 private void desabordaje()
 {
     int des_peq=1, des_med=2, des_grande=3;
 }
 
 private String mantenimiento()
 {
     int man_peq, man_med, man_grande;
     
     man_peq = (int)(Math.random()*(0-4+1)+4);
     
     man_med=(int)(Math.random()*(1-5+1)+5);
     
     man_grande = (int)(Math.random()*(2-7+1)+7);
     
     String mant ="El mantenimiento por turno para los aviones son de: "
             + "\nPara aviones pequeños es de: "+man_peq
            + "\nPara aviones medianos es de: "+man_med
             +"\nPara aviones grandes es de: "+man_grande;
     
     return mant;
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
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_inicio;
    private javax.swing.JButton btt_sig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea salida;
    private javax.swing.JTextField txt_aviones;
    private javax.swing.JTextField txt_escritorios;
    private javax.swing.JTextField txt_estaciones;
    private javax.swing.JTextField txt_registro;
    private javax.swing.JTextField txt_servicios;
    private javax.swing.JTextField txt_turnos;
    // End of variables declaration//GEN-END:variables
}
