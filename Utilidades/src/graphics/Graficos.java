
package graphics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Pablo Daniel Quiroga
 */
public class Graficos {
	private JFrame ventana;
	private JPanel panel;

	private int valor1, valor2, valor3;

	public Graficos() {
		initComponents();
		ventana.setTitle("Prueba de Graficos");
		ventana.setSize(800, 600);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		valor1 = 100;
		valor2 = 50;
		valor3 = valor1 + valor2;
	}

	@SuppressWarnings("serial")
	private void initComponents() {
		ventana = new JFrame();

		panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);

				g.setColor(Color.red);
				g.fillArc(10, 10, 500, 500, 0, valor1);
				g.setColor(Color.BLUE);
				g.fillArc(10, 10, 500, 500, valor1, valor2);
				g.setColor(Color.GREEN);
				g.fillArc(10, 10, 500, 500, valor1 + valor2, valor3);
			}
		};
		ventana.add(panel);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			@Override
			public void run() {
				try {
					Graficos frame = new Graficos();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
