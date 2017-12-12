package com.example.pc_gamer.tradecontrol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC-Gamer on 11/12/2017.
 */

public class Moeda {
    private String nome;
    public List<String> retornaArrayMoedas(){
        List<String> moedas = new ArrayList<>();

        Moeda m = new Moeda();

        m.setNome("Bitcoin");
        moedas.add(m.getNome());
        m.setNome("Litecoin");
        moedas.add(m.getNome());
        m.setNome("IOTA");
        moedas.add(m.getNome());
        m.setNome("Ethereum");
        moedas.add(m.getNome());
        m.setNome("BitcoinZ");
        moedas.add(m.getNome());

        return moedas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
