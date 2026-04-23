package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {
        TimerTask timerA = new TimerTask("Temporizador A", 8);
        TimerTask timerB = new TimerTask("Temporizador B", 3);

        timerA.run();
        timerB.run();
        System.out.println();
    }
}
