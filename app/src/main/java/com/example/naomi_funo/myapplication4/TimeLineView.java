package com.example.naomi_funo.myapplication4;

/**
 * Created by naomi_funo on 2016/11/30.
 */

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.content.Context;

import java.io.IOException;

public class TimeLineView extends Fragment {
    MediaPlayer mp = null;


    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.time_line_tab, container, false);
        mp = MediaPlayer.create(view.getContext(), R.raw.sound1);

        /*
        * イケメン1
        * */
        final ImageView imageMan1 = (ImageView) view.findViewById(R.id.imageMan1);
        imageMan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch);
                imageMan1.startAnimation(animation);


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


        /*
        * イケメン2
        * */
        final ImageView imageMan2 = (ImageView) view.findViewById(R.id.imageMan2);
        imageMan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch);
                imageMan2.startAnimation(animation);
            }
        });


        /*
        * イケメン3
        * */
        final ImageView imageMan3 = (ImageView) view.findViewById(R.id.imageMan3);
        imageMan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch);
                imageMan3.startAnimation(animation);
            }
        });


        /*
        * イケメン
        * */
        final ImageView imageMan4 = (ImageView) view.findViewById(R.id.imageMan4);
        imageMan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch);
                imageMan4.startAnimation(animation);
            }
        });


        return view;
    }
}