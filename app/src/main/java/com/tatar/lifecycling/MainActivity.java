package com.tatar.lifecycling;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends LifecyclingActivity {

    private static final String CLASS_NAME = MainActivity.class.getSimpleName();
    private static final String DUMMY_CONTENT = "DUMMY_CONTENT";

    private EditText dummyEditText;
    private Button dopeActivityButton;
    private Button transparentActivityButton;

    public MainActivity() {
        setChildActivityName(CLASS_NAME);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dummyEditText = findViewById(R.id.dummyEditText);
        dopeActivityButton = findViewById(R.id.dope_activity_button);
        transparentActivityButton = findViewById(R.id.transparent_activity_button);

        dopeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.this, DopeActivity.class);
            }
        });

        transparentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.this, TransparentActivity.class);
            }
        });
    }
}
