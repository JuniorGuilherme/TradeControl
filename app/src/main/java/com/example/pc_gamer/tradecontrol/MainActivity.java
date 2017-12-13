package com.example.pc_gamer.tradecontrol;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTelaAddTrade;
    Button btnListaTrades;
    Button btnAtualizarCapital;
    EditText etSaldoCapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelaAddTrade = findViewById(R.id.btnTelaAddTrade);
        btnListaTrades = findViewById(R.id.btnListaTrades);
        btnAtualizarCapital = findViewById(R.id.btnAtualizarCapital);
        etSaldoCapital = findViewById(R.id.etSaldoCapital);

        if(Trade.getSaldoCapital()==null){
            etSaldoCapital.setText("0");
        }else {
            etSaldoCapital.setText(Trade.getSaldoCapital().toString());
        }

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

        btnAtualizarCapital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(btnAtualizarCapital.getText().equals("Atualizar")){
                    etSaldoCapital.setEnabled(true);
                    btnAtualizarCapital.setText("Feito!");
                }else{
                    Trade.setSaldoCapital(Double.parseDouble(etSaldoCapital.getText().toString()));
                    etSaldoCapital.setEnabled(false);
                    Context contexto = getApplicationContext();
                    int duracao = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(contexto, "Capital atualizado." ,duracao);
                    toast.show();
                    btnAtualizarCapital.setText("Atualizar");
                }

            }
        });
    }
}
