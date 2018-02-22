package com.tatar.lifecycling;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends LifecyclingActivity {

    private Button activityAButton;
    private Button activityBButton;

    public MainActivity() {
        setChildActivityName("MainActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityAButton = findViewById(R.id.a_button);
        activityBButton = findViewById(R.id.b_button);

        activityAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        activityBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
