package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LogView extends Fragment {

    private Button button_mokuhyo;


    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.log_tab, container, false);
        button_mokuhyo =(Button)view.findViewById(R.id.button_mokuhyo);
        button_mokuhyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == button_mokuhyo) {
                    Intent intent = new Intent(view.getContext(), MokuhyoView.class);
                    startActivityForResult(intent, 0);
                }
            }
        });

        return view;
    }
}