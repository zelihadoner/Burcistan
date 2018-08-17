package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Yay extends AppCompatActivity {
    private String[] yay={"Genel Özellikleri","Kişisel Özellikleri","Fiziksel Özellikleri","Yay Burcu Kadını","Yay Burcu Erkeği","Yay Burcu Yükseleni"};
    private Spinner spinnerYay;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yay);

        Button goster=findViewById(R.id.goster);
        Button next=findViewById(R.id.next);
        Button back=findViewById(R.id.back);
        spinnerYay=findViewById(R.id.spinner1);
        display=findViewById(R.id.display);

        ArrayAdapter<String> dataAdapterForKoc = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, yay);
        dataAdapterForKoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerYay.setAdapter(dataAdapterForKoc);

        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerYay.getSelectedItem().toString().equals(yay[0])){
                    display.setText(getResources().getString(R.string.yaygenelozellikler));
                }
                else if(spinnerYay.getSelectedItem().toString().equals(yay[1])){
                    display.setText(getResources().getString(R.string.yaykisiselozellikler));
                }
                else if(spinnerYay.getSelectedItem().toString().equals(yay[2])){
                    display.setText(getResources().getString(R.string.yayfizikselozellikler));
                }
                else if(spinnerYay.getSelectedItem().toString().equals(yay[3])){
                    display.setText(getResources().getString(R.string.yaykadini));
                }
                else if(spinnerYay.getSelectedItem().toString().equals(yay[4])){
                    display.setText(getResources().getString(R.string.yayerkegi));
                }
                else{
                    display.setText(getResources().getString(R.string.yayyukselen));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Yay.this,Oglak.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Yay.this,Akrep.class);
                startActivity(intent);
            }
        });
    }
}
