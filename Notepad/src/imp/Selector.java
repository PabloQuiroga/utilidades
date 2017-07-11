package imp;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Implementacion propia de JFileChooser
 * @author Pablo
 */
public class Selector {
	
	private static File archivo = null;
    private static JFileChooser selector = new JFileChooser();
    
    //buscar de archivo
    public static File buscar() {
        selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int val = selector.showOpenDialog(null);

        if (val == JFileChooser.APPROVE_OPTION) {
            archivo = selector.getSelectedFile();
        }

        return archivo;
    }

    //guardar archivo
    public static File guardar(){    	
    	int val = selector.showSaveDialog(null);
    	File nuevo = null;
    	
    	if(val == JFileChooser.APPROVE_OPTION){
    		nuevo = new File(selector.getSelectedFile().getPath());
    		JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");  	
    	}
    	
    	return nuevo;
    }
}
