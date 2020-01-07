package home;
import colaboradores.*;

import colaboradores.ListaDoble;
import colaboradores.NodoDoble;

public class Main {
    public static ListaDoble lista = ListaDoble.getInstancia();
    public static void main(String [] args)
    {
        lista = new ListaDoble();
        Home home = new Home();
        home.setVisible(true);
    }
    
   
}
