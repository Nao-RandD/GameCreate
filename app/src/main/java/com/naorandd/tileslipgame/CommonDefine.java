package com.naorandd.tileslipgame;

import android.app.Application;

public class CommonDefine extends Application {

    Boolean tileflg [];
    Boolean ans_tileflg [];

    int score;

    static final int BACKGROUND_ENTER_ANIMATION_DURATION = 2000;
    static final int BACKGROUND_EXIT_ANIMATION_DURATION = 4000;
    static final int BUTTON_ANIMATION_DURATION = 3000;

    /**
     * 変数を初期化する
     */
    public void init(){
        tileflg = new Boolean[9];
        tileflg[0] = true;
        tileflg[1] = true;
        tileflg[2] = true;
        tileflg[3] = true;
        tileflg[4] = true;
        tileflg[5] = true;
        tileflg[6] = true;
        tileflg[7] = true;
        tileflg[8] = true;

        ans_tileflg = new Boolean[9];
        ans_tileflg[0] = true;
        ans_tileflg[1] = true;
        ans_tileflg[2] = true;
        ans_tileflg[3] = true;
        ans_tileflg[4] = true;
        ans_tileflg[5] = true;
        ans_tileflg[6] = true;
        ans_tileflg[7] = true;
        ans_tileflg[8] = true;

        score = 0;
    }
}
