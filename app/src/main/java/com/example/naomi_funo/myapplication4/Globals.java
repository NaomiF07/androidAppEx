package com.example.naomi_funo.myapplication4;

/**
 * Created by moritahitomi on 2016/12/03.
 */

import android.app.Application;

public class Globals extends Application{
    //グローバルに使用する変数たち
    int mokuhyotime;

    //ぜんぶ初期化するメソッド
    public void GlobalsAllInit() {
        mokuhyotime    = 0;
    }
}
