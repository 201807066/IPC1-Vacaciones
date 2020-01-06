
package especificaciones;

public class Tablero {
    int id;
    String Nombre;
    String Color;
    String Estado;
    Tablero siguiente;
    int NoColumnas=0;

    public Tablero(String Nombre, String Color, String Estado) {
        this.Nombre = Nombre;
        this.Color = Color;
        this.Estado = Estado;
        siguiente = this;
    }

    public int getNoColumnas() {
        return NoColumnas;
    }

    public void setNoColumnas(int NoColumnas) {
        this.NoColumnas = NoColumnas;
    }

    public Tablero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tablero siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
