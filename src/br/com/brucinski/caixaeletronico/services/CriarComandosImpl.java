package br.com.brucinski.caixaeletronico.services;

import br.com.brucinski.caixaeletronico.repository.MemoriaContaRepository;

public class CriarComandosImpl implements CriarComandos {

    private final Deposito deposito;
    private final AbrirConta abrirConta;
    private Saque saque;

    public CriarComandosImpl() {
        MemoriaContaRepository repository = null;
        this.deposito = new ExecutarDepositoImpl(repository);
        this.saque = new ExecutarSaqueImpl();
        this.abrirConta = new AbrirConta() {
            @Override
            public Object execute(int conta) {
                return null;
            }
        };

    }

    @Override
    public boolean execute(int comando) {

        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;

        } else if (comando == 1) {
            saque.execute(50.00, 575295);

        } else if (comando == 2) {
            deposito.execute(20.00, 575295);

        } else System.out.println("Digite uma opcao valida");


        return resultado;
    }
}