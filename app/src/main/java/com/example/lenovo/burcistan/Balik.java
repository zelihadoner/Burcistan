package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Balik extends AppCompatActivity {
    private String[] balik={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Balık Burcu Kadını","Balık Burcu Erkeği","Balık Burcu Yükseleni"};
    private Spinner spinnerBalik;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balik);

        Button goster=findViewById(R.id.goster);
        Button back=findViewById(R.id.back);
        spinnerBalik=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, balik);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBalik.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerBalik.getSelectedItem().toString().equals(balik[0])){
                    display.setText(getResources().getString(R.string.balikgenelozellikler));
                }
                else if(spinnerBalik.getSelectedItem().toString().equals(balik[1])){
                    display.setText(getResources().getString(R.string.balikkisiselozellikler));
                }
                else if(spinnerBalik.getSelectedItem().toString().equals(balik[2])){
                    display.setText(getResources().getString(R.string.balikfizikselozellikler));
                }
                else if(spinnerBalik.getSelectedItem().toString().equals(balik[3])){
                    display.setText(getResources().getString(R.string.balikkadini));
                }
                else if(spinnerBalik.getSelectedItem().toString().equals(balik[4])){
                    display.setText(getResources().getString(R.string.balikerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.balikyukselen));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Balik.this,Kova.class);
                startActivity(intent);
            }
        });
    }
}
