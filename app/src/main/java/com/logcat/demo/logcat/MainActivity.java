package com.logcat.demo.logcat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Inside onCreate Method");
        Log.i(TAG, "Inside onCreate Method");
        Log.e(TAG, "Inside onCreate Method");

    }
}
