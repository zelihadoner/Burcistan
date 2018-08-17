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
public class Aslan extends AppCompatActivity {
    private String[] aslan={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Aslan Burcu Kadını","Aslan Burcu Erkeği","Aslan Burcu Yükseleni"};
    private Spinner spinnerAslan;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aslan);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerAslan=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, aslan);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAslan.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerAslan.getSelectedItem().toString().equals(aslan[0])){
                    display.setText(getResources().getString(R.string.aslangenelozellikler));
                }
                else if(spinnerAslan.getSelectedItem().toString().equals(aslan[1])){
                    display.setText(getResources().getString(R.string.aslankisiselozellikler));
                }
                else if(spinnerAslan.getSelectedItem().toString().equals(aslan[2])){
                    display.setText(getResources().getString(R.string.aslanfizikselozellikler));
                }
                else if(spinnerAslan.getSelectedItem().toString().equals(aslan[3])){
                    display.setText(getResources().getString(R.string.aslankadini));
                }
                else if(spinnerAslan.getSelectedItem().toString().equals(aslan[4])){
                    display.setText(getResources().getString(R.string.aslanerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.aslanyukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Aslan.this,Basak.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Aslan.this,Yengec.class);
                startActivity(intent);
            }
        });
    }
}