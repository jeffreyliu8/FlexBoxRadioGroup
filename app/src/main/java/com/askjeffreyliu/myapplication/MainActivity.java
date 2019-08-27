package com.askjeffreyliu.myapplication;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup;
import com.askjeffreyliu.flexboxradiogroup.FlexBoxSingleCheckableGroup;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FlexBoxRadioGroup myRadioGroup;
    private FlexBoxSingleCheckableGroup checkableGroup;
    private RadioButton rb1;
    private MyRadioButton myRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myRadioGroup = findViewById(R.id.radioGroup);
        checkableGroup = findViewById(R.id.singleGroup);
        rb1 = findViewById(R.id.rb_1);
        myRadioButton = findViewById(R.id.myradiobutton1);

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
                            .show();
                }
            }
        });

        checkableGroup.setOnCheckedChangeListener(new FlexBoxSingleCheckableGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(FlexBoxSingleCheckableGroup group, int checkedId) {
                Log.d(TAG, "onCheckedChanged: " + checkedId);
                if (checkableGroup.getCheckedRadioButtonId() == myRadioButton.getId()) {
                    Snackbar.make(checkableGroup, "You clicked on a custom radio button", Snackbar.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}
