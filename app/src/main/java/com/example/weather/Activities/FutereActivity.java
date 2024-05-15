package com.example.weather.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather.Adapters.FutureAdapters;
import com.example.weather.Adapters.HourlyAdapters;
import com.example.weather.Domains.FutureDomain;
import com.example.weather.R;

import java.util.ArrayList;

public class FutereActivity extends AppCompatActivity {

private RecyclerView.Adapter adaptertommorow;
public RecyclerView recyclerView;
    private View ConstraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_futere);
   initRecyclerView();
   setVisible();
    }

    private void setVisible() {
       ImageView backbtn=findViewById(R.id.back);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FutereActivity.this,MainActivity.class));
            }
        });

    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items=new ArrayList<>();
        items.add(new FutureDomain("Sat" , "Storm","storm",28,10));
        items.add(new FutureDomain("Sun" , "Sunny","sunny",30,12));
        items.add(new FutureDomain("Mon" , "Cloudy","cloudy",28,15));
        items.add(new FutureDomain("Tue" , "Wind","wind",27,18));
        items.add(new FutureDomain("Wed" , "Windy","windy",32,20));
        items.add(new FutureDomain("Thr" , "Rain","rain",24,16));
        items.add(new FutureDomain("Fri" , "Cloudy sunny","cloudy_sunny",26,10));
      recyclerView=findViewById(R.id.view2);
      recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
      adaptertommorow=new FutureAdapters(items);
recyclerView.setAdapter(adaptertommorow);
    }
}