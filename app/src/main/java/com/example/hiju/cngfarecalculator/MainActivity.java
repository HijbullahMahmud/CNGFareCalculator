package com.example.hiju.cngfarecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etWaitingTime;
    EditText etDistance;
    Button btnResult;
    TextView tvResult;
    int num1;
    float num2;
    float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the element
        etWaitingTime = (EditText) findViewById(R.id.etWaitingTime);
        etDistance = (EditText) findViewById(R.id.etDistance);
        btnResult = (Button) findViewById(R.id.btnResult);
        tvResult = (TextView) findViewById(R.id.tvResult);


    }


    public void functionCalculator(View view) {

        if (etWaitingTime.getText().toString().isEmpty()) {
            Toast.makeText(this, "Waiting time is required", Toast.LENGTH_SHORT).show();
        }
        else if (etDistance.getText().toString().isEmpty()) {
            Toast.makeText(this, "Distance is required", Toast.LENGTH_SHORT).show();
        }else {
            num1 = Integer.parseInt(etWaitingTime.getText().toString());
            num2 = Float.parseFloat(etDistance.getText().toString());
            result = 40 + (num1 * 2) + (num2 - 2) * 12;
            tvResult.setText(String.valueOf(result + " tk" + System.getProperty ("line.separator")+ "Waiting time: "+num1+" min" +System.getProperty ("line.separator")+"Distance: "+num2+ " km"));
            etWaitingTime.setText("");
            etDistance.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       /* menu.add(0, 0, 0, "Add student").setIcon(R.drawable.add);*/
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }


    public void aboutOnClick(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }
}







