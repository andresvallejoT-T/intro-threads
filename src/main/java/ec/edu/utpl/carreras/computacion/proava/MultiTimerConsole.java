package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {

        TimerTask timerA = new TimerTask("Temporizador A", 8);
        TimerTask timerB = new TimerTask("Temporizador B", 5);
        TimerTask timerC = new TimerTask("Temporizador C", 3);

// Cambio 3: el Runnable se ENVUELVE dentro de un Thread
         new Thread(timerA, "Hilo-A").start();
        new Thread(timerB, "Hilo-B").start();
        new Thread(timerC, "Hilo-C").start();




    }

}
