package com.example.currencyconvertapp.currencyconverter;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;


    public void rupeeChange(View view)
    {
        EditText inputCurrency = (EditText) findViewById(R.id.inputCurrency);
        String checkInput = inputCurrency.getText().toString().trim();
        boolean values = TextUtils.isEmpty(checkInput);

        if(!values) {
            double x;
            x = Double.parseDouble(inputCurrency.getText().toString()) * 69.8;
            //String y=Double.toString(x);
            String y = String.format("%.2f", x);

            Toast.makeText(this, inputCurrency.getText().toString() + " USD in INR is " + y, Toast.LENGTH_LONG).show();

            ImageView image = (ImageView) findViewById(R.id.dollarImageView);
            image.setImageResource(R.drawable.rupee);
        }

        else {
            Toast.makeText(this,"Please enter the amount in dollars",Toast.LENGTH_SHORT).show();
        }
    }

    public void euroChange(View view){

        EditText inputCurrency = (EditText) findViewById(R.id.inputCurrency);
        String checkInput = inputCurrency.getText().toString().trim();
        boolean values = TextUtils.isEmpty(checkInput);

        if(!values) {
            double x;
            x = Double.parseDouble(inputCurrency.getText().toString()) * 0.89;
            String y = String.format("%.2f", x);

            Toast.makeText(this, inputCurrency.getText().toString() + " USD in EUR is " + y, Toast.LENGTH_LONG).show();
            ImageView image = (ImageView) findViewById(R.id.dollarImageView);
            image.setImageResource(R.drawable.euro);
        }

        else {
            Toast.makeText(this,"Please enter the amount in dollars",Toast.LENGTH_SHORT).show();
        }
    }

    public void poundChange(View view){



        EditText inputCurrency = (EditText) findViewById(R.id.inputCurrency);
        String checkInput = inputCurrency.getText().toString().trim();
        boolean values = TextUtils.isEmpty(checkInput);

        if(!values) {
            double x;
            x = Double.parseDouble(inputCurrency.getText().toString()) * 0.8;
            String y = String.format("%.2f", x);

            Toast.makeText(this, inputCurrency.getText().toString() + " USD in GBP is " + y, Toast.LENGTH_LONG).show();
            ImageView image = (ImageView) findViewById(R.id.dollarImageView);
            image.setImageResource(R.drawable.pounds);
        }

        else {
            Toast.makeText(this,"Please enter the amount in dollars",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
