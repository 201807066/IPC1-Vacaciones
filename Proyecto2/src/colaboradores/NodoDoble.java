package colaboradores;

public class NodoDoble {

    String nombre, nickname, rol, telefono;
    NodoDoble siguiente, anterior;

   
 //Constructor cuando aun no hay nodos

    
    
//Constructor cuando ya hay nodos
    public NodoDoble(String nombre, String nickname, String rol, String telefono) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.rol = rol;
        this.telefono = telefono;
        siguiente = this;
        anterior = this;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
   
    
}
