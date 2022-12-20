package org.threads.banheiro;

public class Main {

    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero01(banheiro), "john Marston");
        Thread convidado2 = new Thread(new TarefaNumero02(banheiro), "Arthur Morgan");

        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Micah Bell");
        limpeza.setDaemon(true);
        limpeza.setPriority(Thread.MAX_PRIORITY);

        convidado1.start();
        convidado2.start();
        limpeza.start();

    }
}
