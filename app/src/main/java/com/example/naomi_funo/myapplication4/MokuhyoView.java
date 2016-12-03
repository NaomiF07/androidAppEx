package com.example.naomi_funo.myapplication4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.widget.TextView;
import android.widget.Button;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by y-itoyama on 2016/12/03.
 */

public class MokuhyoView extends Activity {
    //グローバル変数
    Globals globals;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mokuhyo_view);

//        TextView text = (TextView) findViewById(R.id.textView10);
//        String set_text = "20分 /日";
//        text.setText(set_text);

        //グローバル変数を取得
        globals = (Globals) this.getApplication();
        //初期化
        globals.GlobalsAllInit();

        //取得した文章をレイアウトに配置
        TextView text = (TextView) findViewById(R.id.textView10);
        int mokuhyotime = globals.mokuhyotime;
        String set_text = mokuhyotime + "分 /日";
        text.setText(set_text);

    }
}
