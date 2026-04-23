package ec.edu.utpl.carreras.computacion.proava;

public class TimerTask {
    private final String name;
    private int seconds;

    public TimerTask(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    public void run() {
        while (seconds > 0) {
            System.out.printf("%s: %d segundos restantes%n", name, seconds);
            seconds--;
            try {
                Thread.sleep(1000); // pausa 1 segundo real
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.printf("%s: ¡Tiempo!%n", name);
    }
}
