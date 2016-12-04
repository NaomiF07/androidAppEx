package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.transition.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.io.IOException;

import static android.support.v7.app.AlertDialog.*;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class HomeView extends Fragment {

    private Button button_shop;
    MediaPlayer mp = null;
    private Runnable showGetCoin;
    private Runnable hideGetCoin;
    private Handler mHandler = new Handler();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_tab, container, false);

        // アプリ起動時の音声再生
        mp = MediaPlayer.create(view.getContext(), R.raw.voice2);
        if(mp.isPlaying()){
            mp.stop();
            try{
                mp.prepare();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else{
            mp.start();
        }

        final ImageView imageBlack = (ImageView) view.findViewById(R.id.imageBlack);
        final ImageView getCoin = (ImageView) view.findViewById(R.id.getCoin);

        // 4秒後にコイン獲得画面起動！！
        showGetCoin = new Runnable() {
            @Override
            public void run() {
                //ここに実行したい処理を記述
                imageBlack.setVisibility(View.VISIBLE);
                getCoin.setVisibility(View.VISIBLE);
                GlideDrawableImageViewTarget target = new GlideDrawableImageViewTarget(getCoin);
                Glide.with(HomeView.this).load(R.drawable.get_coinf).into(target);
            }
        };
        mHandler.postDelayed(showGetCoin, 4000);

        // 6秒後にコイン獲得画面非表示
        hideGetCoin = new Runnable() {
            @Override
            public void run() {
                //ここに実行したい処理を記述
                imageBlack.setVisibility(View.INVISIBLE);
                getCoin.setVisibility(View.INVISIBLE);
            }
        };
        mHandler.postDelayed(hideGetCoin, 7000);

        final ImageView imageOtoya = (ImageView) view.findViewById(R.id.imageOtoya);

        // おとやクリック時の挙動
        imageOtoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch2);
                imageOtoya.startAnimation(animation);


                if(mp.isPlaying()){
                    mp.stop();
                    try{
                        mp.prepare();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    mp.start();
                }

            }
        });


        final ImageView cart = (ImageView) view.findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch2);
                cart.startAnimation(animation);
                Intent intent = new Intent(v.getContext(), ShopView.class);
                startActivityForResult(intent, 0);
            }

        });





        // ドラえもん歩く用
        final ImageView img_otoy = (ImageView)view.findViewById(R.id.imageOtoya);

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