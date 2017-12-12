package com.example.pc_gamer.tradecontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaTradesActivity extends AppCompatActivity {
    Trade t = new Trade();
    Moeda m = new Moeda();
    ListView lvTrades;
    AdapterTrade adapterTrade = new AdapterTrade(t.retornaArrayTrades(), this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_trades);

        lvTrades = findViewById(R.id.lvTrades);


        lvTrades.setAdapter(adapterTrade);
    }
}
