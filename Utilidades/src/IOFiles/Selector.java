package IOFiles;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Implementacion de JFileChooser
 *
 * @author Pablo Daniel Quiroga
 */
public class Selector {

    private static String archivo = null;
    private static String directorio = null;
    private static JFileChooser selector = new JFileChooser();
    private static String extension = null;

    //GETTERS
    public static String getArchivo() {
        return archivo;
    }

    public static String getDirectorio() {
        return directorio;
    }

    //punto de inicio con directorios
    public static void seleccion() {
        String[] valores_Seleccion = {"tipo determinado", "directorios", "todos"};
        int select = JOptionPane.showOptionDialog(
                null,
                "Seleccione su busqueda",
                "Seleccion",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                valores_Seleccion,
                null
        );
        switch (select) {
            case 0:
                extension = JOptionPane.showInputDialog("Indique la extension a buscar");
                busca_archivos(extension);
                break;
            case 1:
                busca_directorio();
                break;
            default:
                busca_archivos();
                break;
        }
    }
    //punto de inicio solo de archivos

    public static void seleccion_archivo() {
        String[] valores_Seleccion = {"tipo determinado", "todos"};
        int select = JOptionPane.showOptionDialog(
                null,
                "Seleccione su busqueda",
                "Seleccion",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                valores_Seleccion,
                null
        );
        switch (select) {
            case 0:
                extension = JOptionPane.showInputDialog("Indique la extension a buscar");
                busca_archivos(extension);
                break;
            default:
                busca_archivos();
                break;
        }
    }
    //punto de inicio solo de directorios

    public static void seleccion_directorio() {
        busca_directorio();
    }

    /*
	 * SETTERS
     */

    //busqueda por extension
    private static String busca_archivos(String busqueda) {
        selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivos ." + extension, extension);
        selector.setFileFilter(filtro);
        int val = selector.showOpenDialog(null);

        if (val == JFileChooser.APPROVE_OPTION) {
            archivo = selector.getSelectedFile().getAbsolutePath();
        }

        return archivo;
    }

    //ver todo
    private static String busca_archivos() {
        selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int val = selector.showOpenDialog(null);

        if (val == JFileChooser.APPROVE_OPTION) {
            archivo = selector.getSelectedFile().getAbsolutePath();
        }

        return archivo;
    }

    //busqueda de directorios
    private static String busca_directorio() {
        selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int val = selector.showOpenDialog(null);

        if (val == JFileChooser.APPROVE_OPTION) {
            directorio = selector.getSelectedFile().getAbsolutePath();
        }

        return directorio;
    }

    //TEST
    public static void main(String[] args) {
        /*busca_archivos();
		System.out.println(archivo);
		busca_directorio();
		System.out.println(directorio);*/

        seleccion();

    }
}
