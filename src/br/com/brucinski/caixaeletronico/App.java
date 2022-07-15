package br.com.brucinski.caixaeletronico;

import br.com.brucinski.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletronico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();
        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }

        System.out.println("Caixa eletronico desligando!");

    }
}
