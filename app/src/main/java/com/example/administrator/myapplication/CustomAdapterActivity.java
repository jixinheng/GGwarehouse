package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        ListView listView= (ListView) findViewById(R.id.lv);
        List<String> data=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add("大污龟"+i);
        }

        CustomAdapter adapter=new CustomAdapter(data,R.layout.item_custom,this);
        listView.setAdapter(adapter);
    }
}
