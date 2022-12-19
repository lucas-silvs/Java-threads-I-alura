package org.threads.buscaTextual;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String nome1 = "da";

        Thread threadAssinatura1= new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome1));
        Thread threadAssinatura2= new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome1));
        Thread threadAutores= new Thread(new TarefaBuscaTextual("autores.txt", nome1));

        threadAssinatura1.start();
        threadAssinatura2.start();
        threadAutores.start();
    }
}
