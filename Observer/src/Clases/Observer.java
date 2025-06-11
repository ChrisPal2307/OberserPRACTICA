package Clases;


public class Observer {

	public static void main(String[] args) {
		Subject subject = new Subject();
        subject.addObserver(new ColorChangeObserver("ConsoleLogger"));
        new Ventana(subject);
    
	}

}
