package com.pfariasmunoz.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] commands = {"command1", "command2", "command3", "command4", "command5", "command6", "command7"};

        final String[] myFavoriteTvShows = {"mierda1", "mierda2", "mierda3", "mierda4", "mierda5", "mierda6", "mierda7"};

        ListAdapter adapter = new MyAdapter(this, myFavoriteTvShows);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(adapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String tvShowPicked = "You selected " +
                        String.valueOf(adapterView.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }
        });
    }



}
