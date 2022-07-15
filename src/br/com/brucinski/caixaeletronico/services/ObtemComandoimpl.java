package br.com.brucinski.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoimpl implements ObtemComando {

    @Override
    public int execute() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a linha desejada: ");

        return entrada.nextInt();
    }
}
