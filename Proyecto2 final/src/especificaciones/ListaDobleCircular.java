
package especificaciones;

public class ListaDobleCircular {
    public static Columna cabeza;
    public static int identificador=1,identificadorpila=1,identificadorcola=1,identificadordoble=1;
    
    public ListaDobleCircular insertar(String Nombre,String tipo,int tabla){
        Columna nuevo = new Columna(Nombre, tipo, tabla);
        nuevo.setIdentificador(identificador);
       
        identificador++;
        
        if (cabeza== null) {
            cabeza = nuevo;
            cabeza.setAnterior(nuevo);
            cabeza.setSiguiente(nuevo);
        }else{
            Columna aux= cabeza;
            do {
                if (aux.getSiguiente() == cabeza) {
                    aux.setSiguiente(nuevo);
                    cabeza.setAnterior(nuevo);
                    nuevo.setAnterior(aux);
                    nuevo.setSiguiente(cabeza);
                    return this;
                }
                
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            
        }
    return null;
    }
    public Columna Buscar(int id) {
        Columna aux = cabeza;
        if (cabeza!=null) {
              do {
                  if (aux.getIdentificador() == id) {
                      return aux;
                  }
            aux = aux.getSiguiente();
        } while (aux !=cabeza);
        }
      
        
        return null;
    }
     public Columna Realizado(int id) {
        Columna aux = cabeza;
        if (cabeza!=null) {
              do {
                  if (aux.getIdentificador() == id) {
                     
                   listas cabe = aux.getCabeza();
                      if (cabe != null) {
                         listas temp;
                         temp = cabe.getSiguiente();
                         aux.setCabeza(temp);
                         return aux;
                          
                      }
                      
                  }
            aux = aux.getSiguiente();
        } while (aux !=cabeza);
        }
      
        
        return null;
    }
     public ListaDobleCircular agregarListaDobleCircular(int lista,String titulo,String Datos){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                System.out.println("Ciclado");
                if (aux.getIdentificador() == lista) {
                     listas nuevo = new listas(lista,titulo,Datos);
                nuevo.setIdtarjeta(identificadorpila);
                identificadorpila++;
                if (aux.getCabeza() == null) {
                    nuevo.setSiguiente(nuevo);
                    nuevo.setAnterior(nuevo);
                    aux.setCabeza(nuevo);
                     System.out.println("Guardando");
                    return this;
                   
                }else{
                listas temp = aux.getCabeza();
                    if (temp != null) {
                         do {
                        if (temp.getSiguiente()== aux.getCabeza()) {
                            
                           temp.setSiguiente(nuevo);
                           nuevo.setAnterior(temp);
                           nuevo.setSiguiente(aux.getCabeza());
                           aux.getCabeza().setAnterior(nuevo);
                           
                           temp = temp.getSiguiente();
                           System.out.println("aca");
                           return this;
                        }
                        
                        temp = temp.getSiguiente();
                    } while (temp != aux.getCabeza());
                    }
                   
                    
                }
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    }
    public ListaDobleCircular agregarpila(int lista,String titulo,String Datos){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                if (aux.getIdentificador() == lista) {
                    listas nuevo = new listas(lista,titulo, Datos);
                nuevo.setIdtarjeta(identificadorpila);
                identificadorpila++;
                if (aux.getCabeza() == null) {
                    aux.setCabeza(nuevo);
                    aux.getCabeza().setSiguiente(null);
                }else{
                listas temp = aux.getCabeza();
                nuevo.setSiguiente(temp);
                aux.setCabeza(nuevo);
                
                }
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    }
     public ListaDobleCircular mostrar(int lista){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                if (aux.getIdentificador() == lista) {
                  listas a = aux.getCabeza();
                    do {
                        System.out.println("Titulo: "+a.getTitulo()+" Datos: "+a.getDatos());
                        a = a.getSiguiente();
                    } while (a != null);
                    
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    } 
     public ListaDobleCircular modificar(int lista,String Nombre,String tipo){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                if (aux.getIdentificador() == lista) {
                  aux.setNombre(Nombre);
                  aux.setTipo(tipo);
                    
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    } 
     public ListaDobleCircular eliminar(int lista){
        if (cabeza != null) {
            Columna aux = cabeza;
            if (aux != null) {
                  do {  
            if (cabeza.getIdentificador() == lista ) {
                if (cabeza.getSiguiente() == cabeza && cabeza.getAnterior() == cabeza) {
                    cabeza = null;
                    return null;
                }else{
                   Columna temp,temp1;
                temp1 = cabeza.getSiguiente();
                temp = cabeza.getAnterior();
                temp.setSiguiente(temp1);
                cabeza = temp1;
                cabeza.setSiguiente(temp1.getSiguiente());
                
                cabeza.setAnterior(temp);
                return null;
                }
              
            }
           
            if (aux.getIdentificador() == lista ) {
                
               Columna temp,temp1;
                temp1 = aux.getSiguiente();
                temp = aux.getAnterior();
                temp.setSiguiente(temp1);
                aux = temp1;
                aux.setSiguiente(temp1.getSiguiente());
                
                aux.setAnterior(temp);
                return null;
              
                
            }
            aux = aux.getSiguiente();
           
            
        } while (aux!=cabeza); 
            }
          
        }
        
        
    return null;
    }

    public ListaDobleCircular() {
    }
    public ListaDobleCircular agregarcola(int lista,String titulo,String Datos){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                if (aux.getIdentificador() == lista) {
                    listas nuevo = new listas(lista,titulo, Datos);
                nuevo.setIdtarjeta(identificadorpila);
                identificadorpila++;
                if (aux.getCabeza() == null) {
                    nuevo.setSiguiente(null);
                    aux.setCabeza(nuevo);
                }else{
                listas temp = aux.getCabeza();
                    do {
                        if (temp.getSiguiente()== null) {
                           temp.setSiguiente(nuevo);
                           nuevo.setSiguiente(null);
                           temp = temp.getSiguiente();
                        }
                        
                        temp = temp.getSiguiente();
                    } while (temp != null);
                    
                }
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    }
     public ListaDobleCircular agregarListaDoble(int lista,String titulo,String Datos){
        if (cabeza != null) {
            Columna aux = cabeza;
            do {
                if (aux.getIdentificador() == lista) {
                    listas nuevo = new listas(lista,titulo,Datos);
                nuevo.setIdtarjeta(identificadorpila);
                identificadorpila++;
                if (aux.getCabeza() == null) {
                    nuevo.setSiguiente(null);
                    nuevo.setAnterior(null);
                    aux.setCabeza(nuevo);
                }else{
                listas temp = aux.getCabeza();
                    if (temp != null) {
                         do {
                        if (temp.getSiguiente()== null) {
                            
                           temp.setSiguiente(nuevo);
                           nuevo.setAnterior(temp);
                           nuevo.setSiguiente(null);
                           temp = temp.getSiguiente();
                        }
                        
                        temp = temp.getSiguiente();
                    } while (temp != null);
                    }
                   
                    
                }
                }
                
            aux = aux.getSiguiente();
        } while (aux != cabeza);
        }
        
        
    return null;
    }
}
