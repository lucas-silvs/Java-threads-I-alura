package org.threads.banheiro;

public class Banheiro {

    private boolean ehSujo = true;

    public void fazNumero01(){
        String nomePessoa = Thread.currentThread().getName();
        System.out.println(nomePessoa + " batendo na porta");


        synchronized (this){
            System.out.println(nomePessoa + " entrando no banheiro");


            while(ehSujo){
                esperaBanheiroSerLimpo(nomePessoa);
            }

            System.out.println(nomePessoa + " fazendo o numero 1");
            this.ehSujo = true;

            usandoBanheiro(5000);

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

            while(ehSujo){
                esperaBanheiroSerLimpo(nomePessoa);
            }

            System.out.println(nomePessoa + " fazendo o numero 2");
            this.ehSujo = true;

            usandoBanheiro(10000);

            System.out.println(nomePessoa + " dando descarga");
            System.out.println(nomePessoa + " lavando as mãos");
            System.out.println(nomePessoa + " secando as mãos");
            System.out.println(nomePessoa + " saindo do banheiro");
        }



    }

    public void limpaBanheiro(){
        String nomePessoa = Thread.currentThread().getName();
        System.out.println(nomePessoa + " batendo na porta");
        synchronized (this) {
            if (!ehSujo){
                System.out.println(nomePessoa + " Banheiro não está sujo, saindo do banheiro");
                return;
            }

            System.out.println(nomePessoa + " limpando o banheiro");
            usandoBanheiro(3000);
            this.ehSujo = false;

            this.notifyAll();

        }
    }



    private static void usandoBanheiro(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void esperaBanheiroSerLimpo(String nomePessoa) {
        System.out.println(nomePessoa + " banheiro sujo, saindo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


