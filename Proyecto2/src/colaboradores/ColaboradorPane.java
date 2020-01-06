package colaboradores;
import home.Home;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javafx.util.converter.IntegerStringConverter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.itextpdf.text.Document;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ColaboradorPane extends javax.swing.JFrame {

 Home home = new Home();
 //ListaDoble lista = new ListaDoble();
 ListaDoble lista = ListaDoble.getInstancia();
 public static  String ruta="", cargamasiva="";
    public ColaboradorPane() {
        initComponents();
        transparencia();
        this.setLocationRelativeTo(null);
    }
    
    public void transparencia()
    {
        btt_home.setOpaque(false);
        btt_home.setContentAreaFilled(false);
        btt_home.setBorderPainted(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btt_modificar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nick = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_rol = new javax.swing.JTextField();
        btt_home = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btt_aceptar = new javax.swing.JButton();
        btt_ver = new javax.swing.JButton();
        btt_cancelar = new javax.swing.JButton();
        btt_carga = new javax.swing.JButton();
        btt_eliminar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btt_buscar = new javax.swing.JButton();
        btt_modificar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        btt_modificar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_modificar1.setText("Modificar");
        btt_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_modificar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("NickName:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Rol:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono:");

        txt_nick.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txt_telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        txt_rol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btt_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_homeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setText("Agregar Colaborador");

        btt_aceptar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_aceptar.setText("Aceptar");
        btt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_aceptarActionPerformed(evt);
            }
        });

        btt_ver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_ver.setText("Ver ");
        btt_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_verActionPerformed(evt);
            }
        });

        btt_cancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_cancelar.setText("Cancelar");
        btt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_cancelarActionPerformed(evt);
            }
        });

        btt_carga.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_carga.setText("Cargar Datos");
        btt_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_cargaActionPerformed(evt);
            }
        });

        btt_eliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_eliminar.setText("Eliminar");
        btt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_eliminarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N

        btt_buscar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_buscar.setText("Buscar");
        btt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_buscarActionPerformed(evt);
            }
        });

        btt_modificar2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btt_modificar2.setText("Modificar");
        btt_modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_modificar2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Imagen de Graphviz");

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addGap(0, 247, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 149, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_telefono)
                                            .addComponent(txt_rol)
                                            .addComponent(txt_nick)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btt_ver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btt_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btt_modificar2)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btt_carga)
                                                .addGap(12, 12, 12)))
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(330, 330, 330)
                                .addComponent(btt_home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btt_home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt_buscar)
                            .addComponent(btt_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt_ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btt_modificar2))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(btt_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btt_carga)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nick, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_homeActionPerformed
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btt_homeActionPerformed

    private void btt_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_verActionPerformed
      
         try {
        FileOutputStream archivo = new FileOutputStream("D:\\Escritorio\\Proyecto2\\tablas\\grafos1.txt");
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
            ListaDoble nodClientes = new ListaDoble();
           NodoDoble nodo =  ListaDoble.inicio;
            if (nodo != null) {
               
                
               p.println("edge[tailclip=false,arrowtail=dot,dir=both];"); 
               
            
                do {
                         
                         p.println("node_"+nodo.getNickname()+" [label=\"{{<back>}|{NickName: "+nodo.getNickname()+"| Nombre: "+nodo.getNombre()+"| Rol: "+nodo.getRol()+"| Telefono: "+nodo.getTelefono()+"}|{<next>}}\"];");
                         
                  
                   
                nodo = nodo.getSiguiente();
            } while (nodo != null);
                
                 NodoDoble nodo1 =  ListaDoble.inicio;
                 do {
                    if (nodo1.getSiguiente() == null) {
                        
                    }else{
                      
                    NodoDoble aux= nodo1.getSiguiente();
                        String siguiente = aux.getNickname();
                         p.println("node_"+nodo1.getNickname()+":next:c -> node_"+siguiente+":back:c;");
                         p.println("node_"+siguiente+":back:c -> node_"+nodo1.getNickname()+":next:c;");
                    }
                         
                   
                    
                   
                nodo1 = nodo1.getSiguiente();
            } while (nodo1 != null);
               
           
        
        
     
            }
             p.println("}");
             documento.close();
          
        
    }catch (Exception e) {
             System.out.println(""+e);
        }
         abrir();
        
    }//GEN-LAST:event_btt_verActionPerformed
