package proyectoipc1;

public class Maleta {
public int id_maleta, id_pasajero;

//constructor
    public void setId_maleta(int id_maleta) {
        this.id_maleta = id_maleta;
    }
    
    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public Maleta(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public int getId_maleta() {
        return id_maleta;
    }
 
}
