package com.example.naomi_funo.myapplication4;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by y-itoyama on 2016/12/03.
 */

public class ShopView extends AppCompatActivity {
    AlertDialog alertDialog = null;
    Animation animation = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_view);
        animation = AnimationUtils.loadAnimation(ShopView.this, R.anim.touch2);

        // 再生ボタンの挙動
        final ImageView play1 = (ImageView) findViewById(R.id.imagePlay1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play1.startAnimation(animation);
            }
        });

        final ImageView play2 = (ImageView) findViewById(R.id.imagePlay2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play2.startAnimation(animation);
            }
        });


        // カートボタンの挙動
        final ImageView cart1 = (ImageView) findViewById(R.id.imageCart1);
        cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart1.startAnimation(animation);
                SetCanBuyDialog();
                // アラートダイアログを表示します
                alertDialog.show();
            }
        });

        final ImageView cart2 = (ImageView) findViewById(R.id.imageCart2);
        cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart2.startAnimation(animation);
                SetCanNotBuyDialog();
                // アラートダイアログを表示します
                alertDialog.show();
            }
        });

        final ImageView cart3 = (ImageView) findViewById(R.id.imageCart3);
        cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart2.startAnimation(animation);
                SetCanNotBuyDialog();
                // アラートダイアログを表示します
                alertDialog.show();
            }
        });

        final ImageView cart4 = (ImageView) findViewById(R.id.imageCart4);
        cart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cart4.startAnimation(animation);
                SetCanNotBuyDialog();
                // アラートダイアログを表示します
                alertDialog.show();
            }
        });

    }

    // 購入ダイアログ
    private void SetCanBuyDialog()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // アラートダイアログのタイトルを設定します
        alertDialogBuilder.setTitle("確認");
        // アラートダイアログのメッセージを設定します
        alertDialogBuilder.setMessage("20コインを使用して購入しますか？");
        alertDialogBuilder.setPositiveButton("購入",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        // アラートダイアログの否定ボタンがクリックされた時に呼び出されるコールバックリスナーを登録します
        alertDialogBuilder.setNegativeButton("キャンセル",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        // アラートダイアログのキャンセルが可能かどうかを設定します
        alertDialogBuilder.setCancelable(true);
        alertDialog = alertDialogBuilder.create();
    }

    // 購入ダイアログ
    private void SetCanNotBuyDialog()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // アラートダイアログのタイトルを設定します
        alertDialogBuilder.setTitle("確認");
        // アラートダイアログのメッセージを設定します
        alertDialogBuilder.setMessage("48コイン足りません。\nもっと運動してボイスを集めよう！");
        // アラートダイアログの否定ボタンがクリックされた時に呼び出されるコールバックリスナーを登録します
        alertDialogBuilder.setNegativeButton("キャンセル",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        // アラートダイアログのキャンセルが可能かどうかを設定します
        alertDialogBuilder.setCancelable(true);
        alertDialog = alertDialogBuilder.create();
    }

}
