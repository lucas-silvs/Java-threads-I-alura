package org.threads.banheiro;

public class TarefaNumero02 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero02(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.fazNumero02();
    }
}
