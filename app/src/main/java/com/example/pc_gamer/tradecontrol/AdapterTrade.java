package com.example.pc_gamer.tradecontrol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC-Gamer on 11/12/2017.
 */

public class AdapterTrade extends BaseAdapter {
    ArrayList<Trade> trades;
    Context context;

    public AdapterTrade(ArrayList<Trade> trades, Context context){
        this.trades = trades;
        this.context = context;
    }

    @Override
    public int getCount() {
        return trades.size();
    }

    @Override
    public Object getItem(int i) {
        return trades.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView = LayoutInflater.from(context).inflate(R.layout.item_trade, viewGroup, false);
        TextView tvLucroLiquido = resultView.findViewById(R.id.tvLucroLiquido);
        TextView tvSaldoTrade = resultView.findViewById(R.id.tvSaldoTrade);
        TextView tvQtdComprada = resultView.findViewById(R.id.tvQtdCompra);
        TextView tvQtdVendida = resultView.findViewById(R.id.tvQtdVenda);
        TextView tvValorCompra = resultView.findViewById(R.id.tvValorCompra);
        TextView tvValorVenda = resultView.findViewById(R.id.tvValorVenda);
        TextView tvMoedaTrade = resultView.findViewById(R.id.tvMoedaTrade);


        Trade t = trades.get(i);
        DecimalFormat precision = new DecimalFormat("0.00");
// dblVariable is a number variable and not a String in this case

        tvLucroLiquido.setText(String.format("%.2f",t.getLucroLiquido()));
        tvSaldoTrade.setText(String.format("%.2f",t.getSaldoTrade()));
        tvQtdComprada.setText(t.getQtdCompraMoeda().toString());
        tvQtdVendida.setText(t.getQtdVendaMoeda().toString());
        tvValorCompra.setText(t.getValorCompra().toString());
        tvValorVenda.setText(t.getValorVenda().toString());
        tvMoedaTrade.setText(t.getMoeda().toString());

        if(i % 2 ==0){
            resultView.setBackgroundColor(252235205);
        }


        return resultView;
    }
}
