package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Terazi extends AppCompatActivity {

    private String[] terazi={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Terazi Burcu Kadını","Terazi Burcu Erkeği","Terazi Burcu Yükseleni"};
    private Spinner spinnerTerazi;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terazi);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerTerazi=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, terazi);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTerazi.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerTerazi.getSelectedItem().toString().equals(terazi[0])){
                    display.setText(getResources().getString(R.string.terazigenelozellikler));
                }
                else if(spinnerTerazi.getSelectedItem().toString().equals(terazi[1])){
                    display.setText(getResources().getString(R.string.terazikisiselozellikler));
                }
                else if(spinnerTerazi.getSelectedItem().toString().equals(terazi[2])){
                    display.setText(getResources().getString(R.string.terazifizikselozellikler));
                }
                else if(spinnerTerazi.getSelectedItem().toString().equals(terazi[3])){
                    display.setText(getResources().getString(R.string.terazikadini));
                }
                else if(spinnerTerazi.getSelectedItem().toString().equals(terazi[4])){
                    display.setText(getResources().getString(R.string.terazierkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.teraziyukselen));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Terazi.this,Akrep.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Terazi.this,Basak.class);
                startActivity(intent);
            }
        });
    }
}
