package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Basak extends AppCompatActivity {

    private String[] basak={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Başak Burcu Kadını","Başak Burcu Erkeği","Başak Burcu Yükseleni"};
    private Spinner spinnerBasak;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basak);

        Button goster=findViewById(R.id.goster);
        Button back=findViewById(R.id.back);
        Button next=findViewById(R.id.next);
        spinnerBasak=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, basak);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBasak.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerBasak.getSelectedItem().toString().equals(basak[0])){
                    display.setText(getResources().getString(R.string.basakgenelozellikler));
                }
                else if(spinnerBasak.getSelectedItem().toString().equals(basak[1])){
                    display.setText(getResources().getString(R.string.basakkisiselozellikler));
                }
                else if(spinnerBasak.getSelectedItem().toString().equals(basak[2])){
                    display.setText(getResources().getString(R.string.basakfizikselozellikler));
                }
                else if(spinnerBasak.getSelectedItem().toString().equals(basak[3])){
                    display.setText(getResources().getString(R.string.basakkadini));
                }
                else if(spinnerBasak.getSelectedItem().toString().equals(basak[4])){
                    display.setText(getResources().getString(R.string.basakerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.basakyukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Basak.this,Terazi.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Basak.this,Aslan.class);
                startActivity(intent);
            }
        });
    }
}
