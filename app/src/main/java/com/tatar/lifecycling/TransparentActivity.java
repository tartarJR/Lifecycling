package com.tatar.lifecycling;

import android.os.Bundle;

public class TransparentActivity extends LifecyclingActivity {

    public TransparentActivity() {
        setChildActivityName("TransparentActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
    }
}
