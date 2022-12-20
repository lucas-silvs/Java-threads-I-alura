package org.lista;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;


    public void adicionarElemento(String elemento){
        synchronized (this) {
            this.elementos[indice] = elemento;
            this.indice++;
        }
    }

    public int tamanho(){
        return this.elementos.length;
    }

    public String pegarElemento(int posicao){
        return this.elementos[posicao];
    }
}
