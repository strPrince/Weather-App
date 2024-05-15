package com.example.weather.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather.Adapters.HourlyAdapters;
import com.example.weather.Domains.Hourly;
import com.example.weather.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterHourly;
private  RecyclerView recyclerView;
TextView future;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        future=findViewById(R.id.futer);
        future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FutereActivity.class);
                startActivity(intent);
            }
        });
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("9 pm",28,"cloudy"));
        items.add(new Hourly("11 pm ",29,"sunny"));
        items.add(new Hourly("12 pm",30,"wind"));
        items.add(new Hourly("1 am",29,"rainy"));
        items.add(new Hourly("2 am",27,"storm"));
        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterHourly=new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
    }

}