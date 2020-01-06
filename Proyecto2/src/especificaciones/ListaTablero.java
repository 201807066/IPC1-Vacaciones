
package especificaciones;

public class ListaTablero {
    public static Tablero cabeza;
    public static int identificador=1;
    
    public Tablero insertar(String Nombre, String Color, String Estado){
        Tablero nuevo = new Tablero(Nombre, Color, Estado);
        nuevo.setId(identificador);
        identificador++;
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(nuevo);
            return nuevo;
        }else{
            Tablero aux=cabeza;
            do {
                if (aux.getSiguiente() == cabeza) {
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(cabeza);
                    aux = aux.getSiguiente();
                    return nuevo;
                }
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            
        }
    return null;
    }
    public ListaTablero Eliminar(int id){
        Tablero auxi=cabeza;
        if (auxi != null) {
             do {
            Tablero temp = auxi.getSiguiente();
                 if (temp.getId() == id) {
                     if (temp == cabeza) {
                         if (cabeza.getSiguiente() == cabeza) {
                              cabeza =null;
                         }else{
                         auxi.setSiguiente(cabeza.getSiguiente());
                         cabeza = cabeza.getSiguiente();
                         }
                        
                     }else{
                     auxi.setSiguiente(temp.getSiguiente());
                     }
                     return null;
                 }
            auxi = auxi.getSiguiente();
        } while (auxi != cabeza);
        }
       
        
    return null;
    }
      public ListaTablero Mostrar(){
        Tablero auxi=cabeza;
        do {
            System.out.println("Nombre: "+auxi.getNombre()+ " Color: "+auxi.getColor()+" Estado: "+auxi.getEstado());
            auxi = auxi.getSiguiente();
        } while (auxi != cabeza);
        
    return null;
    }
    public Tablero Buscar(int id){
        Tablero auxi=cabeza;
        do {
            if (auxi.getId() == id) {
                return auxi;
            }
            auxi = auxi.getSiguiente();
        } while (auxi != cabeza);
        
    return null;
    }
}
