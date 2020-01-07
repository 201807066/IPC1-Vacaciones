
package Graphviz;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Grafica {
    public static void Imagen(String cadena, String nombre) {
        String archivo = nombre + ".dot";
        try {
            FileWriter fichero = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println("digraph G {\n");
            pw.println(cadena);
            pw.println("\n}");
            fichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            String cmd = "dot.exe -Tpng " + nombre + ".dot -o " + nombre + ".png";
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
