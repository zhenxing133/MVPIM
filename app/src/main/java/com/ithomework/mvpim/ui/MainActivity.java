package com.ithomework.mvpim.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ithomework.mvpim.R;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

    }

}
