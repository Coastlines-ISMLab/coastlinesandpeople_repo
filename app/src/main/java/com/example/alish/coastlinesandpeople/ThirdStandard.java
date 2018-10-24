package com.example.alish.coastlinesandpeople;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class ThirdStandard extends Fragment {
    View myView;
    String[] StandardRecommendation = {"Check ABC Action News", "Check Bay News", "Check City of Tampa", "Follow Guide"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.main_third, container, false);
        //String[] StandardRecommendation = {"Check ABC Action News", "Check Bay News", "Check City of Tampa", "Follow Guide"};
        //System.out.println("weather is"+weather);
        //String[] StandardRecommendation = new String[weather.size()];

        ListView listView = (ListView) myView.findViewById(R.id.mobile_list);
        ArrayAdapter<String> listViewAdaptor  = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                StandardRecommendation
        );
        listView.setAdapter(listViewAdaptor);

        return myView;

    }
}