package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Koc extends AppCompatActivity {

    private String[] koc={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri",
            "Koç Burcu Kadını", "Koç Burcu Erkeği","Koç Burcu Yükseleni"};
    private Spinner spinnerKoc;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koc);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        display=findViewById(R.id.display);

        spinnerKoc=findViewById(R.id.spinner1);
        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, koc);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKoc.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerKoc.getSelectedItem().toString().equals(koc[0])){
                    display.setText(getResources().getString(R.string.kocgenelozellikler));
                }
                else if(spinnerKoc.getSelectedItem().toString().equals(koc[1])){
                    display.setText(getResources().getString(R.string.kockisiselozellikler));
                }
                else if(spinnerKoc.getSelectedItem().toString().equals(koc[2])){
                    display.setText(getResources().getString(R.string.kocfizikselozellikler));
                }
                else if(spinnerKoc.getSelectedItem().toString().equals(koc[3])){
                    display.setText(getResources().getString(R.string.kockadini));
                }
                else if(spinnerKoc.getSelectedItem().toString().equals(koc[4])){
                    display.setText(getResources().getString(R.string.kocerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.kocyukselen));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Koc.this,Boga.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Koc.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
