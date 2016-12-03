package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import static android.support.v7.app.AlertDialog.*;

public class HomeView extends Fragment {

    private Button button_shop;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_tab, container, false);

        // Shopボタン
        button_shop =(Button)view.findViewById(R.id.button_shop);
        button_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == button_shop) {
                    Intent intent = new Intent(view.getContext(), ShopView.class);
                    startActivityForResult(intent, 0);
                }
            }
        });




        // ドラえもん歩く用
        final ImageView img_otoy = (ImageView)view.findViewById(R.id.imageOtoya);

//        SeekBar seekBar = (SeekBar)view.findViewById(R.id.seekBarGrowUp);
//        seekBar.setMax(80);
//        seekBar.setProgress(80);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//
//            // つまみを離したときに発生する.
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//            }
//
//            // つまみにタッチしたときに発生する.
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//            }
//
//            // つまみを移動したときに発生する.
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(0 <= progress && progress <= 10){
//                    draemonImg.setImageResource(R.drawable.draemon1);
//                }
//                if(11 <= progress && progress <= 20){
//                    draemonImg.setImageResource(R.drawable.draemon2);
//                }
//                if(21 <= progress && progress <= 30){
//                    draemonImg.setImageResource(R.drawable.draemon3);
//                }
//                if(31 <= progress && progress <= 40){
//                    draemonImg.setImageResource(R.drawable.draemon4);
//                }
//                if(41 <= progress && progress <= 50){
//                    draemonImg.setImageResource(R.drawable.draemon5);
//                }
//                if(51 <= progress && progress <= 60){
//                    draemonImg.setImageResource(R.drawable.draemon6);
//                }
//                if(61 <= progress && progress <= 70){
//                    draemonImg.setImageResource(R.drawable.draemon7);
//                }
//                if(71 <= progress && progress <= 80){
//                    draemonImg.setImageResource(R.drawable.draemon1);
//                }
//            }
//        });

        return view;
    }

    // ダイアログ用クラス
    public static class TestDialogFragment extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the Builder class for convenient dialog construction
            Builder builder = new Builder(getActivity());
            builder.setMessage("ダイアログ")
                    .setPositiveButton("はい", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // FIRE ZE MISSILES!
                        }
                    })
                    .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User cancelled the dialog
                        }
                    });
            // Create the AlertDialog object and return it
            return builder.create();
        }
    }

}