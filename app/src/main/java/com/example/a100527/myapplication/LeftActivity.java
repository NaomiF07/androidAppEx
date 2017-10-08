package com.example.a100527.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tanakafu on 2017/10/07.
 */

public class LeftActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left_page);

        TextView textView = (TextView) findViewById(R.id.editText);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
    }

    protected  void ToBattle(View view){
        setContentView(R.layout.battle_page);
    }

    protected void Onback(View view){
        setContentView(R.layout.left_page);
    }
}
