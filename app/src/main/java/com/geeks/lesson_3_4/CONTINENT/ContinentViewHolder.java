package com.geeks.lesson_3_4.CONTINENT;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.geeks.lesson_3_4.CONTINENT.ContinentModel;
import com.geeks.lesson_3_4.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgContinent;
    private TextView tvContinent;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        imgContinent = itemView.findViewById(R.id.img_continent);
        tvContinent = itemView.findViewById(R.id.tv_continent);
    }


    public void bind(ContinentModel continentModel) {
        tvContinent.setText(continentModel.getName());
        Glide.with(imgContinent).load(continentModel.getImg()).into(imgContinent);
    }
}
