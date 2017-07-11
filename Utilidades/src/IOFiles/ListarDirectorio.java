package IOFiles;

import java.io.File;

/**
 * Listar directorios
 *
 * @author Pablo Daniel Quiroga
 */
public class ListarDirectorio {

    private String directorio;
    private File item;

    //Seleccion de directorio de inicio
    public ListarDirectorio() {
        Selector.seleccion_directorio();
        this.directorio = Selector.getDirectorio();
        this.item = new File(directorio);
    }

    //listado simple
    public void listarSimple(File carpeta) {
        File[] listado = carpeta.listFiles();

        for (File itemLista : listado) {
            System.out.println(itemLista);
        }
    }

    //Listado recursivo
    public File[] listar(File carpeta) {
        File[] listado = carpeta.listFiles();
        for (File itemLista : listado) {
            if (itemLista.isDirectory()) {
                System.out.println("+ " + itemLista.getName());
                listar(itemLista);
            } else {
                System.out.println("- " + itemLista.getName());
            }
        }
        return listado;
    }

    //GETTERS
    public String getDirectorio() {
        return directorio;
    }

    public File getItem() {
        return item;
    }

    //TEST
    public static void main(String args[]) {
        ListarDirectorio app = new ListarDirectorio();
        app.listarSimple(app.getItem());
        System.out.println();

        app.listar(app.getItem());
    }
}
