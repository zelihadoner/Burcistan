package com.example.lenovo.burcistan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

@SuppressLint("Registered")
public class Yengec extends AppCompatActivity {
    private String[] yengec={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Yengeç Burcu Kadını","Yengeç Burcu Erkeği","Yengeç Burcu Yükseleni"};
    private Spinner spinnerYengec;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yengec);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerYengec=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, yengec);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerYengec.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerYengec.getSelectedItem().toString().equals(yengec[0])){
                    display.setText(getResources().getString(R.string.yengeclergenelozellikler));
                }
                else if(spinnerYengec.getSelectedItem().toString().equals(yengec[1])){
                    display.setText(getResources().getString(R.string.yengeckisiselozellikler));
                }
                else if(spinnerYengec.getSelectedItem().toString().equals(yengec[2])){
                    display.setText(getResources().getString(R.string.yengecfizikselozellikler));
                }
                else if(spinnerYengec.getSelectedItem().toString().equals(yengec[3])){
                    display.setText(getResources().getString(R.string.yengeckadini));
                }
                else if(spinnerYengec.getSelectedItem().toString().equals(yengec[4])){
                    display.setText(getResources().getString(R.string.yengecerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.yengecyukselen));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Yengec.this,Aslan.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Yengec.this,Ikizler.class);
                startActivity(intent);
            }
        });
        }
    }