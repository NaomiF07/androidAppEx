package com.example.naomi_funo.myapplication4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.widget.TextView;
import android.widget.Button;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
//エディットテキスト
import android.widget.EditText;
import android.text.SpannableStringBuilder;
import android.view.View;

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
    }

    public void onClick_Button1(View view){

        //グローバル変数を取得
        globals = (Globals) this.getApplication();
        //初期化
        globals.GlobalsAllInit();

        //ボタンをクリックするとeditTextの数値を取得する
        EditText editText3 = (EditText)findViewById(R.id.editText3);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        String text = editText3.getText().toString();
        editText2.setText(text);

        globals.mokuhyotime = Integer.parseInt(editText3.getText().toString());


    }






//        TextView text = (TextView) findViewById(R.id.textView10);
//        String set_text = "20分 /日";
//        text.setText(set_text);





//        //取得した文章をレイアウトに配置
//        TextView text = (TextView) findViewById(R.id.textView10);
//        int mokuhyotime = globals.mokuhyotime;
//        String set_text = mokuhyotime + "分 /日";
//        text.setText(set_text);



//        int mokuhyotime = globals.mokuhyotime;
//        editText.setText(mokuhyotime);
//        editText.selectAll();
//        globals.mokuhyotime = Integer.parseInt(editText.getText().toString());


}
