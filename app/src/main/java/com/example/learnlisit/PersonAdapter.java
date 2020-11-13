package com.example.learnlisit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnlisit.Person;
import com.example.learnlisit.R;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {
    private int resoureId;
    public PersonAdapter(Context context, int textViewResourceID, List<Person> objects){
        super(context,textViewResourceID,objects);
        resoureId = textViewResourceID;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Person person =getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resoureId,parent,false);
        ImageView perImage =(ImageView) view.findViewById(R.id.imgtou);
        TextView pername =(TextView) view.findViewById(R.id.name);
        TextView persay = (TextView) view.findViewById(R.id.says);

        perImage.setImageResource(person.getImageid());
        pername.setText(person.getName());
        persay.setText(person.getText());
        return view;
    }

}
