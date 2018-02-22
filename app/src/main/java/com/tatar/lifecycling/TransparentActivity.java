package com.tatar.lifecycling;

import android.os.Bundle;

public class TransparentActivity extends LifecyclingActivity {

    private static final String CLASS_NAME = TransparentActivity.class.getSimpleName();

    public TransparentActivity() {
        setChildActivityName(CLASS_NAME);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
    }
}
