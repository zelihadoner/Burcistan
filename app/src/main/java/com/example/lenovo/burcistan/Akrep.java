package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Akrep extends AppCompatActivity {
    private String[] akrep={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Akrep Burcu Kadını","Akrep Burcu Erkeği","Akrep Burcu Yükseleni"};
    private Spinner spinnerAkrep;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akrep);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerAkrep=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, akrep);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAkrep.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerAkrep.getSelectedItem().toString().equals(akrep[0])){
                    display.setText(getResources().getString(R.string.akrepgenelozellikler));
                }
                else if(spinnerAkrep.getSelectedItem().toString().equals(akrep[1])){
                    display.setText(getResources().getString(R.string.akrepkisiselozellikler));
                }
                else if(spinnerAkrep.getSelectedItem().toString().equals(akrep[2])){
                    display.setText(getResources().getString(R.string.akrepfizikselozellikler));
                }
                else if(spinnerAkrep.getSelectedItem().toString().equals(akrep[3])){
                    display.setText(getResources().getString(R.string.akrepkadini));
                }
                else if(spinnerAkrep.getSelectedItem().toString().equals(akrep[4])){
                    display.setText(getResources().getString(R.string.akreperkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.akrepyukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Akrep.this,Yay.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Akrep.this,Terazi.class);
                startActivity(intent);
            }
        });
    }
}
