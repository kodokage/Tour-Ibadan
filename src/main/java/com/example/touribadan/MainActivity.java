package com.example.touribadan;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mallsTextView = (TextView) findViewById(R.id.malls_text_view);
        TextView museumsTextView = (TextView) findViewById(R.id.museums_text_view);
        TextView loungesTextView = (TextView) findViewById(R.id.lounges_text_view);
        TextView hotelsTextView = (TextView) findViewById(R.id.hotels_text_view);
        TextView marketsTextView = (TextView) findViewById(R.id.markets_text_view);

        mallsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mallI = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(mallI);
            }
        });

        museumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent museumI = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(museumI);
            }
        });

        loungesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  loungeI= new Intent(MainActivity.this, LoungeActivity.class);
                startActivity(loungeI);
            }
        });

        hotelsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelI = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelI);
            }
        });

        marketsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marketI = new Intent(MainActivity.this, MarketActivity.class);
                startActivity(marketI);
            }
        });
    }
}
