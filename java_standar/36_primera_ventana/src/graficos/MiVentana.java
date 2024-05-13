package graficos;

import java.awt.Color;

import javax.swing.JFrame;

public class MiVentana extends JFrame {
	public MiVentana() {
		super("Primera Ventana swing");
		this.setBounds(100, 100, 700, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //al cerrar la única ventana abierta se cerraría el programa, si hay más de una no
		this.getContentPane().setBackground(Color.YELLOW);
		this.setVisible(true);
	}

}
