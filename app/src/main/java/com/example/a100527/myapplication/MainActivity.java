package com.example.a100527.myapplication;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTabs();
    }

    private void  initTabs() {
        try {
            TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
            tabHost.setup();
            TabHost.TabSpec spec;

            // tab1

            spec = tabHost.newTabSpec("main")
                    .setIndicator("home")
                    .setContent(R.id.main);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("left")
                    .setIndicator("left")
                    .setContent(R.id.left);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("right")
                    .setIndicator("right")
                    .setContent(R.id.right);
            tabHost.addTab(spec);
            tabHost.setCurrentTab(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
