package com.example.a100527.myapplication;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TabHost;

public class right_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_page);

        try {
            TabHost tabHost = (TabHost) findViewById(R.id.tabHost2);
            tabHost.setup();
            TabHost.TabSpec spec;

            // tab1

            spec = tabHost.newTabSpec("cars")
                    .setIndicator("cars")
            .setContent(R.id.cars);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("beds")
                    .setIndicator("beds")
            .setContent(R.id.cars);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("bookshelves")
                    .setIndicator("bookshelves")
                    .setContent(R.id.cars);
            tabHost.addTab(spec);
            tabHost.setCurrentTab(0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
