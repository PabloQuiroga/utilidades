package main;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import imp.Notepad;

public class Main {
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			@Override
			public void run() {
				try {
					Notepad frame = new Notepad();
				} catch (Exception e) {
					//e.printStackTrace();
					//TODO agregar traza del error en mensaje emergente
					JOptionPane.showMessageDialog(null, "No se ha podido lanzar la aplicacion");
				}
			}
		});
	}
}
