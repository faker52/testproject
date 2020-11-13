package com.example.learnlisit;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnlisit.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity2 extends AppCompatActivity {
    List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
    private String[] friend ={"Tony","Mary","Jessica","Midicon","Qxx","Pony Ma","Donald Trump"};
    private String[] says={"充钱就能变强"};

    private int[] head={R.drawable.tony,R.drawable.img1,R.drawable.jessica,R.drawable.midicion,R.drawable.qxx,R.drawable.pony,R.drawable.trmp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        Initial1();

        SimpleAdapter myAdapter = new SimpleAdapter(this, listitem, R.layout.person_item, new String[]{"touxiang", "name", "says"}, new int[]{R.id.imgtou, R.id.name, R.id.says});
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(myAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position,long id){
                Map<String, Object> map= new HashMap<>();
                map=listitem.get(position);
                Toast.makeText(ListViewActivity2.this,map.get("name").toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*private void Initial(){
        for(int i=0;i<friend.length;i++){
            Person person1 = new Person(friend[i],head[0]);
            list.add(person1);
        }

    }*/
    private void Initial1(){

        for (int i = 0; i < friend.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("touxiang", head[i]);
            showitem.put("name", friend[i]);
            showitem.put("says", says[0]);
            listitem.add(showitem);
        }
    }
}