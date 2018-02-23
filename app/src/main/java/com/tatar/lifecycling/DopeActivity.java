package com.tatar.lifecycling;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DopeActivity extends LifecyclingActivity {

    private static final String CLASS_NAME = DopeActivity.class.getSimpleName();

    private Button mainActivityButton;

    public DopeActivity() {
        setChildActivityName(CLASS_NAME);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dope);

        mainActivityButton = findViewById(R.id.mainActivityButton);

        mainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(DopeActivity.this, MainActivity.class);
            }
        });
    }
}
