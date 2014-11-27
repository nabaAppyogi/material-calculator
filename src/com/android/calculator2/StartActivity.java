package com.android.calculator2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final int version = android.os.Build.VERSION.SDK_INT;
        if (version >= 21) {
            startActivity(new Intent(this, CalculatorL.class));
        } else {
            startActivity(new Intent(this, CalculatorGB.class));
        }
        finish();
    }
}
