package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Boga extends AppCompatActivity {
    private String[] boga={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Boğa Burcu Kadını","Boğa Burcu Erkeği","Boğa Burcu Yükseleni"};
    private Spinner spinnerBoga;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boga);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerBoga=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, boga);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBoga.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerBoga.getSelectedItem().toString().equals(boga[0])){
                    display.setText(getResources().getString(R.string.bogagenelozellikler));
                }
                else if(spinnerBoga.getSelectedItem().toString().equals(boga[1])){
                    display.setText(getResources().getString(R.string.bogakisiselozellikler));
                }
                else if(spinnerBoga.getSelectedItem().toString().equals(boga[2])){
                    display.setText(getResources().getString(R.string.bogafizikselozellikler));
                }
                else if(spinnerBoga.getSelectedItem().toString().equals(boga[3])){
                    display.setText(getResources().getString(R.string.bogakadini));
                }
                else if(spinnerBoga.getSelectedItem().toString().equals(boga[4])){
                    display.setText(getResources().getString(R.string.bogaerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.bogayukselen));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Boga.this,Ikizler.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Boga.this,Koc.class);
                startActivity(intent);
            }
        });
    }
}
