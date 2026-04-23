package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {

            TimerTask timerA = new TimerTask("Temporizador A", 8);
            TimerTask timerB = new TimerTask("Temporizador B", 5);
            TimerTask timerC = new TimerTask("Temporizador C", 3);

            timerA.start();	// start() crea el hilo y llama run() en él
            timerB.start(); timerC.start();



    }

}
