package br.com.brucinski.caixaeletronico.repository;

import br.com.brucinski.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class MemoriaContaRepository implements BaseRepository<Conta> {

    private List<Conta> contas = new ArrayList<>();



    @Override
    public List<Conta> find() {
        return contas;
    }

    @Override
    public Conta findById(int id) {
        return contas.get(id);
    }

    @Override
    public void adiciona(Conta objeto) {
        objeto.setNumeroDaConta(contas.size());
        contas.add(objeto);
    }
}
