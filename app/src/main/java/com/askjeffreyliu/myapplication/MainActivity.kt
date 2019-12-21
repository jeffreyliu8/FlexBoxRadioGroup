package com.askjeffreyliu.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup
import com.google.android.flexbox.FlexboxLayout
import kotlinx.android.synthetic.main.activity_main.*


import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            val params = FlexboxLayout.LayoutParams(FlexBoxRadioGroup.LayoutParams.WRAP_CONTENT, FlexBoxRadioGroup.LayoutParams.WRAP_CONTENT)
            val rb = RadioButton(this@MainActivity)
            rb.setText(R.string.app_name)
            radioGroup.addView(rb, 0, params)
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            Log.d(TAG, "onCheckedChanged: $checkedId")
            if (radioGroup.checkedRadioButtonId == rb1.id) {
                Snackbar.make(radioGroup, "You clicked on RB1", Snackbar.LENGTH_LONG)
                        .show()
            }
        }

        singleGroup.setOnCheckedChangeListener { _, checkedId ->
            Log.d(TAG, "onCheckedChanged: $checkedId")
            if (singleGroup.checkedRadioButtonId == myradiobutton1.id) {
                Snackbar.make(singleGroup, "You clicked on a custom radio button", Snackbar.LENGTH_LONG)
                        .show()
            }
        }
    }
}
