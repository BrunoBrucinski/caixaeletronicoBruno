package br.com.brucinski.caixaeletronico.services;

import br.com.brucinski.caixaeletronico.model.Conta;
import br.com.brucinski.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {

    private final MemoriaContaRepository repository;
    public AbrirContaImpl(MemoriaContaRepository repository){
        this.repository = repository;
    }

    public Conta execute(){
        Conta conta;
        
        conta = new Conta();

        System.out.printf("Conta numero %d o saldo atual e de R$ 2f %n", conta.getNumeroDaConta(), conta.getSaldo());

        return conta;

    }

    @Override
    public Object execute(int conta) {
        return null;
    }
}
