package com.example.layoutsexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondExample extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_example);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_second_example, menu);
        return true;
    }
}
