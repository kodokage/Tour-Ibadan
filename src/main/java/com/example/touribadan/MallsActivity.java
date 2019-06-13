package com.example.touribadan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    private String map ;
    private Intent mapIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_list);

        final  ArrayList<Site> destinations = new ArrayList<>();
        destinations.add(new Site("Palms Mall", "7am-9pm", ""));
        destinations.add(new Site("Jericho Mall", "7 am-11 pm",""));
        destinations.add(new Site("Ventura", "7 am-10 pm",""));
        destinations.add(new Site("Heritage Mall", "7 am-10pm",""));
        destinations.add(new Site("Cocoa Mall", "7 am-11pm",""));
        destinations.add(new Site("Market Square", "7 am-9 pm",""));
        destinations.add(new Site("A Mall has no name", "7 am-9 pm",""));
        destinations.add(new Site("The Iron Mall", "7 am-9 pm",""));
        destinations.add(new Site("First Mall of Bravos", "7 am-9 pm",""));






       // ListView rootView = (ListView) findViewById(R.id.root_view);

    DestinationAdapter adapter = new DestinationAdapter(this, destinations);
    ListView listView = (ListView)findViewById(R.id.root_view);
    listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Site site = destinations.get(position);

            Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Palms Mall, Ring Ring Road, Ibadan");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);



        }
    });
    }
}
