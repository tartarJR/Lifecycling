package com.tatar.lifecycling;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends LifecyclingActivity {

    private static final String CLASS_NAME = MainActivity.class.getSimpleName();
    private static final String DUMMY_CONTENT = "DUMMY_CONTENT";
    private static final String PREF_FILE = "com.tatar.lifecycling.prefs";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

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

        sharedPreferences = getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        dummyEditText = findViewById(R.id.dummyEditText);
        dopeActivityButton = findViewById(R.id.dope_activity_button);
        transparentActivityButton = findViewById(R.id.transparent_activity_button);

        String dummyText = sharedPreferences.getString(DUMMY_CONTENT, "");
        dummyEditText.setText(dummyText);

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

    @Override
    protected void onPause() {
        editor.putString(DUMMY_CONTENT, dummyEditText.getText().toString());
        editor.apply();

        super.onPause();
    }
}
