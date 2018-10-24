package com.example.alish.coastlinesandpeople;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDisplay extends Activity {
    // Array of strings...
    String[] StandardRecommendation = {"Check ABC Action News","Check Bay News","Check City of Tampa","Follow Guide"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_third);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.main_third, StandardRecommendation);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}