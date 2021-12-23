package com.example.recyclerviewcolors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rview;
    // TODO: создать массив с цветами (которые заданы в ресурсах)

    ArrayList<Color> colors = new ArrayList<Color>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rview = findViewById(R.id.rview);
        ColorAdapter adapter = new ColorAdapter(getLayoutInflater());

        colors.add(new Color("красный", ContextCompat.getColor(this, R.color.red)));
        colors.add(new Color("оранжевый", ContextCompat.getColor(this, R.color.orange)));
        colors.add(new Color("жёлтый", ContextCompat.getColor(this, R.color.yellow)));
        colors.add(new Color("зелёный", ContextCompat.getColor(this, R.color.green)));
        colors.add(new Color("голубой", ContextCompat.getColor(this, R.color.cyan)));
        colors.add(new Color("синий", ContextCompat.getColor(this, R.color.blue)));
        colors.add(new Color("фиолетовый", ContextCompat.getColor(this, R.color.fuchsia)));

        adapter.submitList(colors);
        rview.setLayoutManager(new LinearLayoutManager(this));
        // задаём оформление
        rview.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rview.setAdapter(adapter);

    }
}