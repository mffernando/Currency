package com.example.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder newViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.newViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.newViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.newViewHolder.textEuro = (TextView) findViewById(R.id.text_euro);
        this.newViewHolder.buttonCalc = (Button) findViewById(R.id.button_calc);

    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalc;
    }

}
