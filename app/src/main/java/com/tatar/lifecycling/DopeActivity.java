package com.tatar.lifecycling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DopeActivity extends LifecyclingActivity {

    private static final String CLASS_NAME = DopeActivity.class.getSimpleName();

    public DopeActivity() {
        setChildActivityName(CLASS_NAME);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dope);
    }
}
