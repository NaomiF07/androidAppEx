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
import android.widget.ImageView;

import java.io.IOException;

public class TimeLineView extends Fragment {

    MediaPlayer voice1 = null;
    MediaPlayer voice2 = null;
    MediaPlayer voice3 = null;
    MediaPlayer voice4 = null;


    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.time_line_tab, container, false);
        voice1 = MediaPlayer.create(view.getContext(), R.raw.voice1);
        voice2 = MediaPlayer.create(view.getContext(), R.raw.voice2);
        voice3 = MediaPlayer.create(view.getContext(), R.raw.voice3);
        voice4 = MediaPlayer.create(view.getContext(), R.raw.voice1);

        /*
        * イケメン1
        * */
        final ImageView imageMan1 = (ImageView) view.findViewById(R.id.imageMan1);
        imageMan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.touch);
                imageMan1.startAnimation(animation);

                if(voice1.isPlaying()){
                    voice1.stop();
                    try{
                        voice1.prepare();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    voice1.start();
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

                if(voice2.isPlaying()){
                    voice2.stop();
                    try{
                        voice2.prepare();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    voice2.start();
                }
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

                if(voice3.isPlaying()){
                    voice3.stop();
                    try{
                        voice3.prepare();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    voice3.start();
                }

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

                if(voice4.isPlaying()){
                    voice4.stop();
                    try{
                        voice4.prepare();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    voice4.start();
                }
            }
        });


        return view;
    }
}