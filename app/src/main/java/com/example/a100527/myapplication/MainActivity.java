package com.example.a100527.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
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

            intent = new Intent().setClass(this, LeftActivity.class);
            spec = tabHost.newTabSpec("left")
                    .setIndicator("guild")
                    .setContent(intent);
            tabHost.addTab(spec);

            intent = new Intent().setClass(this, MypageActivity.class);
            spec = tabHost.newTabSpec("mypage")
                    .setIndicator("mypage")
                    .setContent(intent);
            tabHost.addTab(spec);

            intent = new Intent().setClass(this, HomeActivity.class);
            spec = tabHost.newTabSpec("home")
                    .setIndicator("home")
                    .setContent(intent);
            tabHost.addTab(spec);

            intent = new Intent().setClass(this, RightActivity.class);
            spec = tabHost.newTabSpec("right")
                    .setIndicator("shop")
                    .setContent(intent);
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
