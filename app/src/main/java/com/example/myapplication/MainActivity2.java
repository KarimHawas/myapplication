package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=(ListView)findViewById(R.id.listview);
        final ArrayList<String> arraylist=new ArrayList<>();

        arraylist.add("Android") ;
        arraylist.add("iPhone") ;
        arraylist.add("Windows") ;
        arraylist.add("Bluckberry") ;
        arraylist.add("Linux") ;

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arraylist);

         listView.setAdapter(arrayAdapter);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                 Toast.makeText(MainActivity2.this,"clicked item:"+i+" "+arraylist.get(i).toString(),Toast.LENGTH_SHORT).show();
                 Intent intent =new Intent(MainActivity2.this, Main3Activity.class);
                 startActivity(intent);


             }
         });

        }

    }





