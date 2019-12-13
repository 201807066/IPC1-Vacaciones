package proyectoipc1;


public class ControladorMaleta {
    public int maletas;
    public static Maleta[] maleta = new Maleta[10000];
    public static int identificador_maleta=0;
    
public ControladorMaleta insertar(int id_pasajero)
{
    identificador_maleta++;
    Maleta nuevo = new Maleta(id_pasajero);
    nuevo.setId_maleta(identificador_maleta);
    for (int i = 0; i < maleta.length; i++) {
        if (maleta[i] == null) {
            maleta[i]=nuevo;
            return this;
        }
    }
   return null; 
}

public ControladorMaleta mostrar(int nmaletas)
{
     for (int i = 0; i < maleta.length; i++) {
                if (maleta[i] != null) {
                    System.out.println("Id maleta:" +"" + "\nCantidad de maletas del pasajero: " + "");
                }
            }
    return null;
}

}
