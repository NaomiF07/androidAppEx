package com.example.a100527.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;

public class RightActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_page);
    }

    public void clickbutton4(View view){
        // コンテンツ部分のLayoutを取ってくる
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);

        // 内容を全部消す
        layout.removeAllViews();

        // car.xmlに変更する
        getLayoutInflater().inflate(R.layout.car, layout);
    }

    public void clickbutton5(View view){
        // コンテンツ部分のLayoutを取ってくる
        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);

        // 内容を全部消す
        layout.removeAllViews();

        // car.xmlに変更する
        getLayoutInflater().inflate(R.layout.bed, layout);
    }
}