public void abrir() {
       
        
         try {
      
      String dotPath = "D:\\Archivos de programa\\Graphviz\\bin\\dot.exe";
      
      String fileInputPath = "D:\\Escritorio\\Proyecto2\\tablas\\grafos1.txt";
      String fileOutputPath = "D:\\Escritorio\\Proyecto2\\tablas\\grafos1.jpg";
      
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
              
            File path = new File("D:\\Escritorio\\Proyecto2\\tablas\\grafos1.jpg");
            Desktop.getDesktop().open(path);
            
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Atención",2);
        }
                ImageIcon imagen1 = new ImageIcon("D:\\Escritorio\\Proyecto2\\tablas\\grafos1.jpg");
         jLabel8.setSize(imagen1.getIconWidth(), jLabel8.getHeight());
        Icon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(imagen1.getIconWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setIcon(icono1);
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
       
             
        
       
       
    }
    private void btt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_cancelarActionPerformed
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btt_cancelarActionPerformed

    private void btt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_aceptarActionPerformed

        if (txt_nombre.getText().equalsIgnoreCase("") || txt_nick.getText().equalsIgnoreCase("") || txt_rol.getText().equalsIgnoreCase("") || txt_telefono.getText().equalsIgnoreCase("")
                || txt_nombre.getText().equalsIgnoreCase(" ") || txt_nick.getText().equalsIgnoreCase(" ") || txt_rol.getText().equalsIgnoreCase(" ") || txt_telefono.getText().equalsIgnoreCase(" ")) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos correspondientes");
        }else{
        ListaDoble nodo = new ListaDoble();
        
            if (nodo.Insertar(txt_nombre.getText(), txt_nick.getText(), txt_rol.getText(),txt_telefono.getText()) == null) {
                JOptionPane.showMessageDialog(null, "El NickName ya ha sido creado, ingrese otro NickName");
                txt_nick.setText("");
            }else{
            JOptionPane.showMessageDialog(null, "datos Guardados Correctamente");
              nodo.mostrar();
            }
       
        }



