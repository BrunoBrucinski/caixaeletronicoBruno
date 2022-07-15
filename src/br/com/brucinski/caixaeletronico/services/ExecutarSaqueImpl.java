package br.com.brucinski.caixaeletronico.services;

    public class ExecutarSaqueImpl implements Saque {

        public double execute(double valor, int numeroDaConte) {
            System.out.print("Sacando: " + valor);
            System.out.print("Numero da Conta: " + numeroDaConte);
            return valor;
        }

    }
