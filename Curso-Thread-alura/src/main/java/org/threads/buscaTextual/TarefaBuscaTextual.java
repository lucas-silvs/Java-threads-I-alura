package org.threads.buscaTextual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {
    private String nomeArquivo;
    private String nomePessoa;

    public TarefaBuscaTextual(String nomeArquivo, String nomePessoa) {
        this.nomeArquivo = nomeArquivo;
        this.nomePessoa = nomePessoa;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            int numLinha = 1;
            while (scanner.hasNextLine()){
                String linha = scanner.nextLine();

                if(linha.toLowerCase().contains(nomePessoa.toLowerCase())){
                    System.out.println("no arquivo " + nomeArquivo + " possui o nome informado: " + nomePessoa + " na linha " + numLinha);
                }
                numLinha++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado: " + e);
        }

    }
}
