
package especificaciones;

public class Columna {
    String Nombre;
    String Tipo;
    int identificador;
    int tabla;
    Columna siguiente;
    Columna anterior;
    listas cabeza;
    

    public Columna(String Nombre, String Tipo, int tabla) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.tabla = tabla;
        siguiente=this;
        anterior= this;
    }

    public listas getCabeza() {
        return cabeza;
    }

    public void setCabeza(listas cabeza) {
        this.cabeza = cabeza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }

    public Columna getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Columna siguiente) {
        this.siguiente = siguiente;
    }

    public Columna getAnterior() {
        return anterior;
    }

    public void setAnterior(Columna anterior) {
        this.anterior = anterior;
    }
    
    
}
