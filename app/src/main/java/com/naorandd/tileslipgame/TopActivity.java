package com.naorandd.tileslipgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopActivity extends Activity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        start_button = findViewById(R.id.title_button);
        start_button.setOnClickListener(this);

        mConstraintLayout = findViewById(R.id.mConstraintLayout);
        //背景アニメーションを設定
        AnimationUtil.animateConstraintLayout(mConstraintLayout,
            CommonDefine.BACKGROUND_ENTER_ANIMATION_DURATION,CommonDefine.BACKGROUND_EXIT_ANIMATION_DURATION);

        AnimationUtil.animateButton(start_button,
                CommonDefine.BACKGROUND_ENTER_ANIMATION_DURATION);

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}