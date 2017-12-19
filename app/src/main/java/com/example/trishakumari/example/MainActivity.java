package com.example.trishakumari.example;

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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText4, editText5;
    private Button buttonSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*
            }
        });*/
        addListnerOnButton();
    }
    public void addListnerOnButton(){
       editText4  = (EditText)findViewById(R.id.editText4);
       editText5 = (EditText)findViewById(R.id.editText5);
       buttonSum = (Button)findViewById(R.id.button);
       buttonSum.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String v1 = editText4.getText().toString();
               String v2 = editText5.getText().toString();
               int a = Integer.parseInt(v1);
               int b = Integer.parseInt(v2);
               int sum = a + b;
               Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
           }


       });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
