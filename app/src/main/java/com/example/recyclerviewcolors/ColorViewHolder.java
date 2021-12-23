package com.example.recyclerviewcolors;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    TextView tv;

    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.color);
        // создать объекты интерфейса и
        // повешать обработчики событий
    }
    void bindTo(Color color) {
        // заполнить объекты интерфейса значениями (данными)
        // TODO: задать цвет у текстового поля
        // TODO: написать название цвета в текстовом поле
        tv.setText("color: " + color.getName());
        itemView.setBackgroundColor(color.getColor());
    }
}
