package org.threads.counterThread;

public class Contador implements Runnable {
    @Override
    public void run() {
        int aux = 1;
        while(aux <= 1000){

            Thread threadAtual = Thread.currentThread();
            System.out.println("Contador: " + aux + " - ID da Thread: " + threadAtual.getId());

            aux++;
        }
    }
}
