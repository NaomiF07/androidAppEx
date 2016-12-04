package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.graphics.Color;
import java.util.ArrayList;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.components.XAxis.XAxisPosition;

public class LogView extends Fragment {

    TextView textView;
    EditText editText;
    Button button;
    private LineChart mlineChart;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle saveInstanceState) {

        View view = inflater.inflate(R.layout.log_tab, container, false);
        button = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textView);
        editText = (EditText) view.findViewById(R.id.editText);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // エディットテキストのテキストを取得
                        String text = editText.getText().toString() + "分 /日";
                        // 取得したテキストを TextView に張り付ける
                        textView.setText(text);

                    }
                });
        super.onCreate(saveInstanceState);
        mlineChart = (LineChart) view.findViewById(R.id.line_chart);
        setData();
        mlineChart.setDrawGridBackground(true);
        mlineChart.setGridBackgroundColor(Color.rgb(254, 244, 244));
        mlineChart.getAxisRight().setEnabled(false);
        mlineChart.getXAxis().setPosition(XAxisPosition.BOTTOM);
        return view;
    }

    private ArrayList<Entry> setYAxisValues(){
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        yVals.add(new Entry(0, 0));
        yVals.add(new Entry(1, 35));
        yVals.add(new Entry(2, 100));
        yVals.add(new Entry(3, 150));
        yVals.add(new Entry(4, 80));
        yVals.add(new Entry(5, 30));
        yVals.add(new Entry(6, 200));
        yVals.add(new Entry(7, 370));
        yVals.add(new Entry(8, 300));
        yVals.add(new Entry(9, 200));
        yVals.add(new Entry(10, 170));

        return yVals;
    }

    private void setData() {
        ArrayList<Entry> yVals = setYAxisValues();

//        // create a dataset and give it a type
//        set1 = new LineDataSet(yVals, "DataSet 1");
//        set1.setFillAlpha(110);
//        // set1.setFillColor(Color.RED);
//
//        // set the line to be drawn like this "- - - - - -"
//        // set1.enableDashedLine(10f, 5f, 0f);
//        // set1.enableDashedHighlightLine(10f, 5f, 0f);
//        set1.setColor(Color.BLACK);
//        set1.setCircleColor(Color.BLACK);
//        set1.setLineWidth(1f);
//        set1.setCircleRadius(3f);
//        set1.setDrawCircleHole(false);
//        set1.setValueTextSize(9f);
//        set1.setDrawFilled(true);
//
//        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
//        dataSets.add(set1); // add the datasets
//
//        // create a data object with the datasets
//        LineData data = new LineData(xVals, dataSets);
        LineDataSet dataSet = new LineDataSet(yVals, "歩数");
        dataSet.setColor(Color.rgb(67, 135, 233));
        dataSet.setDrawValues(false);
        dataSet.setLineWidth(2.5f);
        dataSet.setDrawFilled(true);
        LineData lineData = new LineData(dataSet);

        // set data
        mlineChart.setData(lineData);

    }

}