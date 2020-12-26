package com.naorandd.tileslipgame;

import android.app.Application;

public class CommonDefine extends Application {

    Boolean tile1_flg;
    Boolean tile2_flg;
    Boolean tile3_flg;
    Boolean tile4_flg;
    Boolean tile5_flg;
    Boolean tile6_flg;
    Boolean tile7_flg;
    Boolean tile8_flg;
    Boolean tile9_flg;

    static final int BACKGROUND_ENTER_ANIMATION_DURATION = 2000;
    static final int BACKGROUND_EXIT_ANIMATION_DURATION = 4000;
    static final int BUTTON_ANIMATION_DURATION = 3000;

    /**
     * 変数を初期化する
     */
    public void init(){
        tile1_flg = true;
        tile2_flg = true;
        tile3_flg = true;
        tile4_flg = true;
        tile5_flg = true;
        tile6_flg = true;
        tile7_flg = true;
        tile8_flg = true;
        tile9_flg = true;
    }
}
