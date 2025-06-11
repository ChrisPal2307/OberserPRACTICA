package Clases;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
	private Subject subject;

    public Ventana(Subject subject) {
        this.subject = subject;

        setTitle("Ventana con Observer y AspectJ");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton rojo = new JButton("Rojo");
        JButton verde = new JButton("Verde");
        JButton azul = new JButton("Azul");

        rojo.addActionListener(e -> {
            getContentPane().setBackground(Color.RED);
            subject.setColor("Rojo");
        });

        verde.addActionListener(e -> {
            getContentPane().setBackground(Color.GREEN);
            subject.setColor("Verde");
        });

        azul.addActionListener(e -> {
            getContentPane().setBackground(Color.BLUE);
            subject.setColor("Azul");
        });

        add(rojo);
        add(verde);
        add(azul);

        setVisible(true);
    }
}
