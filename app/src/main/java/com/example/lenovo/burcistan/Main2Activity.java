package com.example.lenovo.burcistan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    //Spinner içerisine koyacağımız verileri tanımlıyoruz.
    private String[] burclar={"Koç","Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak","Kova","Balık"};

    //Spinner'ları ve Adapter'lerini tanımlıyoruz.
    private Spinner spinnerBurclar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button sec=findViewById(R.id.button);
        //xml kısmında hazırladığımğız spinnerları burda tanımladıklarımızla eşleştiriyoruz.
        spinnerBurclar = findViewById(R.id.spinner1);

        //Spinner'lar için adapterleri hazırlıyoruz.
        ArrayAdapter<String> dataAdapterForBurclar = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, burclar);

        //Listelenecek verilerin görünümünü belirliyoruz.
        dataAdapterForBurclar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Hazırladğımız Adapter'leri Spinner'lara ekliyoruz.
        spinnerBurclar.setAdapter(dataAdapterForBurclar);

        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerBurclar.getSelectedItem().toString().equals(burclar[0])) {
                    Intent intent = new Intent(Main2Activity.this, Koc.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[1])){
                    Intent intent = new Intent(Main2Activity.this, Boga.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[2])){
                    Intent intent = new Intent(Main2Activity.this, Ikizler.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[3])){
                    Intent intent = new Intent(Main2Activity.this, Yengec.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[4])){
                    Intent intent = new Intent(Main2Activity.this, Aslan.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[5])){
                    Intent intent = new Intent(Main2Activity.this, Basak.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[6])){
                    Intent intent = new Intent(Main2Activity.this, Terazi.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[7])){
                    Intent intent = new Intent(Main2Activity.this, Akrep.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[8])){
                    Intent intent = new Intent(Main2Activity.this, Yay.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[9])){
                    Intent intent = new Intent(Main2Activity.this, Oglak.class);
                    startActivity(intent);
                }
                else if(spinnerBurclar.getSelectedItem().toString().equals(burclar[10])){
                    Intent intent = new Intent(Main2Activity.this, Kova.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(Main2Activity.this, Balik.class);
                    startActivity(intent);
                }
            }
        });
    }
}
