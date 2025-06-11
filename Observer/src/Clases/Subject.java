package Clases;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private String color;
    private List<observer_interface> observers = new ArrayList<>();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void addObserver(observer_interface o) {
        observers.add(o);
    }

    public List<observer_interface> getObservers() {
        return observers;
    }
}
