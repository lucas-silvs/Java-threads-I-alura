package org.lista;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;


    public synchronized void adicionarElemento(String elemento){

            this.elementos[indice] = elemento;
            this.indice++;

            if(estaCheia()){
                System.out.println("Notificando lista cheia");
                this.notify();
            }

    }

    public int tamanho(){
        return this.elementos.length;
    }

    public String pegarElemento(int posicao){
        return this.elementos[posicao];
    }

    public boolean estaCheia() {
        return this.indice == elementos.length;
    }
}
