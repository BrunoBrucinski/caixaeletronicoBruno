package br.com.brucinski.caixaeletronico.services;

import br.com.brucinski.caixaeletronico.repository.MemoriaContaRepository;

import java.util.SortedMap;

public class ExecutarDepositoImpl implements Deposito {

    public ExecutarDepositoImpl(MemoriaContaRepository repository) {

    }


        @Override
        public void execute(double valor, int numeroDaConta) {
            System.out.print("Depositando: " + valor);
            System.out.print("Numero da Conta: " + numeroDaConta);

        }
    }
