package com.example.alish.coastlinesandpeople;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class secondmenuFragment extends Fragment {
    View myView;
    List<String> weather = WeatherUpdate.getCurrentTemp();
    String[] StandardRecommendation = new String[weather.size()];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.main_second, container, false);

        //List<String> weather = WeatherUpdate.getCurrentTemp();
        System.out.println("weather is"+weather);
        //String[] StandardRecommendation = new String[weather.size()];
        for(int i =0;i<weather.size();i++)
        {
            StandardRecommendation[i]=weather.get(i);
        }

                //{"Check ABC Action News", "Check Bay News", "Check City of Tampa", "Follow Guide"};
        ListView listView = (ListView) myView.findViewById(R.id.weather_list);
        ArrayAdapter<String> listViewAdaptor  = new ArrayAdapter<String>(
                getActivity(),
                R.layout.mytextview,
                StandardRecommendation
        );
        listView.setAdapter(listViewAdaptor);

        return myView;
    }
}
