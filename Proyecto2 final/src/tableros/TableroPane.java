package tableros;
import colaboradores.ListaDoble;
import colaboradores.NodoDoble;
import com.itextpdf.text.Document;
import especificaciones.Tablero;
import home.Home;
import javax.swing.JOptionPane;
import especificaciones.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TableroPane extends javax.swing.JFrame {
    String Colorcito="";
    public TableroPane() {
        initComponents();
        transparencia();
        this.setLocationRelativeTo(null);
        Tablero cabeza = ListaTablero.cabeza;
        if (cabeza!=null) {
             try {
                 FileOutputStream archivo = new FileOutputStream("D:\\Escritorio\\Proyecto2 final\\tablas\\grafos2.txt");
        Document documento = new Document();
        String texto="texto";
        documento.open();
        PrintStream p;
        p= new PrintStream(archivo);
        p.println("digraph G");
        p.println("{");
        p.println("node[shape=record];");
        p.println("graph[pencolor=transparent];");
        p.println("rankdir=LR;");
        p.println("node [fontname=\"Arial\"];");
           Tablero nodo = cabeza;
            if (nodo != null) {
               
                
               p.println("edge[tailclip=false,arrowtail=dot,dir=both];"); 
               
            
                do {
                         
                         p.println("node_"+nodo.getId()+" [label=\"{{<back>}|{id: "+nodo.getId()+"| Nombre: "+nodo.getNombre()+"| Color: "+nodo.getColor()+"| Tipo: "+nodo.getEstado()+"}|{<next>}}\"];");
                         
                  
                   
                nodo = nodo.getSiguiente();
            } while (nodo != cabeza);
                
                   Tablero nodo1 = cabeza;
                 do {
                    if (nodo1.getSiguiente() == null) {
                        
                    }else{
                      
                    Tablero aux= nodo1.getSiguiente();
                        String siguiente = aux.getId()+"";
                         p.println("node_"+nodo1.getId()+":next:c -> node_"+siguiente+":back:c;");
                         
                    }
                         
                   
                    
                   
                nodo1 = nodo1.getSiguiente();
            } while (nodo1 != cabeza);
               
           
        
        
     
            }
             p.println("}");
             documento.close();
          
        
    }catch (Exception e) {
             System.out.println(""+e);
        }
         abrir();
            
        }
        
        
        //llenar el panel de botones con los tableros 
        int posicionX=0,posicionY=0;
        Tablero cabe = cabeza;
        if (cabe!=null) {
            do {
            JButton tablerito = new JButton();
            tablerito.setBounds( posicionX, posicionY,100,100);
           
            tablerito.setText(cabe.getId()+"."+cabe.getNombre());
            Color(cabe.getColor());
            tablerito.setBackground(Color.decode(Colorcito));
            
            posicionX = posicionX+105;
            if (posicionX>580) {
                posicionY = posicionY+105;
                posicionX=0;
            }
            tablerito.addActionListener(new java.awt.event.ActionListener() {
          
            @Override
            public void actionPerformed(ActionEvent e) {
                Tableros nF = new Tableros(tablerito.getText());
                nF.setVisible(true);
                dispose();
              
                
            }
        });
            jPanel1.add(tablerito);
            cabe = cabe.getSiguiente();
            
        } while (cabe != cabeza); 
        }
       
        
        
        
    }
    public void abrir() {
       
        
         try {
      String dotPath = "D:\\Archivos de programa\\Graphviz\\bin\\dot.exe";
      
      String fileInputPath = "D:\\Escritorio\\Proyecto2 final\\tablas\\grafos2.txt";
      String fileOutputPath = "D:\\Escritorio\\Proyecto2 final\\tablas\\grafos2.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec(cmd);
      
          try {
              
           
            
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Atención",2);
        }
        ImageIcon imagen1 = new ImageIcon("D:\\Escritorio\\Proyecto2 final\\tablas\\grafos2.jpg");
         jLabel2.setSize(imagen1.getIconWidth(), imagen1.getIconHeight());
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(imagen1.getIconWidth(), imagen1.getIconHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono1);
    } catch (Exception ex) {
      ex.printStackTrace();
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
  public void transparencia()
    {
        btt_home.setOpaque(false);
        btt_home.setContentAreaFilled(false);
        btt_home.setBorderPainted(false);
        
        btt_agregar.setOpaque(false);
        btt_agregar.setContentAreaFilled(false);
        btt_agregar.setBorderPainted(false);
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
        btt_home = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btt_agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Hello World");

        btt_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_homeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Imagen de Graphviz");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        jScrollPane1.setViewportView(jPanel2);

        btt_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_agregarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(692, 1000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jLabel1))
                            .addComponent(btt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_home))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btt_home)))
                        .addGap(83, 83, 83))
                    .addComponent(btt_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_homeActionPerformed
      Home home = new Home();
      home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btt_homeActionPerformed

    private void btt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_agregarActionPerformed
        TableroEspecificacion tabla = new TableroEspecificacion();
        tabla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btt_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(TableroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_agregar;
    private javax.swing.JButton btt_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
