package com.example.pc_gamer.tradecontrol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC-Gamer on 11/12/2017.
 */

public class AdapterTrade extends BaseAdapter {
    List<Trade> trades;
    Context context;

    public AdapterTrade(List<Trade> trades, Context context){
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
        TextView tvMontanteOperacao = resultView.findViewById(R.id.tvMontanteOperacao);

        Trade t = trades.get(i);

        tvLucroLiquido.setText(t.getLucroLiquido().toString());
        tvMontanteOperacao.setText(t.getMontanteOperacao().toString());
        return null;
    }
}
