package com.example.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder newViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.newViewHolder.editValue = (EditText) findViewById(R.id.edit_value);
        this.newViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.newViewHolder.textEuro = (TextView) findViewById(R.id.text_euro);

        //button
        this.newViewHolder.buttonCalc = (Button) findViewById(R.id.button_calc);
        this.newViewHolder.buttonCalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_calc) {
            //this.newViewHolder.buttonCalc.setText("TEST");
            Double value = Double.valueOf(this.newViewHolder.editValue.getText().toString());
            this.newViewHolder.textDollar.setText(String.format("$ %.2f",value * 3));
            this.newViewHolder.textEuro.setText(String.format("€ %.2f", value * 4));
        }
    }

    private static class ViewHolder {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalc;
    }

}
