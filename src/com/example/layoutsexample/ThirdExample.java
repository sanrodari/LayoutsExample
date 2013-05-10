package com.example.layoutsexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ThirdExample extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_example);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_third_example, menu);
        return true;
    }
}
