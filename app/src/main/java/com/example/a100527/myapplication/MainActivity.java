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
    TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
    tabHost.setup();
    TabHost.TabSpec spec;

    // tab1

    spec = tabHost.newTabSpec("left")
            .setIndicator("left")
            .setContent(R.id.left);
    tabHost.addTab(spec);

    spec = tabHost.newTabSpec("main")
            .setIndicator("main")
            .setContent(R.id.main);
    tabHost.addTab(spec);

    spec = tabHost.newTabSpec("right")
            .setIndicator("right")
            .setContent(R.id.right);
    tabHost.addTab(spec);
    tabHost.setCurrentTab(1);
} catch (RuntimeException e) {
    e.printStackTrace();
}
    }

}
