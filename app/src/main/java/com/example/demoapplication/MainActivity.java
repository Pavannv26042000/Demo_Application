package com.example.demoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demoapplication.adapter.ContactAdapter;
import com.example.demoapplication.data.Contact;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recylerview = findViewById(R.id.Contacts);
        recylerview.setLayoutManager(new LinearLayoutManager(this));
        recylerview.setAdapter(new ContactAdapter(getdata()));

    }

    public ArrayList<Contact> getdata() {
        ArrayList<Contact> list = new ArrayList<>();
        Contact c1 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add( c1);
        Contact c2 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add( c2);
        Contact c3 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add( c3);
        Contact c4 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add(c4);
        Contact c5 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add(c5);
        Contact c6 = new Contact("pavan", "7899569686", R.drawable.virat);
        list.add(c6);


        return list;
    }
}