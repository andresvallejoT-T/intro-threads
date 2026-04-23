package ec.edu.utpl.carreras.computacion.proava;

public class TimerTask implements Runnable{
    private final String name;
    private int seconds;

    public TimerTask(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }
    @Override
    public void run() {
        while (seconds > 0) {
            System.out.printf("%s: %d segundos restantes%n", name, seconds);
            seconds--;
        }
    }
}
