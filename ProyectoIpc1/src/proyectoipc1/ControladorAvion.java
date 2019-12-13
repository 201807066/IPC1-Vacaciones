package proyectoipc1;

public class ControladorAvion {
public static Avion[] avion = new Avion[1000];
    public ControladorAvion insertar(int id_avion, String estado, int turno)
    {
        
        Avion nuevo = new Avion(id_avion, estado, turno);
        
        for (int i = 0; i < avion.length; i++) {
                if(avion[i]==null)
                {
                    avion[i] = nuevo;
            }
        }
        return null;
    }
    
    public ControladorAvion mostrar()
    {
        for (int i = 0; i < avion.length; i++) {
            if (avion[i] != null) {
                System.out.println("Id del avion que arribo: \nEstado: ");
            }
        }
        return null;
    }
    
    public Avion Buscar(int id_avion)
    {
        for (int i = 0; i < avion.length; i++) {
            if(avion[i] != null)
            {
                if (avion[i].getId_avion() == id_avion) {
                    return avion[i];
                }
            }
        }
        return null;
    }
}
