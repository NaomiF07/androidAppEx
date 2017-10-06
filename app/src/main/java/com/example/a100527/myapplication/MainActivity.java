package com.example.a100527.myapplication;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.widget.TabHost;
import android.view.Menu;
import android.app.Activity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

try {
    TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
    tabHost.setup();
    TabHost.TabSpec spec;

    // tab1

    spec = tabHost.newTabSpec("main")
            .setIndicator("main")
            .setContent(R.layout.activity_main);
    tabHost.addTab(spec);

    spec = tabHost.newTabSpec("left")
            .setIndicator("left")
            .setContent(R.layout.right_page);
    tabHost.addTab(spec);

    spec = tabHost.newTabSpec("right")
            .setIndicator("right")
            .setContent(R.layout.left_page);
    tabHost.addTab(spec);
    tabHost.setCurrentTab(0);
} catch (RuntimeException e) {
    e.printStackTrace();
}
    }

}
