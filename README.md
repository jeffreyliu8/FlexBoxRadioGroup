# FlexBoxRadioGroup
A radiogroup based on FlexboxLayout https://github.com/google/flexbox-layout
Inspired by https://github.com/mrHerintsoaHasina/flextools, however, this lib's min sdk is 17, not 14. And not working well for me. So I build this new one.


[![](https://jitpack.io/v/jeffreyliu8/FlexBoxRadioGroup.svg)](https://jitpack.io/#jeffreyliu8/FlexBoxRadioGroup)

Why FlexBoxRadioGroup
----------------
Are you tired of having your RadioGroup as just a LinearLayout? Are you frustrated that you can't build your own custom RadioButton? Worry no more!

Using FlexBoxRadioGroup
----------------

### Setup
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


##### Dependencies
```groovy
	dependencies {
	        implementation 'com.github.jeffreyliu8:FlexBoxRadioGroup:0.0.6'
	}
```
FlexBoxRadioGroup is for RadioButton and AppCompatRadioButton (Typical case, no custom RadioButton)
````xml
    <com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:alignContent="space_around"
        app:alignItems="flex_start"
        app:checkedButton="@+id/rb_3"
        app:flexWrap="wrap">

        <RadioButton
            android:id="@+id/rb_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="RB 1" />

        <android.support.v7.widget.AppCompatRadioButton
            android:id="@+id/rb_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="RB 2" />
    </com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup>
````
Check out MainActivity.java on how to use it in code. Very simple.

For advnace developer, you might want to customize RadioButton(which means you can inflate custom layout, RadioButton is NOT a ViewGroup therefore you can't call addView() and inflate layout)
Use FlexBoxSingleCheckableGroup and CustomizableRadioButton. You can extend CustomizableRadioButton to build your own RadioButton, or just specify the background drawable for different states, see selector_horizontal.xml for more detail.
````xml
     <com.askjeffreyliu.flexboxradiogroup.FlexBoxSingleCheckableGroup
        android:id="@+id/singleGroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:visibility="visible"
        app:alignContent="space_around"
        app:alignItems="flex_start"
        app:checkedButton="@+id/rb_3"
        app:flexWrap="wrap">

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="test 1" />

        <android.support.v7.widget.AppCompatRadioButton
            android:id="@+id/rb4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="test 3" />

        <com.askjeffreyliu.flexboxradiogroup.CustomizableRadioButton
            android:id="@+id/test"
            android:layout_width="44dp"
            android:layout_height="44dp"
            android:background="@drawable/selector_horizontal"
            android:padding="8dp" />
     
        <com.askjeffreyliu.myapplication.MyRadioButton
            android:id="@+id/myradiobutton1"
            android:layout_width="wrap_content"
            android:layout_height="60dp"
            android:layout_margin="4dp" />
    </com.askjeffreyliu.flexboxradiogroup.FlexBoxSingleCheckableGroup>
````

Extending CustomizableRadioButton
````java
public class MyRadioButton extends CustomizableRadioButton {
    private TextView textView;

    public MyRadioButton(Context context) {
        super(context);
        initView();
    }

    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        View view = inflate(getContext(), R.layout.my_radio_button, null);
        addView(view);
        textView = view.findViewById(R.id.text);
    }

    @Override
    public void setChecked(boolean b) {
        super.setChecked(b);
        if (textView != null) {
            textView.setText(b ? android.R.string.yes : android.R.string.no);
        }
    }
}
````

![Output sample](https://github.com/jeffreyliu8/FlexBoxRadioGroup/blob/master/screenshot.png)

Requirements
--------------
Requires a minimum SDK version of 14

Developed By
-------
Jeffrey Liu - <jeffreyliu8@gmail.com>

<a href="https://www.linkedin.com/in/jeffrey-liu-08a0b936">

License
-------

    Copyright 2018 Jeffrey Liu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
