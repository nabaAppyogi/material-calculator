package com.android.calculator2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CalculatorHome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Utils.hasLollipop()) {
            startActivity(new Intent(this, CalculatorL.class));
        } else {
            startActivity(new Intent(this, CalculatorGB.class));
        }
        finish();
    }
}
