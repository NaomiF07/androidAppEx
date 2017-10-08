package com.example.a100527.myapplication;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TabHost;

public class right_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_page);

        /*
        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // コンテンツ部分のLayoutを取ってくる
                ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);

                // 内容を全部消す
                layout.removeAllViews();

                // car.xmlに変更する
                getLayoutInflater().inflate(R.layout.car, layout);
            }
        });
*/


/*
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
        */
    }

    protected void Onclickbutton4(View view){
        // コンテンツ部分のLayoutを取ってくる
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);

        // 内容を全部消す
        layout.removeAllViews();

        // car.xmlに変更する
        getLayoutInflater().inflate(R.layout.car, layout);
    }

    protected void Onclickbutton5(View view){
        // コンテンツ部分のLayoutを取ってくる
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);

        // 内容を全部消す
        layout.removeAllViews();

        // car.xmlに変更する
        getLayoutInflater().inflate(R.layout.bed, layout);
    }

}
