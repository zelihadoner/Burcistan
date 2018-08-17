package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Ikizler extends AppCompatActivity {
    private String[] ikizler={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","İkizler Burcu Kadını","İkizler Burcu Erkeği","İkizler Burcu Yükseleni"};
    private Spinner spinnerIkizler;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikizler);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerIkizler=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ikizler);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIkizler.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerIkizler.getSelectedItem().toString().equals(ikizler[0])){
                    display.setText(getResources().getString(R.string.ikizlergenelozellikler));
                }
                else if(spinnerIkizler.getSelectedItem().toString().equals(ikizler[1])){
                    display.setText(getResources().getString(R.string.ikizlerkisiselozellikler));
                }
                else if(spinnerIkizler.getSelectedItem().toString().equals(ikizler[2])){
                    display.setText(getResources().getString(R.string.ikizlerfizikselozellikler));
                }
                else if(spinnerIkizler.getSelectedItem().toString().equals(ikizler[3])){
                    display.setText(getResources().getString(R.string.ikizlerkadini));
                }
                else if(spinnerIkizler.getSelectedItem().toString().equals(ikizler[4])){
                    display.setText(getResources().getString(R.string.ikizlererkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.ikizleryukselen));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ikizler.this,Yengec.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ikizler.this,Boga.class);
                startActivity(intent);
            }
        });
    }
}
