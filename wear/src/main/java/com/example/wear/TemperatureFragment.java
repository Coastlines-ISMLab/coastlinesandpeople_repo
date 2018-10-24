package com.example.wear;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class TemperatureFragment extends Activity {
    TextView myView;
    List<String> weather;


   // String[] StandardRecommendation = new String[weather.size()];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    weather = WeatherUpdate.getCurrentTemp();
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            myView = (TextView) findViewById( R.id.text );
                            myView.setText(weather.get( 0 ));

                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();



    }
}
