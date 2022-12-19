package org.threads.banheiro;

public class Banheiro {

    public void fazNumero01(){
        String nomePessoa = Thread.currentThread().getName();
        System.out.println(nomePessoa + " batendo na porta");


        synchronized (this){
            System.out.println(nomePessoa + " entrando no banheiro");
            System.out.println(nomePessoa + " fazendo o numero 1");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nomePessoa + " dando descarga");
            System.out.println(nomePessoa + " lavando as mãos");
            System.out.println(nomePessoa + " secando as mãos");
            System.out.println(nomePessoa + " saindo do banheiro");
        }


    }

    public void fazNumero02(){
        String nomePessoa = Thread.currentThread().getName();
        System.out.println(nomePessoa + " batendo na porta");

        synchronized (this){
            System.out.println(nomePessoa + " entrando no banheiro");
            System.out.println(nomePessoa + " fazendo o numero 2");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nomePessoa + " dando descarga");
            System.out.println(nomePessoa + " lavando as mãos");
            System.out.println(nomePessoa + " secando as mãos");
            System.out.println(nomePessoa + " saindo do banheiro");
        }



    }
}


