package com.example.a100527.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.widget.TabHost;
import android.view.Menu;
import android.app.Activity;
import android.app.ActivityGroup;

public class MainActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
            tabHost.setup(this.getLocalActivityManager());
            TabHost.TabSpec spec;
            Intent intent;

            // tab1

            intent = new Intent().setClass(this, LeftActivity.class);
            spec = tabHost.newTabSpec("left")
                    .setIndicator("left")
                    .setContent(intent);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("mypage")
                    .setIndicator("mypage")
                    .setContent(R.id.mypage);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("home")
                    .setIndicator("home")
                    .setContent(R.id.home);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("right")
                    .setIndicator("right")
                    .setContent(R.id.right);
            tabHost.addTab(spec);

            spec = tabHost.newTabSpec("setting")
                    .setIndicator("setting")
                    .setContent(R.id.setting);
            tabHost.addTab(spec);

            tabHost.setCurrentTab(2);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
