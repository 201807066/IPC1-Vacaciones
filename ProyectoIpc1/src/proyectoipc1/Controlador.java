package proyectoipc1;

public class Controlador {

    public int nfilas1, ncolumna1;
    public Pasajero[][] pasajero;

    ControladorMaleta maleta = new ControladorMaleta();
    public Controlador insertar(int id, int cant_doc, int n_turnos, String tipo, int tipo_avion) {
        Pasajero nuevo = new Pasajero(id, cant_doc, n_turnos, tipo, tipo_avion);
        //qu bool si inserta true de lo contrario q lo intente nuevamente 

        for (int i = 0; i < pasajero.length; i++) {
            for (int j = 0; j < pasajero[0].length; j++) {
                if (pasajero[i][j] == null) {
                    pasajero[i][j] = nuevo;
                    return this;
                }
            }
        }
        return null;
    }

    public Controlador(int nfilas, int ncolumna) {
        //se creo la matriz
        pasajero = new Pasajero[nfilas][ncolumna];
    }

    public Controlador mostrar() {
        for (int i = 0; i < pasajero.length; i++) {
            for (int j = 0; j < pasajero[0].length; j++) {
                if (pasajero[i][j] != null) {
                    System.out.println("Id:" + pasajero[i][j].getId()+ "\nCantidad de documentos del pasajero: " + pasajero[i][j].getCant_doc() + "\nNúmero de turno para registro: " + pasajero[i][j].getN_turnos()
                            + "\nTipo de avion que abordo el pasajero: " + pasajero[i][j].getTipo()+" id acion: "+pasajero[i][j].getTipo_avion());
                }
            }
        }
        return null;
    }

    public String buscar(Pasajero pass) {
        for (int i = 0; i < pasajero.length; i++) {
            for (int j = 0; j < pasajero[i].length; j++) {
                if (pasajero[i][j].getId() == pass.getId()) {
                    return "El numero de pasajero es: "+pasajero[i][j].getId();
                }

            }
        }

        return "No se encontro el pasajero";
    }
    public Controlador mostr(){
return null;
    }

}
