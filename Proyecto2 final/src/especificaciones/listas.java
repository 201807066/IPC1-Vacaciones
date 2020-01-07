
package especificaciones;

public class listas {
    int listapertenece;
    String titulo;
    String datos;
    int idtarjeta;
    listas siguiente;
    listas anterior;
     
    
    
    public listas(int listapertenece,String titulo, String datos) {
        this.listapertenece = listapertenece;
        this.titulo = titulo;
        this.datos = datos;
        siguiente=this;
        anterior = this;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getListapertenece() {
        return listapertenece;
    }

    public void setListapertenece(int listapertenece) {
        this.listapertenece = listapertenece;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public int getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(int idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public listas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(listas siguiente) {
        this.siguiente = siguiente;
    }

    public listas getAnterior() {
        return anterior;
    }

    public void setAnterior(listas anterior) {
        this.anterior = anterior;
    }
    
}
