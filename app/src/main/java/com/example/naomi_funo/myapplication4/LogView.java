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
import android.widget.TextView;

public class LogView extends Fragment {
    //グローバル変数
    Globals globals;

    private Button button;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.log_tab, container, false);
        button =(Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == button) {
                    Intent intent = new Intent(view.getContext(), MokuhyoView.class);
                    startActivityForResult(intent, 0);
                }
            }
        });
        globals = (Globals) this.getActivity().getApplication();
        globals.GlobalsAllInit();
        int mokuhyotime = globals.mokuhyotime;
        String set_text = "目標　" + mokuhyotime + "分/日";
        button.setText(set_text);
        return view;
    }

}