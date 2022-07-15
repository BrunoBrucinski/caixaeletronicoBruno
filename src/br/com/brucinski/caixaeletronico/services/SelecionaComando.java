package br.com.brucinski.caixaeletronico.services;

import java.util.Scanner;
import java.util.concurrent.Executor;

public class SelecionaComando {

    private final ObtemComando obtemComando;
    private final CriarComandosImpl criarComando;
    ListarComandos listarComandos;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoimpl();
        this.criarComando = new CriarComandosImpl();


    }


    public boolean executar() {

        listarComandos.execute();
        int comando = obtemComando.execute();
        return criarComando.execute(comando);
    }

    private int obtemComando() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a opcao desejada: ");
        int comando = entrada.nextInt();
        return comando;
    }

    private boolean executaComandoEspecifico(int comando) {
        boolean resultant = true;

        switch (comando) {
            case 0:
                System.out.println("Encerrando o programa");
                resultant = false;
                break;

            case 1:
                System.out.println("Sacando dinheiro");
                break;

            case 2:
                System.out.println("Depositando dinheiro");

            default:
                System.out.println("Digite uma opcao valida");
                break;
        }
        return resultant;
    }

    private void Switch(int i) {
    }

    private void imprimeListaComandos() {
        System.out.println("0 para encerrar");
        System.out.println("1 para efetuar saque");
        System.out.println("2 para efetuar deposito");


    }
}


