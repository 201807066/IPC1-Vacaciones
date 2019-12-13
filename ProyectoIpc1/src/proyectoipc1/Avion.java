package proyectoipc1;

public class Avion {
    
public String estado;
public int id_avion, turno_restante;

public Avion(int id_avion, String estado, int turno_restante) {
        this.id_avion = id_avion;
        this.estado = estado;
        this.turno_restante = turno_restante;
    }
    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTurno_restante() {
        return turno_restante;
    }

    public void setTurno_restante(int turno_restante) {
        this.turno_restante = turno_restante;
    }

    
}
