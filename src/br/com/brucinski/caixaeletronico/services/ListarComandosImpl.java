package br.com.brucinski.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
            System.out.println("0 para encerrar");
            System.out.println("1 para efetuar saque");
            System.out.println("2 para efetuar deposito");
            System.out.println("3 para abrir uma conta");
    }
}
