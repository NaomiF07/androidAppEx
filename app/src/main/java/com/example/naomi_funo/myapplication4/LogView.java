package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class LogView extends Fragment {

    TextView textView;
    EditText editText;
    Button button;

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
        return view;
    }

}