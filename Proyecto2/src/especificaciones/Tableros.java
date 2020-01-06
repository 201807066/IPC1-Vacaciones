
package especificaciones;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import tableros.TableroPane;


public class Tableros extends javax.swing.JFrame {

   
    String Colorcito;
    int X=5,Y=49;
    public Tableros(String Nombre) {
        initComponents();
     
          
        this.setLocationRelativeTo(null);
        String id="",nombre="";
        boolean a=true,b=true;
        for (int i = 0; i < Nombre.length(); i++) {
            String letra = Nombre.charAt(i)+"";
            if (a) {
                if (letra.equalsIgnoreCase(".")) {
                   a=false;
                }else{
                   id= id+letra;
                           }
            }else{
           
                   nombre= nombre+letra;
                         
            }
            
        }
        
        jLabel2.setText(id);
        ActualizarListas();
        jLabel3.setText(nombre);
        ListaTablero lis = new ListaTablero();
        Tablero blis = lis.Buscar(Integer.parseInt(jLabel2.getText()));
        if (blis != null) {
            Color(blis.getColor());
            this.getContentPane().setBackground(Color.decode(Colorcito));
            System.out.println("Cambia de Color");
        }
    }
    public void ActualizarListas(){
        
        Columna cabeza = ListaDobleCircular.cabeza;
        if (cabeza != null) {
           int tabla = Integer.parseInt(jLabel2.getText());
            do {
                
                 if (cabeza.getTabla() == tabla) {
                 JPanel panel = new JPanel();
           
            panel.setSize(312, 652);
          panel.setLocation(X, Y);
          
          X = X+325;
          GroupLayout jPanelLayout = new GroupLayout(panel);
          panel.setLayout(jPanelLayout);
          jPanelLayout.setHorizontalGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 380, Short.MAX_VALUE));
          jPanelLayout.setVerticalGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 278, Short.MAX_VALUE));
        
          
          JLabel titulo = new JLabel(cabeza.getIdentificador()+"."+cabeza.getNombre());
          titulo.setSize(300,30);
          titulo.setLocation(2,2);
          
