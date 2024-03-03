package com.geeks.lesson_3_4.COUNTRY;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.geeks.lesson_3_4.databinding.FragmentCountryBinding;
import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private Integer position;
    private final ArrayList<CountryModel> countryModels = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt("key", 0);
        }
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerView.setAdapter(countryAdapter);
    }


    private void checkPosition(int position) {
        if (position == 0) {
            LoadEurasia();
        } else if (position == 1) {
            loadNorthAmerica();
        } else if (position == 2) {
            LoadSouthAmerica();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            LoadAustralia();
        }
    }

    private void LoadAustralia() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/8/88/Flag_of_Australia_%28converted%29.svg", "australia"));
    }

    private void loadAfrica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Flag_of_Nigeria.svg/1200px-Flag_of_Nigeria.svg.png", "nigeria"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/27/4227-004-32423B42/Flag-South-Africa.jpg", "South-Africa"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Flag_of_Cameroon.svg/2560px-Flag_of_Cameroon.svg.png", "Cameroon"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/800px-Flag_of_Egypt.svg.png", "Egypt"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/46/2246-004-17A6E838/Flag-Madagascar.jpg", "Madagascar"));
    }

    private void LoadSouthAmerica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/640px-Flag_of_Brazil.svg.png", "Brazil"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg", "Argentina"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/800px-Flag_of_Cuba.svg.png", "cuba"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/800px-Flag_of_Chile.svg.png", "chile"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/250px-Flag_of_Venezuela.svg.png", "Venezuela"));
    }

    private void loadNorthAmerica() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Flag_of_Canada.svg/1280px-Flag_of_Canada.svg.png", "Kanada"));
        countryModels.add(new CountryModel("https://m.media-amazon.com/images/I/61tjf7U2K3L._AC_UF1000,1000_QL80_.jpg", "usa"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Flag_of_Mexico.jpg/1200px-Flag_of_Mexico.jpg", "Mexico"));
    }


    private void LoadEurasia() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/c/c7/Flag_of_Kyrgyzstan.svg", "kyrgyzstan"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/220px-Flag_of_Italy.svg.png", "italy"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Flag_of_Ireland.svg/255px-Flag_of_Ireland.svg.png", "ireland"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/800px-Flag_of_Russia.svg.png", "russia"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1000px-Flag_of_Kazakhstan.svg.png", "kazakhstan"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/2560px-Flag_of_the_People%27s_Republic_of_China.svg.png", "china"));
        countryModels.add(new CountryModel("https://cdn.britannica.com/82/4782-004-4119489D/Flag-Turkey.jpg", "turkey"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Flag_of_Saudi_Arabia.svg/640px-Flag_of_Saudi_Arabia.svg.png", "saudi arabia"));
        countryModels.add(new CountryModel("https://flagpoles.co.uk/wp-content/uploads/2019/06/Ukraine.png", "ukraine "));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Flag_of_Azerbaijan.svg/2560px-Flag_of_Azerbaijan.svg.png", "azerbaijan"));
    }
}