package com.askjeffreyliu.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.askjeffreyliu.flexboxradiogroup.CustomizableRadioButton
import kotlinx.android.synthetic.main.my_radio_button.view.*

class MyRadioButton @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : CustomizableRadioButton(context, attrs) {

    init {
        LayoutInflater.from(context)
                .inflate(R.layout.my_radio_button, this, true)
    }

    override fun setChecked(b: Boolean) {
        super.setChecked(b)
        if (text != null) {
            text.setText(if (b) android.R.string.yes else android.R.string.no)
        }
    }
}