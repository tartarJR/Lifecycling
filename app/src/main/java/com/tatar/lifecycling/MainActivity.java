package com.tatar.lifecycling;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends LifecyclingActivity {

    private Button dopeActivityButton;
    private Button transparentActivityButton;

    public MainActivity() {
        setChildActivityName("MainActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dopeActivityButton = findViewById(R.id.dope_activity_button);
        transparentActivityButton = findViewById(R.id.transparent_activity_button);

        dopeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        transparentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
