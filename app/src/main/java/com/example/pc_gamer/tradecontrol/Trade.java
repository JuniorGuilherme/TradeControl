package com.example.pc_gamer.tradecontrol;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by PC-Gamer on 11/12/2017.
 */

public class Trade {
    private String moeda;
    private double qtdCompraMoeda;
    private double qtdVendaMoeda;
    private double valorCompra;
    private double valorVenda;
    private double lucroLiquido;
    private double saldoTrade;
    private static Double saldoCapital;
    private Date data;
    static ArrayList<Trade> lt = new ArrayList<>();

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public Double getQtdCompraMoeda() {
        return qtdCompraMoeda;
    }

    public void setQtdCompraMoeda(double qtdCompraMoeda) {
        this.qtdCompraMoeda = qtdCompraMoeda;
    }

    public Double getQtdVendaMoeda() {
        return qtdVendaMoeda;
    }

    public void setQtdVendaMoeda(double qtdVendaMoeda) {
        this.qtdVendaMoeda = qtdVendaMoeda;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
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

    public static Double getSaldoCapital() {
        return saldoCapital;
    }

    public static void setSaldoCapital(Double saldoCapital) {
        Trade.saldoCapital = saldoCapital;
    }

    public double getSaldoTrade() {
        return saldoTrade;
    }

    public void setSaldoTrade(double saldoTrade) {
        this.saldoTrade = saldoTrade;
    }


    public void adicionarTrade(Trade t){
        t.setLucroLiquido((qtdVendaMoeda*valorVenda)-(qtdCompraMoeda*valorCompra));
        t.setSaldoTrade(t.getSaldoCapital()+t.lucroLiquido);
        t.setSaldoCapital(t.getSaldoCapital()+t.lucroLiquido);


        lt.add(t);
    }

    public ArrayList retornaArrayTrades(){
        return lt;
    }
}
