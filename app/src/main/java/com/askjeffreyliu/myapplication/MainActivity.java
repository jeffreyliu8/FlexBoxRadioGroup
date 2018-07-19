package com.askjeffreyliu.myapplication;

import android.os.Bundle;
import android.support.design.internal.FlexboxLayout;
import android.support.design.widget.FloatingActionButton;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FlexBoxRadioGroup myRadioGroup;
    private RadioButton rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myRadioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb_1);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlexboxLayout.LayoutParams params = new FlexboxLayout.LayoutParams(FlexBoxRadioGroup.LayoutParams.WRAP_CONTENT, FlexBoxRadioGroup.LayoutParams.WRAP_CONTENT);
                RadioButton rb = new RadioButton(MainActivity.this);
                rb.setText(R.string.app_name);
                myRadioGroup.addView(rb, 0, params);
            }
        });

        myRadioGroup.setOnCheckedChangeListener(new FlexBoxRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(FlexBoxRadioGroup group, int checkedId) {
                Log.d(TAG, "onCheckedChanged: " + checkedId);
                if (myRadioGroup.getCheckedRadioButtonId() == rb1.getId()) {
                    Snackbar.make(myRadioGroup, "You clicked on RB1", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }
}
