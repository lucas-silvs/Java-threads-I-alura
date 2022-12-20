package org.threads.banheiro;

public class TarefaNumero01 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero01(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.fazNumero01();

    }
}
