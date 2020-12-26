package com.naorandd.tileslipgame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    private Button set_bt;

    int arr[] = new int[9];


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

        set_bt = findViewById(R.id.set_button);


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
                if (_commonDefine.tile1_flg) {
                    tile_1.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile1_flg = false;
                } else {
                    tile_1.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile1_flg = true;
                }
                break;
            case R.id.tile_2:
                if (_commonDefine.tile2_flg) {
                    tile_2.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile2_flg = false;
                } else {
                    tile_2.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile2_flg = true;
                }
                break;
            case R.id.tile_3:
                if (_commonDefine.tile3_flg) {
                    tile_3.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile3_flg = false;
                } else {
                    tile_3.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile3_flg = true;
                }
                break;
            case R.id.tile_4:
                if (_commonDefine.tile4_flg) {
                    tile_4.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile4_flg = false;
                } else {
                    tile_4.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile4_flg = true;
                }
                break;
            case R.id.tile_5:
                if (_commonDefine.tile5_flg) {
                    tile_5.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile5_flg = false;
                } else {
                    tile_5.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile5_flg = true;
                }
                break;
            case R.id.tile_6:
                if (_commonDefine.tile6_flg) {
                    tile_6.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile6_flg = false;
                } else {
                    tile_6.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile6_flg = true;
                }
                break;
            case R.id.tile_7:
                if (_commonDefine.tile7_flg) {
                    tile_7.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile7_flg = false;
                } else {
                    tile_7.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile7_flg = true;
                }
                break;
            case R.id.tile_8:
                if (_commonDefine.tile8_flg) {
                    tile_8.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile8_flg = false;
                } else {
                    tile_8.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile8_flg = true;
                }
                break;
            case R.id.tile_9:
                if (_commonDefine.tile9_flg) {
                    tile_9.setBackgroundColor(Color.rgb(200, 0, 0));
                    _commonDefine.tile9_flg = false;
                } else {
                    tile_9.setBackgroundColor(Color.rgb(0, 0, 200));
                    _commonDefine.tile9_flg = true;
                }
                break;

            case R.id.set_button:
                generateRandomArray();
        }
    }

    private void generateRandomArray(){
        Random r = new Random();
//        int arr[][] = new int[3][3];

        for(int i = 0; i < 9; i++) {
                arr[i] = r.nextInt(2);
        }

        loadStatusArray();
    }

//    private void setGenerateArray(int arr[][]){
//        for(int i = 0; i < 3; i++) {
//            for (int j = 0; i < 3; j++) {
//                arr[i][j];
//            }
//        }
//    }

//    private void convertButtonStatus(String button_num){
//        String define_bt = "_commonDefine.tile" + button_num + "_flg";
//        String name_bt = "" + "";
//    }

    private void loadStatusArray(){
        for(int i = 0; i < 9; i++) {
            switch(i + 1) {
                case 1:
                    if (convertBool(arr[i])) {
                        tile_1.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile1_flg = false;
                    } else {
                        tile_1.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile1_flg = true;
                    }
                    break;
                case 2:
                    if (convertBool(arr[i])) {
                        tile_2.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile2_flg = false;
                    } else {
                        tile_2.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile2_flg = true;
                    }
                    break;
                case 3:
                    if (convertBool(arr[i])) {
                        tile_3.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile3_flg = false;
                    } else {
                        tile_3.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile3_flg = true;
                    }
                    break;
                case 4:
                    if (convertBool(arr[i])) {
                        tile_4.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile4_flg = false;
                    } else {
                        tile_4.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile4_flg = true;
                    }
                    break;
                case 5:
                    if (convertBool(arr[i])) {
                        tile_5.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile5_flg = false;
                    } else {
                        tile_5.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile5_flg = true;
                    }
                    break;
                case 6:
                    if (convertBool(arr[i])) {
                        tile_6.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile6_flg = false;
                    } else {
                        tile_6.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile6_flg = true;
                    }
                    break;
                case 7:
                    if (convertBool(arr[i])) {
                        tile_7.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile7_flg = false;
                    } else {
                        tile_7.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile7_flg = true;
                    }
                    break;
                case 8:
                    if (convertBool(arr[i])) {
                        tile_8.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile8_flg = false;
                    } else {
                        tile_8.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile8_flg = true;
                    }
                    break;
                case 9:
                    if (convertBool(arr[i])) {
                        tile_9.setBackgroundColor(Color.rgb(200, 0, 0));
                        _commonDefine.tile9_flg = false;
                    } else {
                        tile_9.setBackgroundColor(Color.rgb(0, 0, 200));
                        _commonDefine.tile9_flg = true;
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
}