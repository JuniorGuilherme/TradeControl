package com.example.pc_gamer.tradecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTelaAddTrade;
    Button btnListaTrades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelaAddTrade = findViewById(R.id.btnTelaAddTrade);
        btnListaTrades = findViewById(R.id.btnListaTrades);

        btnTelaAddTrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, AdicionarTradeActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });

        btnListaTrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this, ListaTradesActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });
    }
}
