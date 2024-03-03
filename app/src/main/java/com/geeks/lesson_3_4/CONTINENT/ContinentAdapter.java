package com.geeks.lesson_3_4.CONTINENT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.lesson_3_4.OnClick;
import com.geeks.lesson_3_4.R;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentModels;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentModel, OnClick onClick) {
        this.continentModels = continentModel;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentModels.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentModels.size();
    }
}
