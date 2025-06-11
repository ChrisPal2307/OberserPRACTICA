package Clases;

public class ColorChangeObserver implements observer_interface {
	private String nombre;

    public ColorChangeObserver(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String nuevoColor) {
        System.out.println(nombre + " detectó nuevo color de fondo: " + nuevoColor);
    }
}
