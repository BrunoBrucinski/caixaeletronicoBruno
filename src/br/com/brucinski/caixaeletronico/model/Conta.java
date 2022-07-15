package br.com.brucinski.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;

    private double saldo;

    public Conta(double saldo) {
        this.saldo = 0;
    }

    public Conta() {

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaSaldo(double valor) {
        saldo = saldo + valor;
    }

    public boolean retirarSaldo(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.print("Saldo Insuficiente.");
            return false;
        }
    }
    }
