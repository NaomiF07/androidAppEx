package com.example.a100527.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;


/**
 * Created by tanakafu on 2017/10/07.
 */

public class PointActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // チェックボックスを含むレイアウトファイル
        setContentView(R.layout.point_get);

        TextView point = (TextView) findViewById(R.id.point);
        point.setText("25");
    }

    /**
     * チェックボックスがクリックされた時にコールされる
     * @param view クリックされたview
     */
    public void onClick(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        TextView pointview = (TextView) findViewById(R.id.point);
        int point = Integer.parseInt(pointview.getText().toString());
        pointview.setText(point+1);

        /*
        switch (view.getId()) {
            case R.id.checkbox1:
                if (checked) Log.d(TAG, "dog is checked");
                else Log.d(TAG, "dog is unchecked");
                break;
            case R.id.checkbox2:
                if (checked) Log.d(TAG, "cat is checked");
                else Log.d(TAG, "cat is unchecked");
                break;
            case R.id.checkbox3:
                if (checked) Log.d(TAG, "bird is checked");
                else Log.d(TAG, "bird is unchecked");
                break;
            case R.id.checkbox4:
                if (checked) Log.d(TAG, "bird is checked");
                else Log.d(TAG, "bird is unchecked");
                break;
        }
        */
    }






   }


