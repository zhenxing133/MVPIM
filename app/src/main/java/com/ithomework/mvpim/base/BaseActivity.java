package com.ithomework.mvpim.base;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 *
 * @date 2018/05/22
 */

public class BaseActivity extends AppCompatActivity {

    protected void startActivityPage(Activity activity,Class clazz) {
        Intent intent = new Intent(activity,clazz);
        startActivity(intent);
    }
}
