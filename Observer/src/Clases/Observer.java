package Clases;
import javax.swing.*;
public class Observer {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Hola Swing");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        ventana.add(new JLabel("¡Hola desde Swing!", SwingConstants.CENTER));
        ventana.setVisible(true);
		
	}

}