          JButton btn1 = new JButton(cabeza.getIdentificador()+"");
          btn1.setSize(50,30);
          btn1.setLocation(255, 35);
          ImageIcon imagen = new ImageIcon("img/anadir.png");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(btn1.getWidth(), btn1.getHeight(), Image.SCALE_DEFAULT));
        btn1.setIcon(icono);
        
          JButton eliminar = new JButton("X");
          eliminar.setSize(35,35);
          eliminar.setLocation(275, 0);
          
          JButton btn2 = new JButton(cabeza.getIdentificador()+"");
          btn2.setSize(50,30);
          btn2.setLocation(200, 35);
           ImageIcon imagen1 = new ImageIcon("img/cheque.png");
          ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(btn2.getWidth(), btn2.getHeight(), Image.SCALE_DEFAULT));
          btn2.setIcon(icono1);
         
          JList lista = new JList();
          lista.setBounds(10, 63, 292, 583);
           DefaultListModel modeloLista = new DefaultListModel();
                        lista.setModel(modeloLista);
          listas liss = cabeza.getCabeza();
          String tipo = cabeza.getTipo();
          if (tipo.equalsIgnoreCase("Pila")) {
              if (liss != null) {
                   do {
                    if (liss.getListapertenece() == cabeza.getIdentificador()) {
                       
                        String arreglo = liss.getIdtarjeta()+"."+liss.getTitulo();
                        modeloLista.addElement(arreglo);
                     lista.addMouseListener(new java.awt.event.MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                boolean a=true,b=true;
                                String id="",id1="";
                                for (int i = 0; i < titulo.getText().length(); i++) {
                                    String letra = titulo.getText().charAt(i)+"";
                                    if (a) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            a=false;
                                        }else{
                                        id = id+letra;
                                        }
                                    }
                                }
                                ListaDobleCircular nod = new ListaDobleCircular();
                                Columna bnod = nod.Buscar(Integer.parseInt(id));
                                String idlistas = lista.getSelectedValue()+"";
                                for (int i = 0; i < idlistas.length(); i++) {
                                    String letra = idlistas.charAt(i)+"";
                                    if (b) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            b=false;
                                        }else{
                                        id1 = id1+letra;
                                        }
                                    }
                                }
                                //tipo de lista
                                int clave = Integer.parseInt(id1);
                                if (bnod != null) {
                                    listas ca = bnod.getCabeza();
                                    if (ca != null) {
                                          do {
                                              if (clave == ca.getIdtarjeta()) {
                                                  JOptionPane.showMessageDialog(null, ca.getDatos(), ""+lista.getSelectedValue(), JOptionPane.DEFAULT_OPTION);
                                              }
                                              
                                        ca = ca.getSiguiente();
                                    } while (ca != null);
                                    }
                                  
                                    
                                
                                }
                                
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                               
                            }
                        });
                        
                    }
                    
                  liss = liss.getSiguiente();
              } while (liss != null);
              }
               
              
            }else if (tipo.equalsIgnoreCase("Cola")) {
                if (liss != null) {
                   do {
                    if (liss.getListapertenece() == cabeza.getIdentificador()) {
                       
                        String arreglo = liss.getIdtarjeta()+"."+liss.getTitulo();
                        modeloLista.addElement(arreglo);
                     lista.addMouseListener(new java.awt.event.MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                boolean a=true,b=true;
                                String id="",id1="";
                                for (int i = 0; i < titulo.getText().length(); i++) {
                                    String letra = titulo.getText().charAt(i)+"";
                                    if (a) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            a=false;
                                        }else{
                                        id = id+letra;
                                        }
                                    }
                                }
                                ListaDobleCircular nod = new ListaDobleCircular();
                                Columna bnod = nod.Buscar(Integer.parseInt(id));
                                String idlistas = lista.getSelectedValue()+"";
                                for (int i = 0; i < idlistas.length(); i++) {
                                    String letra = idlistas.charAt(i)+"";
                                    if (b) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            b=false;
                                        }else{
                                        id1 = id1+letra;
                                        }
                                    }
                                }
                                //tipo de lista
                                int clave = Integer.parseInt(id1);
                                if (bnod != null) {
                                    listas ca = bnod.getCabeza();
                                    if (ca != null) {
                                          do {
                                              if (clave == ca.getIdtarjeta()) {
                                                  JOptionPane.showMessageDialog(null, ca.getDatos(), ""+lista.getSelectedValue(), JOptionPane.DEFAULT_OPTION);
                                              }
                                              
                                        ca = ca.getSiguiente();
                                    } while (ca != null);
                                    }
                                  
                                    
                                
                                }
                                
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                               
                            }
                        });
                        
                    }
                    
                  liss = liss.getSiguiente();
              } while (liss != null);
              }
            }else if (tipo.equalsIgnoreCase("Lista Doblemente Enlazada")) {
               if (liss != null) {
                   do {
                    if (liss.getListapertenece() == cabeza.getIdentificador()) {
                       
                        String arreglo = liss.getIdtarjeta()+"."+liss.getTitulo();
                        modeloLista.addElement(arreglo);
                     lista.addMouseListener(new java.awt.event.MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                boolean a=true,b=true;
                                String id="",id1="";
                                for (int i = 0; i < titulo.getText().length(); i++) {
                                    String letra = titulo.getText().charAt(i)+"";
                                    if (a) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            a=false;
                                        }else{
                                        id = id+letra;
                                        }
                                    }
                                }
                                ListaDobleCircular nod = new ListaDobleCircular();
                                Columna bnod = nod.Buscar(Integer.parseInt(id));
                                String idlistas = lista.getSelectedValue()+"";
                                for (int i = 0; i < idlistas.length(); i++) {
                                    String letra = idlistas.charAt(i)+"";
                                    if (b) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            b=false;
                                        }else{
                                        id1 = id1+letra;
                                        }
                                    }
                                }
                                //tipo de lista
                                int clave = Integer.parseInt(id1);
                                if (bnod != null) {
                                    listas ca = bnod.getCabeza();
                                    if (ca != null) {
                                          do {
                                              if (clave == ca.getIdtarjeta()) {
                                                  JOptionPane.showMessageDialog(null, ca.getDatos(), ""+lista.getSelectedValue(), JOptionPane.DEFAULT_OPTION);
                                              }
                                              
                                        ca = ca.getSiguiente();
                                    } while (ca != null);
                                    }
                                  
                                    
                                
                                }
                                
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                               
                            }
                        });
                        
                    }
                    
                  liss = liss.getSiguiente();
              } while (liss != null);
              }
            }else if (tipo.equalsIgnoreCase("Doble Circular")) {
               if (liss != null) {
                   do {
                    if (liss.getListapertenece() == cabeza.getIdentificador()) {
                       
                        String arreglo = liss.getIdtarjeta()+"."+liss.getTitulo();
                        modeloLista.addElement(arreglo);
                     lista.addMouseListener(new java.awt.event.MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                boolean a=true,b=true;
                                String id="",id1="";
                                for (int i = 0; i < titulo.getText().length(); i++) {
                                    String letra = titulo.getText().charAt(i)+"";
                                    if (a) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            a=false;
                                        }else{
                                        id = id+letra;
                                        }
                                    }
                                }
                                ListaDobleCircular nod = new ListaDobleCircular();
                                Columna bnod = nod.Buscar(Integer.parseInt(id));
                                String idlistas = lista.getSelectedValue()+"";
                                for (int i = 0; i < idlistas.length(); i++) {
                                    String letra = idlistas.charAt(i)+"";
                                    if (b) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            b=false;
                                        }else{
                                        id1 = id1+letra;
                                        }
                                    }
                                }
                               //tipo de lista
                                int clave = Integer.parseInt(id1);
                                if (bnod != null) {
                                    listas ca = bnod.getCabeza();
                                    if (ca != null) {
                                          do {
                                              if (clave == ca.getIdtarjeta()) {
                                                  JOptionPane.showMessageDialog(null, ca.getDatos(), ""+lista.getSelectedValue(), JOptionPane.DEFAULT_OPTION);
                                              }
                                              
                                        ca = ca.getSiguiente();
                                    } while (ca != null);
                                    }
                                  
                                    
                                
                                }
                                
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                               
                            }
                        });
                        
                    }
                    
                  liss = liss.getSiguiente();
              } while (liss != null);
              }
            }
          
          btn1.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                AnadirTarjeta nF = new AnadirTarjeta(jLabel2.getText(), btn1.getText());
                nF.setVisible(true);
                dispose();
              
                
            }
        });
           btn2.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaDobleCircular cumplir = new ListaDobleCircular();
                int cumplo = JOptionPane.showConfirmDialog(null, "Esta Seguro de Terminar con la tarea");
                if (cumplo == 0) {
                     cumplir.Realizado(Integer.parseInt(btn2.getText()));
                     Tableros nf = new Tableros(jLabel2.getText());
                     nf.setVisible(true);
                     dispose();
                }
               
              
                
            }
        });
           eliminar.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                  boolean a=true,b=true;
                                String id="",id1="";
                                for (int i = 0; i < titulo.getText().length(); i++) {
                                    String letra = titulo.getText().charAt(i)+"";
                                    if (a) {
                                        if (letra.equalsIgnoreCase(".")) {
                                            a=false;
                                        }else{
                                        id = id+letra;
                                        }
                                    }
                                }
                                ListaDobleCircular nod = new ListaDobleCircular();
                                Columna bnod = nod.Buscar(Integer.parseInt(id));
                                if (bnod != null) {
                                    int input = JOptionPane.showConfirmDialog(null, "Dedea Eliminar la Columna: ");
                                    if (input == 0) {
                                         nod.eliminar(bnod.getIdentificador());
                                          Tableros nF = new Tableros(jLabel2.getText());
                                          nF.setVisible(true);
                                         dispose();
                                    }
                                   
                    
                }
                                
              
              
                
            }
        });
          panel.add(titulo);
          panel.add(btn1);
          panel.add(btn2);
          panel.add(lista);
          panel.add(eliminar);
          jPanel2.add(panel);
          
            }
           
          
            cabeza = cabeza.getSiguiente();
            
        } while (cabeza != ListaDobleCircular.cabeza);
        }
        
        
        
         
   
    }
