package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Kova extends AppCompatActivity {
    private String[] kova={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Kova Burcu Kadını","Kova Burcu Erkeği","Kova Burcu Yükseleni"};
    private Spinner spinnerKova;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kova);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerKova=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, kova);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKova.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerKova.getSelectedItem().toString().equals(kova[0])){
                    display.setText(getResources().getString(R.string.kovagenelozellikler));
                }
                else if(spinnerKova.getSelectedItem().toString().equals(kova[1])){
                    display.setText(getResources().getString(R.string.kovakisiselozellikler));
                }
                else if(spinnerKova.getSelectedItem().toString().equals(kova[2])){
                    display.setText(getResources().getString(R.string.kovafizikselozellikler));
                }
                else if(spinnerKova.getSelectedItem().toString().equals(kova[3])){
                    display.setText(getResources().getString(R.string.kovakadini));
                }
                else if(spinnerKova.getSelectedItem().toString().equals(kova[4])){
                    display.setText(getResources().getString(R.string.kovaerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.kovayukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kova.this,Balik.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kova.this,Oglak.class);
                startActivity(intent);
            }
        });
    }
}
