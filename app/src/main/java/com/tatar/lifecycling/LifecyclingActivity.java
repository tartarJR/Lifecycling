package com.tatar.lifecycling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LifecyclingActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycling App";

    private String childActivityName;

    protected void setChildActivityName(String childActivityName) {
        this.childActivityName = childActivityName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, childActivityName + " onCreate called");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, childActivityName + " onStart called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, childActivityName + " onResume called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, childActivityName + " onPause called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, childActivityName + " onStop called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, childActivityName + " onDestroy called");
        super.onDestroy();
    }
}
