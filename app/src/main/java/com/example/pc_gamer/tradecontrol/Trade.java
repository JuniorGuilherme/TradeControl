package com.example.pc_gamer.tradecontrol;

import java.util.ArrayList;

/**
 * Created by PC-Gamer on 11/12/2017.
 */

public class Trade {
    private String moeda;
    private double qtdCompraMoeda;
    private double qtdVendaMoeda;
    private double valorCompra;
    private double valorVenda;
    private Double lucroLiquido;
    private Double montanteOperacao;
    ArrayList<Trade> lt = new ArrayList<>();

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getQtdCompraMoeda() {
        return qtdCompraMoeda;
    }

    public void setQtdCompraMoeda(double qtdCompraMoeda) {
        this.qtdCompraMoeda = qtdCompraMoeda;
    }

    public double getQtdVendaMoeda() {
        return qtdVendaMoeda;
    }

    public void setQtdVendaMoeda(double qtdVendaMoeda) {
        this.qtdVendaMoeda = qtdVendaMoeda;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(double lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }

    public Double getMontanteOperacao() {
        return montanteOperacao;
    }

    public void setMontanteOperacao(double montanteOperacao) {
        this.montanteOperacao = montanteOperacao;
    }

    public void adicionarTrade(Trade t){
        t.setLucroLiquido((qtdVendaMoeda*valorVenda)-(qtdCompraMoeda*valorCompra));
        t.setMontanteOperacao(qtdVendaMoeda*valorVenda);

        lt.add(t);
    }

    public ArrayList retornaArrayTrades(){
        return lt;
    }
}
