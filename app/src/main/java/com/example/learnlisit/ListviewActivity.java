package com.example.learnlisit;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListviewActivity extends AppCompatActivity {

    private String[] friend ={"Tony","Mary","John","Jessica","Midicon","Qxx","Pony Ma"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_expandable_list_item_1,friend);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

    }
}
