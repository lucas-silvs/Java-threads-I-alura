package org.threads.counterThread;

public class Counter {
    public static void main(String[] args) {

        Thread contador1 = new Thread(new Contador());
        Thread contador2 = new Thread(new Contador());

        contador2.start();
        contador1.start();

    }
}
