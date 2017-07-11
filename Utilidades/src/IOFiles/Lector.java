package IOFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Lectura de archivos de texto
 * @author Pablo Daniel Quiroga
 */
@SuppressWarnings("unused")
public class Lector {

    private static File archivo;
    private static String linea;
    private static int contador_lineas = 0;
    private static StringBuilder contenido;

    public Lector() {
        Selector.seleccion_archivo();
        archivo = new File(Selector.getArchivo());
    }

    public void leer(File f) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            contenido = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                contenido.append(linea);
                contenido.append("\n");
                contador_lineas++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            linea = "Archivo no encontrado";
        } catch (IOException ex) {
            linea = "Error al leer el archivo";
        }
    }

    //TEST
    /*public static void main(String[] args) {
		Lector prueba = new Lector();
		JOptionPane.showMessageDialog(null, archivo.getName());
		System.out.println("Nombre del archivo: " + archivo.getName());
		System.out.println("Ruta absoluta del archivo: " + archivo);
		System.out.println();
		prueba.leer(archivo);
		System.out.println(contenido);
		System.out.println("Lineas en el archivo: " + contador_lineas);
	}*/
}
