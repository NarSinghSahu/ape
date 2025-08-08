package com.narsinghsahu.ape;

import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {

    private boolean isLocked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchCompat toggle = findViewById(R.id.toggleSwitch);

        toggle.setOnCheckedChangeListener((CompoundButton buttonView, boolean isChecked) -> {
            if (!isLocked) {
                // Toggle state changes here
            } else {
                toggle.setChecked(!isChecked); // Revert if locked
            }
        });

        toggle.setOnLongClickListener(v -> {
            isLocked = !isLocked;
            return true;
        });
    }
}
