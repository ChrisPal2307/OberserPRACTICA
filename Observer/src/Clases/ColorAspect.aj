
package Clases;

import Clases.Subject;
import Clases.observer_interface;
import java.lang.String;


public aspect ColorAspect {
	
    pointcut cambioDeColor(Clases.Subject s, String color): 
        execution(void Clases.Subject.setColor(String)) && this(s) && args(color);

    after(Clases.Subject s, String color): cambioDeColor(s, color) {
        for (observer_interface obs : s.getObservers()) {
            obs.update(color);
        }
    }
}
