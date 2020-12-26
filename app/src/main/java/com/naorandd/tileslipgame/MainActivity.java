package com.naorandd.tileslipgame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {

    private CommonDefine _commonDefine;
    // Find Button
    private Button tile_1;
    private Button tile_2;
    private Button tile_3;
    private Button tile_4;
    private Button tile_5;
    private Button tile_6;
    private Button tile_7;
    private Button tile_8;
    private Button tile_9;

    private Button ans_tile_1;
    private Button ans_tile_2;
    private Button ans_tile_3;
    private Button ans_tile_4;
    private Button ans_tile_5;
    private Button ans_tile_6;
    private Button ans_tile_7;
    private Button ans_tile_8;
    private Button ans_tile_9;

    private TextView clear_text;

    private Button set_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Get CommonDefine Status
        _commonDefine = (CommonDefine) getApplication();
        _commonDefine.init();

        // Find Button id
        tile_1 = findViewById(R.id.tile_1);
        tile_2 = findViewById(R.id.tile_2);
        tile_3 = findViewById(R.id.tile_3);
        tile_4 = findViewById(R.id.tile_4);
        tile_5 = findViewById(R.id.tile_5);
        tile_6 = findViewById(R.id.tile_6);
        tile_7 = findViewById(R.id.tile_7);
        tile_8 = findViewById(R.id.tile_8);
        tile_9 = findViewById(R.id.tile_9);

        // Find Button id
        ans_tile_1 = findViewById(R.id.ans_tile_1);
        ans_tile_2 = findViewById(R.id.ans_tile_2);
        ans_tile_3 = findViewById(R.id.ans_tile_3);
        ans_tile_4 = findViewById(R.id.ans_tile_4);
        ans_tile_5 = findViewById(R.id.ans_tile_5);
        ans_tile_6 = findViewById(R.id.ans_tile_6);
        ans_tile_7 = findViewById(R.id.ans_tile_7);
        ans_tile_8 = findViewById(R.id.ans_tile_8);
        ans_tile_9 = findViewById(R.id.ans_tile_9);

        set_bt = findViewById(R.id.set_button);

        clear_text = findViewById(R.id.clear_text);


        // Set Each Button Listener
        tile_1.setOnClickListener(this);
        tile_2.setOnClickListener(this);
        tile_3.setOnClickListener(this);
        tile_4.setOnClickListener(this);
        tile_5.setOnClickListener(this);
        tile_6.setOnClickListener(this);
        tile_7.setOnClickListener(this);
        tile_8.setOnClickListener(this);
        tile_9.setOnClickListener(this);

        set_bt.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tile_1:
                if (_commonDefine.tileflg[0]) {
                    tile_1.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[0] = false;
                } else {
                    tile_1.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[0] = true;
                }
                break;
            case R.id.tile_2:
                if (_commonDefine.tileflg[1]) {
                    tile_2.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[1] = false;
                } else {
                    tile_2.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[1] = true;
                }
                break;
            case R.id.tile_3:
                if (_commonDefine.tileflg[2]) {
                    tile_3.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[2] = false;
                } else {
                    tile_3.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[2] = true;
                }
                break;
            case R.id.tile_4:
                if (_commonDefine.tileflg[3]) {
                    tile_4.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[3] = false;
                } else {
                    tile_4.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[3] = true;
                }
                break;
            case R.id.tile_5:
                if (_commonDefine.tileflg[4]) {
                    tile_5.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[4] = false;
                } else {
                    tile_5.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[4] = true;
                }
                break;
            case R.id.tile_6:
                if (_commonDefine.tileflg[5]) {
                    tile_6.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[5] = false;
                } else {
                    tile_6.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[5] = true;
                }
                break;
            case R.id.tile_7:
                if (_commonDefine.tileflg[6]) {
                    tile_7.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[6] = false;
                } else {
                    tile_7.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[6] = true;
                }
                break;
            case R.id.tile_8:
                if (_commonDefine.tileflg[7]) {
                    tile_8.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[7] = false;
                } else {
                    tile_8.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[7] = true;
                }
                break;
            case R.id.tile_9:
                if (_commonDefine.tileflg[8]) {
                    tile_9.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tileflg[8] = false;
                } else {
                    tile_9.setBackgroundColor(Color.rgb(0, 0, 255));
                    _commonDefine.tileflg[8] = true;
                }
                break;

            case R.id.set_button:
                generateRandomArray();
        }
        if(compareAnswerArr()){
            clear_text.setVisibility(View.VISIBLE);
            _commonDefine.score++;
            if(_commonDefine.score == 4){
                _commonDefine.score = 0;
                Intent intent = new Intent(this, ClearActivity.class);
                startActivity(intent);
            }
        }
    }

    private void generateRandomArray(){
        Random r = new Random();
//        int arr[][] = new int[3][3];

        for(int i = 0; i < 9; i++) {
                _commonDefine.ans_tileflg[i] = convertBool(r.nextInt(2));
        }
        clear_text.setVisibility(View.GONE);
        loadStatusArray();
    }

    private void loadStatusArray(){
        for(int i = 0; i < 9; i++) {
            switch(i + 1) {
                case 1:
                    if (_commonDefine.ans_tileflg[0]) {
                        ans_tile_1.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[0] = false;
                    } else {
                        ans_tile_1.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[0] = true;
                    }
                    break;
                case 2:
                    if (_commonDefine.ans_tileflg[1]) {
                        ans_tile_2.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[1] = false;
                    } else {
                        ans_tile_2.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[1] = true;
                    }
                    break;
                case 3:
                    if (_commonDefine.ans_tileflg[2]) {
                        ans_tile_3.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[2] = false;
                    } else {
                        ans_tile_3.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[2] = true;
                    }
                    break;
                case 4:
                    if (_commonDefine.ans_tileflg[3]) {
                        ans_tile_4.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[3] = false;
                    } else {
                        ans_tile_4.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[3] = true;
                    }
                    break;
                case 5:
                    if (_commonDefine.ans_tileflg[4]) {
                        ans_tile_5.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[4] = false;
                    } else {
                        ans_tile_5.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[4] = true;
                    }
                    break;
                case 6:
                    if (_commonDefine.ans_tileflg[5]) {
                        ans_tile_6.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[5] = false;
                    } else {
                        ans_tile_6.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[5] = true;
                    }
                    break;
                case 7:
                    if (_commonDefine.ans_tileflg[6]) {
                        ans_tile_7.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[6] = false;
                    } else {
                        ans_tile_7.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[6] = true;
                    }
                    break;
                case 8:
                    if (_commonDefine.ans_tileflg[7]) {
                        ans_tile_8.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[7] = false;
                    } else {
                        ans_tile_8.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[7] = true;
                    }
                    break;
                case 9:
                    if (_commonDefine.ans_tileflg[8]) {
                        ans_tile_9.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.ans_tileflg[8] = false;
                    } else {
                        ans_tile_9.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.ans_tileflg[8] = true;
                    }
                    break;
            }
        }
    }

    private boolean convertBool(int binary){
        if(binary == 0){
            return true;
        }else {
            return false;
        }
    }

    private boolean compareAnswerArr(){
        for(int i = 0; i < 9; i++){
            if(_commonDefine.tileflg[i] != _commonDefine.ans_tileflg[i]){
                return false;
            }
        }
        return true;
    }
}