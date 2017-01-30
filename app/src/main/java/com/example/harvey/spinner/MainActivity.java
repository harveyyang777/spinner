package com.example.harvey.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView txv;
    Spinner cinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv=(TextView)findViewById(R.id.textView);
        cinema=(Spinner)findViewById(R.id.spinner);
        cinema.setOnItemSelectedListener(this);
    }

    public  void show(){
        String[] cinemas=getResources().getStringArray(R.array.cinemas);
        int index=cinema.getSelectedItemPosition();
        txv.setText(cinemas[index]+"的票");

    }

    public  void  clickShow(View v){
        show();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
