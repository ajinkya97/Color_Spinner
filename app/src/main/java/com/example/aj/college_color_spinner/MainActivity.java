package com.example.aj.college_color_spinner;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    String color[]={"RED","GREEN","BLUE","ORANGE"};

    String red="fdff00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout back=(RelativeLayout)findViewById(R.id.back);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,color);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin=(Spinner)findViewById(R.id.spin);
        spin.setAdapter(adapter);
//        setContentView(spin);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String message=color[position];
                if(message=="RED")
                {
                    back.setBackgroundColor(Color.parseColor("#ff0000"));
                }
                else if(message=="GREEN")
                {
                    back.setBackgroundColor(Color.parseColor("#00ff00"));
                }
                else if(message=="BLUE")
                {
                    back.setBackgroundColor(Color.parseColor("#0066ff"));
                }
                else if(message=="ORANGE")
                {
                    back.setBackgroundColor(Color.parseColor("#ff6600"));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
