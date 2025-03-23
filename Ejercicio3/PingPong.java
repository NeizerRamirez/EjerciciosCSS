package Ejercicio3;

public class PingPong extends Thread {

    private String word;

    public PingPong(String s) {
        word = s;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(word);
            System.out.flush();
        }

    }

    public static void main(String[] args) {
        Thread tP = new PingPong("P");
        Thread tx = new PingPong("x");

        tP.setPriority(Thread.MAX_PRIORITY);
        tx.setPriority(Thread.MIN_PRIORITY);
        tP.start();
        tx.start();

        System.err.println("Tenemos hambre y sueño");
    }
}