//        if (txt_nombre.getText().isEmpty() || txt_nick.getText().isEmpty() || txt_rol.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos solicitados");
//        }
//        else 
//        {
//            String nombre = txt_nombre.getText();
//            String nickname = txt_nick.getText();
//            String rol = txt_rol.getText();
//            String telefono = txt_telefono.getText();
//            
//            lista.agregarAlFinal(nombre, nickname, rol, telefono);
//         
//        JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
//            limpiar();
//        }
    }//GEN-LAST:event_btt_aceptarActionPerformed

    public void limpiar()
    {
        txt_nombre.setText(null);
        txt_nick.setText(null);
        txt_rol.setText(null);
        txt_telefono.setText(null);
        txt_buscar.setText(null);
    }
    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void btt_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_cargaActionPerformed
 JFileChooser Buscar = new JFileChooser();
        FileNameExtensionFilter extension = new FileNameExtensionFilter("Seleccionar Archivo", "csv");
        Buscar.setFileFilter(extension);
        boolean a=true,b=true,c=true,d=true,f=true,g=true,h=true,i=true;
        String identificador="",nombre="",descripcion="",precio="",existencia="",ruta1="";
        if (Buscar.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            Toolkit tool = Toolkit.getDefaultToolkit();
            cargamasiva = Buscar.getSelectedFile().toString();
            try {
                FileReader reader = new FileReader(cargamasiva);
                BufferedReader buffer = new BufferedReader(reader);
                String linea = buffer.readLine();
                String leer="";
                while (linea != null) {
                    System.out.println(linea);                    
                    for (int s = 0; s < linea.length(); s++) {
                        leer = linea.charAt(s)+"";
                        if (a== true) {
                            if (leer.equalsIgnoreCase(",")) {
                                a=false;
                            }else{
                            identificador = identificador+linea.charAt(s);
                            }
                            
                        }else if (b== true) {
                            if (leer.equalsIgnoreCase(",")) {
                                b=false;
                            }else{
                            nombre = nombre+linea.charAt(s);
                            }
                            
                        }
                        else if (c== true) {
                            if (leer.equalsIgnoreCase(",")) {
                                c=false;
                            }else{
                            descripcion = descripcion+linea.charAt(s);
                            }
                            
                        }else if (d== true) {
                           if (s+1 == linea.length()) {
                                ruta1 =ruta1+linea.charAt(s);
                                
                                //guardar
                                ListaDoble listita1 = new ListaDoble();
                                listita1.Insertar(identificador, nombre, descripcion,ruta1);
                                a=true;b=true;c=true;d=true;f=true;g=true;
                                identificador="";nombre="";descripcion="";precio="";existencia="";ruta1="";
                                
                            }else{
                            ruta1 =ruta1+linea.charAt(s);
                            }
                            
                        }
                    }
                    linea = buffer.readLine();
                }
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                
                
            } catch (FileNotFoundException ex) {
                System.out.println("Hubo un error");
            } catch (IOException ex) {
                System.out.println("Error");
            }
            
           
        }      
    }//GEN-LAST:event_btt_cargaActionPerformed

    // equelIgnoreCase""
    private void btt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_eliminarActionPerformed
        if (txt_buscar.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios", "Registro Colaborador", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            lista.eliminar(txt_buscar.getText());
            JOptionPane.showMessageDialog(null, "Colaborador eliminado correctamente", "Registro Colaborador", JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.setEditable(true);
            limpiar();
        }
    }//GEN-LAST:event_btt_eliminarActionPerformed

    private void btt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_buscarActionPerformed
      if (txt_buscar.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "No ha ingresado nada en la busqueda");
                    }
      
           if (txt_buscar.getText().equalsIgnoreCase("")) {
           
                    }
        else{
         txt_buscar.setEditable(true);
            ListaDoble nodito = new ListaDoble();
            NodoDoble buscarnodito = nodito.buscar(txt_buscar.getText());
            if (buscarnodito != null) {
                txt_nombre.setText(buscarnodito.getNombre());
                txt_nick.setText(buscarnodito.getNickname());
                txt_rol.setText(buscarnodito.getRol());
                txt_telefono.setText(buscarnodito.getTelefono());
                 try {
             FileOutputStream archivo = new FileOutputStream("C:\\Users\\milto\\Documents\\NetBeansProjects\\ProyectoFinal\\tablas\\grafo1.txt");
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
          
               
                
               p.println("edge[tailclip=false,arrowtail=dot,dir=both];"); 
               p.println("node_"+buscarnodito.getNickname()+" [label=\"{{<back>}|{NickName: "+buscarnodito.getNickname()+"| Nombre: "+buscarnodito.getNombre()+"| Rol: "+buscarnodito.getRol()+"| Telefono: "+buscarnodito.getTelefono()+"}|{<next>}}\"];");
                        
                  
           
             p.println("}");
             documento.close();
           abrir();
          
      
       
        
    }catch (Exception e) {
             System.out.println(""+e);
        }
                
                
            }else{
            JOptionPane.showMessageDialog(null,"No se encontro el Nickname");
            txt_buscar.setText("");
            }
        } 
        
        
        
    }//GEN-LAST:event_btt_buscarActionPerformed

    private void btt_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_modificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btt_modificar1ActionPerformed

    private void btt_modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_modificar2ActionPerformed
        if (txt_buscar.getText().equalsIgnoreCase("")|| txt_nick.getText().equalsIgnoreCase("")||txt_nombre.getText().equalsIgnoreCase("")||txt_rol.getText().equalsIgnoreCase("")
                || txt_telefono.getText().equalsIgnoreCase("")) {
           JOptionPane.showMessageDialog(null, "Ingrese todos los campos correspondientes");
        }else{
        ListaDoble nf = new ListaDoble();
        NodoDoble bnf= nf.buscar(txt_buscar.getText());
            if (bnf!=null) {
                if (nf.Modificar(txt_buscar.getText(), txt_nombre.getText(), txt_nick.getText(), txt_rol.getText(), txt_telefono.getText()) != null) {
                    JOptionPane.showMessageDialog(null,"Datos Modificados Correctamente");
                limpiar(); 
                }else{
                JOptionPane.showMessageDialog(null, "El Nckname Nuevo ya a sido creado");
                }

               
            }else{
            JOptionPane.showMessageDialog(null, "El Nockname que desea modificar no existe ");
            txt_buscar.setText("");
            }
        }
    }//GEN-LAST:event_btt_modificar2ActionPerformed

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
            java.util.logging.Logger.getLogger(ColaboradorPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaboradorPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaboradorPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaboradorPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaboradorPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_aceptar;
    private javax.swing.JButton btt_buscar;
    private javax.swing.JButton btt_cancelar;
    private javax.swing.JButton btt_carga;
    private javax.swing.JButton btt_eliminar;
    private javax.swing.JButton btt_home;
    private javax.swing.JButton btt_modificar1;
    private javax.swing.JButton btt_modificar2;
    private javax.swing.JButton btt_ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_nick;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rol;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
