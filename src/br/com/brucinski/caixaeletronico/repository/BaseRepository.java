package br.com.brucinski.caixaeletronico.repository;

import java.util.List;

public interface BaseRepository<T> {



    List<T> find();


    T findById(int id);

    void adiciona(T objeto);
}
