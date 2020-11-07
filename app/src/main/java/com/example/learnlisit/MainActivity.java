package com.example.learnlisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialView();
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
                //TODO YOUR LOGIC...
                String inputtext = editText.getText().toString();
                Toast.makeText(MainActivity.this,inputtext,
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.button1:
                Intent intent =new Intent(MainActivity.this,Relative.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 =new Intent(MainActivity.this,Frame.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(MainActivity.this,grid.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 = new Intent(MainActivity.this,ListviewActivity.class);
                startActivity(intent3);
                break;
            case R.id.button5:
                Intent intent4 = new Intent(MainActivity.this,ListViewActivity2.class);
                startActivity(intent4);
            default:
                break;
        }
    }

    public void InitialView(){
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        editText = (EditText) findViewById(R.id.edittext);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }


}
