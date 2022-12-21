package org.threads.deadlock;

public class TarefaParaAcessarProcedure implements Runnable {
    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaParaAcessarProcedure(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (tx){
            System.out.println("Começando a Transação");
            tx.begin();

            synchronized (pool){
                System.out.println("Peguei a conexão do Pool");
                pool.getConnection();
            }
        }
    }
}
