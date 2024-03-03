package com.geeks.lesson_3_4.CONTINENT;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.lesson_3_4.COUNTRY.CountryFragment;
import com.geeks.lesson_3_4.OnClick;
import com.geeks.lesson_3_4.R;
import com.geeks.lesson_3_4.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(continentAdapter);

    }

    private void loadData() {
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Eurasia_%28orthographic_projection%29.svg/1200px-Eurasia_%28orthographic_projection%29.svg.png","Eurassia"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/South_America_%28orthographic_projection%29.svg/800px-South_America_%28orthographic_projection%29.svg.png","south america"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Location_North_America.svg/1200px-Location_North_America.svg.png","North America"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Africa_%28orthographic_projection%29.svg/1200px-Africa_%28orthographic_projection%29.svg.png","Africa"));
        continentList.add(new ContinentModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Australia_with_AAT_%28orthographic_projection%29.svg/300px-Australia_with_AAT_%28orthographic_projection%29.svg.png","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle =  new Bundle();
        bundle.putInt("key", position);
        CountryFragment countryFragment =  new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}