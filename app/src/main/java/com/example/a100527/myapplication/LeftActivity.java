package com.example.a100527.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by tanakafu on 2017/10/07.
 */

public class LeftActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left_page);
    }

    public void ToBattle(View view){
        setContentView(R.layout.battle_page);
    }

    public void Onback(View view){
        setContentView(R.layout.left_page);
    }

    public void ToKeijibann(View view){
        setContentView(R.layout.keijibann);
    }

    public void ToPoint(View view){
        setContentView(R.layout.point_get);
        TextView point = (TextView) findViewById(R.id.point);
        point.setText("25");
    }

    public void onCheckboxClicked(View view) {
        final boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkbox1:
                if (checked) {// チェックボックス1がチェックされる
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point + 1));
                } else {// チェックボックス1のチェックが外される
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point - 1));
                }
                break;
            case R.id.checkbox2:
                if (checked) {// チェックボックス1がチェックされる
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point + 1));
                } else {// チェックボックス1のチェックが外される
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point - 1));
                }
                break;
            case R.id.checkbox3:
                if (checked) {// チェックボックス1がチェックされる
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point + 1));
                } else {// チェックボックス1のチェックが外される
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point - 1));
                }
                break;
            case R.id.checkbox4:
                if (checked) {// チェックボックス1がチェックされる
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point + 1));
                } else {// チェックボックス1のチェックが外される
                    TextView pointview = (TextView) findViewById(R.id.point);
                    int point = Integer.parseInt(pointview.getText().toString());
                    pointview.setText(String.valueOf(point - 1));
                }
                break;
        }
    }
}
