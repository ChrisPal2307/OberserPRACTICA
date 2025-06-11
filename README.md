# OberserPRACTICA
Se implementó un mecanismo que permite notificar automáticamente a los observadores cada vez que se cambia el color de fondo de la ventana.
EstO se logra mediante un aspecto ColorAspect.aj que detecta cuándo se ejecuta el método setColor() en la clase Subject, y luego llama a los observadores registrados para informarles del nuevo color seleccionado. Mediante este enfoque se puede mantener el código más limpio y modular, ya que no se mezcló la lógica de interfaz con la lógica de notificación, cumpliendo así con el principio de separación de responsabilidades que caracteriza a la AOP, tambien como ColorChangeObserver, reaccionan mostrando mensajes en consola con el color actualizado, todo sin modificar directamente el flujo principal del programa.
![image](https://github.com/user-attachments/assets/cee8cf6f-a317-4aa7-931b-6945e0b4e08a)
![image](https://github.com/user-attachments/assets/f5b6727d-2708-4038-a6e2-02590f0f0c7a)
![image](https://github.com/user-attachments/assets/8177ff45-2c6e-4193-b751-4bc600a15c4c)
