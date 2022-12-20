package org.lista;

public class TarefaImprimir implements Runnable {
    private Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        synchronized (lista) {

        if(!lista.estaCheia()){
            try {
                    lista.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.pegarElemento(i));
        }



    }
}
