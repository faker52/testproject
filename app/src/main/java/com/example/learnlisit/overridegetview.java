package com.example.learnlisit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class overridegetview extends AppCompatActivity {
    private List<Person> list= new ArrayList<>();
    private String[] friend ={"Tony","Mary","Jessica","Midicon","Qxx","Pony Ma","Donald Trump"};
    private String[] says={"充钱就能变强"};

    private int[] head={R.drawable.tony,R.drawable.img1,R.drawable.jessica,R.drawable.midicion,R.drawable.qxx,R.drawable.pony,R.drawable.trmp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        initial();
        PersonAdapter adapter = new PersonAdapter(this,R.layout.person_item,list);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

    public void initial(){
        for(int i=0;i<friend.length;i++){
            Person person = new Person(friend[i],head[i],says[0]);
            list.add(person);
        }
    }
}