public  void Color(String nombre){
      
        if (nombre.equalsIgnoreCase("Rojo")) {
           Colorcito = "#CB4335";
        }else  if (nombre.equalsIgnoreCase("Azul")) {
            Colorcito = "#1F618D";
        }else if (nombre.equalsIgnoreCase("Amarillo ")) {
            Colorcito = "#F1C40F";
        }else if (nombre.equalsIgnoreCase("verde")) {
            Colorcito = "#52BE80";
        }else if (nombre.equalsIgnoreCase("Celeste")) {
            Colorcito = "#85C1E9";
        }else if (nombre.equalsIgnoreCase("Anaranjado")) {
            Colorcito = "#F5B041";
        }else{
        Colorcito = "#FBFCFC";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setText("Id: ");

        jLabel2.setText("                         ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel3.setText("jLabel3");

        jPanel2.setPreferredSize(new java.awt.Dimension(10000, 703));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9699, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(688, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel2);

        jButton3.setText("+ Agregar Lista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<<Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar Tablero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(388, 388, 388)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(9, 9, 9)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AgregarLista nf = new AgregarLista(jLabel2.getText());
        nf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       TableroPane nf = new TableroPane();
       nf.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int res = JOptionPane.showConfirmDialog(null, "Esta Seguro de Eliminar el Tablero");
        if (res == 0) {
            ListaTablero lis = new ListaTablero();
            lis.Eliminar(Integer.parseInt(jLabel2.getText()));
             TableroPane nf = new TableroPane();
       nf.setVisible(true);
       dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tableros("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
