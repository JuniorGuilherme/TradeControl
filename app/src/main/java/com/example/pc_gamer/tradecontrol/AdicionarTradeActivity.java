package com.example.pc_gamer.tradecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AdicionarTradeActivity extends AppCompatActivity {
    Spinner spMoedaTrade;
    EditText etValorCompra, etValorVenda, etQtdCompra, etQtdVenda;
    Button btnAdicionarTrade;
    Moeda m = new Moeda();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_trade);
        spMoedaTrade = findViewById(R.id.spMoedaTrade);
        btnAdicionarTrade = findViewById(R.id.btnAdicionarTrade);
        etQtdCompra = findViewById(R.id.etQtdCompra);
        etQtdVenda = findViewById(R.id.etQtdVenda);
        etValorCompra = findViewById(R.id.etValorCompra);
        etValorVenda = findViewById(R.id.etValorVenda);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, m.retornaArrayMoedas());
        final ArrayAdapter<String> spArrayAdapter = arrayAdapter;
        spArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spMoedaTrade.setAdapter(spArrayAdapter);

        btnAdicionarTrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etQtdCompra.getText().length()!=0 && etQtdVenda.getText().length()!=0 && etValorCompra.getText().length()!=0 && etValorVenda.getText().length()!=0){
                    final Trade t = new Trade();

                    t.setMoeda(spMoedaTrade.getSelectedItem().toString());

                    t.setQtdVendaMoeda(Double.parseDouble(etQtdVenda.getText().toString()));
                    t.setQtdCompraMoeda(Double.parseDouble(etQtdCompra.getText().toString()));
                    t.setValorVenda(Double.parseDouble(etValorVenda.getText().toString()));
                    t.setValorCompra(Double.parseDouble(etValorCompra.getText().toString()));

                    t.adicionarTrade(t);

                    Intent intencao = new Intent(AdicionarTradeActivity.this, MainActivity.class);
                    AdicionarTradeActivity.this.startActivity(intencao);
                }
            }
        });


    }
}
