package com.geeks.lesson_3_4.COUNTRY;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.lesson_3_4.R;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> countryModels;

    public CountryAdapter(ArrayList<CountryModel> countryModels) {
        this.countryModels = countryModels;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryModels.get(position));
    }

    @Override
    public int getItemCount() {
        return countryModels.size();
    }
}
