package com.tatar.lifecycling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DopeActivity extends LifecyclingActivity {

    public DopeActivity() {
        setChildActivityName("DopeActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dope);
    }
}
