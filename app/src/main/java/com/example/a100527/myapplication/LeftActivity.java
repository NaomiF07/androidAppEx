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
        protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left_page);

            TextView textView = (TextView) findViewById(R.id.editText);
            textView.setTypeface(Typeface.DEFAULT_BOLD);

            findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // クリック時の処理
                    setContentView(R.layout.right_page);
                }
            });

    }

    }
