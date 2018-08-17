package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Oglak extends AppCompatActivity {
    private String[] oglak={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Oğlak Burcu Kadını","Oğlak Burcu Erkeği","Oğlak Burcu Yükseleni"};
    private Spinner spinnerOglak;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oglak);
        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerOglak=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, oglak);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOglak.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerOglak.getSelectedItem().toString().equals(oglak[0])){
                    display.setText(getResources().getString(R.string.oglakgenelozellikler));
                }
                else if(spinnerOglak.getSelectedItem().toString().equals(oglak[1])){
                    display.setText(getResources().getString(R.string.oglakkisiselozellikler));
                }
                else if(spinnerOglak.getSelectedItem().toString().equals(oglak[2])){
                    display.setText(getResources().getString(R.string.oglakfizikselozellikler));
                }
                else if(spinnerOglak.getSelectedItem().toString().equals(oglak[3])){
                    display.setText(getResources().getString(R.string.oglakkadini));
                }
                else if(spinnerOglak.getSelectedItem().toString().equals(oglak[4])){
                    display.setText(getResources().getString(R.string.oglakerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.oglakyukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Oglak.this,Kova.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Oglak.this,Yay.class);
                startActivity(intent);
            }
        });
    }
}
