package proyectoipc1;
import java.util.Random;

public class Pasajero {
    public int id, cant_doc, n_turnos, tipo_avion;

    Pasajero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public int getTipo_avion() {
        return tipo_avion;
    }

    public void setTipo_avion(int tipo_avion) {
        this.tipo_avion = tipo_avion;
    }
    String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCant_doc() {
        return cant_doc;
    }

    public void setCant_doc(int cant_doc) {
        this.cant_doc = cant_doc;
    }

    public int getN_turnos() {
        return n_turnos;
    }

    public void setN_turnos(int n_turnos) {
        this.n_turnos = n_turnos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    //Constructor
      public Pasajero(int id, int cant_doc, int n_turnos, String tipo, int tipo_avion) {
        this.id = id;
        this.cant_doc = cant_doc;
        this.n_turnos = n_turnos;
        this.tipo = tipo;
        this.tipo_avion = tipo_avion;
    }
      
      
  
}
