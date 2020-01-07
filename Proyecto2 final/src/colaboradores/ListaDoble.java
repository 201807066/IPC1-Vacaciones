package colaboradores;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.multi.MultiComboBoxUI;


public class ListaDoble {
   public static NodoDoble inicio, fin;
    
    private static ListaDoble instancia;
       
    //Metodo privado para evitar instancias mediante el operador "new"
  
       
    public static ListaDoble getInstancia()
    {
        if (instancia == null) {
            instancia = new ListaDoble();
        }
        return instancia;
    }
    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia()
    {
        return inicio == null;
    }
    public ListaDoble Insertar(String nombre, String nickname, String rol, String telefono){
        
          NodoDoble aux33= inicio;
         if (aux33!= null) {
            do {
                if (aux33.getNickname().equalsIgnoreCase(nickname)) {
                   return null;
                }
                aux33 = aux33.getSiguiente();
         } while (aux33 != null); 
         }
         
     
        NodoDoble nuevo = new NodoDoble(nombre,  nickname, rol, telefono);
        nuevo.setSiguiente(null);
        NodoDoble temp = inicio;
        if (inicio == null) {
           
            inicio = nuevo;
            inicio.setAnterior(null);
            inicio.setSiguiente(null);
        }else{
            boolean com=true,com1=true;
           
         do {
             if (temp != null) {
                  for (int i = 0; i < temp.getNickname().length(); i++) {
            int a1 = temp.getNickname().charAt(i);
           int a2 = nickname.charAt(i);
            if (a1 < a2) {
                
                i = temp.getNickname().length();
            }
            if(a1 > a2){
               
                if (temp.getAnterior() != null) {
                    NodoDoble t1 = temp.getAnterior();
                    nuevo.setAnterior(t1);
                    t1.setSiguiente(nuevo);
                    nuevo.setSiguiente(temp);
                    temp.setAnterior(nuevo);
                    
                    com = false;
                    com1 = false;
                    
                }else{
                nuevo.setSiguiente(inicio);
                nuevo.setAnterior(null);
                inicio.setAnterior(nuevo);
                inicio = nuevo;
                com = false;
                com1 = false;
                }
                i = temp.getNickname().length();
            }
            
        }
                  
                  
                  
                  
                  
             }
             if (temp != null) {
                  if (temp.getSiguiente() != null) {
                temp = temp.getSiguiente(); 
             }else{
                 if (com1) {
                     nuevo.setAnterior(temp);
                     temp.setSiguiente(nuevo);
                     com1 = false;
                 }
             com = false;
             }
             }else{
             com = false;
             }
            
      
           
        } while (com);
         
        }
       
        
    return this;
    }
    //Metodos para agregar nodos al final 
   
     
     //Metodo para mostrar la lista doblemente enlazada de inicio a fin
    
    
    public  ListaDoble Modificar(String nmodificar,String nombre, String nickname, String rol, String telefono){
        if (buscar(nickname) == null || nmodificar.equalsIgnoreCase(nickname)) {
            NodoDoble au = buscar(nmodificar);
            if (au != null) {
                eliminar(nmodificar);
                Insertar(nombre, nickname, rol, telefono);
                return this;
            }
        }else{
        return null;
        }
return null;
    }
     public void mostrarListaInicioFin()
     {
         if (!estaVacia()) {
             String datos = "";
             NodoDoble auxiliar =inicio;
             while (auxiliar!=null) {                 
                 datos = datos + "Nombre del colaborados: " + auxiliar.nombre + ", " + "\nNickName del colaborador: " +auxiliar.nickname +"\nRol: " + auxiliar.rol + "\nTeléfono: " + auxiliar.telefono + "\n\n";
                 auxiliar = auxiliar.siguiente;
             }
             System.out.println(datos);
             JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de Datos", JOptionPane.INFORMATION_MESSAGE);
         }
     }
     public ListaDoble mostrar(){
         NodoDoble aux33= inicio;
         if (aux33!= null) {
            do {
                System.out.println("NickName: "+aux33.getNickname());
             aux33 = aux33.getSiguiente();
         } while (aux33 != null); 
         }
         
         
     return  null;
     }
     public NodoDoble buscar(String NickName){
         NodoDoble aux33= inicio;
         if (aux33!= null) {
            do {
                if (aux33.getNickname().equalsIgnoreCase(NickName)) {
                    return aux33;
                }
             aux33 = aux33.getSiguiente();
         } while (aux33 != null); 
         }
         
         
     return  null;
     }
     //Metodo para mostrar la lista de Fin a Inicio
       public void mostrarListaFinInicio()
     {
         if (!estaVacia()) {
             String datos = "<=>";
             NodoDoble auxiliar =fin;
             while (auxiliar!=null) {                 
                 datos = datos + "[" + auxiliar.nombre +"<=>";
                 auxiliar = auxiliar.anterior;
             }
             JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
         }
         }
       
       //Metodo para buscar un registro
       public void buscar(String dato, JTextField nombre, JTextField nickname, JTextField rol, JTextField telefono, JTextField buscar)
       {
         
       }
     
       
       
       //Metodo para eliminar
       public NodoDoble eliminar(String dato)
       {
            NodoDoble aux33= inicio;
         if (aux33!= null) {
            do {
                if (aux33.getNickname().equalsIgnoreCase(dato)) {
                    if (aux33.getAnterior() != null) {
                      NodoDoble aux,aux2;
                      aux = aux33.getAnterior();
                      aux.setSiguiente(aux33.getSiguiente());
                      aux2 = aux33.getSiguiente();
                        if (aux2 != null) {
                             aux2.setAnterior(aux);
                        }else{
                        inicio = aux33.getAnterior();
                            if (inicio != null) {
                                inicio.setAnterior(null);
                            }
                        
                        
                        }
                     
                      
                    }else{
                    inicio = aux33.getSiguiente();
                        if (inicio != null) {
                             inicio.setAnterior(null);
                        }
                   
                    }
                }
             aux33 = aux33.getSiguiente();
         } while (aux33 != null); 
         }
         
         
        return  null;
        
       }
   

      /* public void EliminarAlFinal()
       {
           String elemento = fin.nombre;
           String elemento1 = fin.nickname;
           String elemento2 = fin.rol;
           int elemento3 = fin.telefono;
           
           if (inicio == fin) {
               inicio = fin = null;
           }
           else
           {
               fin = fin.siguiente;
               fin.anterior = null;
           }
       }*/
     }

