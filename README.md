# FlexBoxRadioGroup
A radiogroup based on FlexboxLayout https://github.com/google/flexbox-layout


[![](https://jitpack.io/v/jeffreyliu8/FlexBoxRadioGroup.svg)](https://jitpack.io/#jeffreyliu8/FlexBoxRadioGroup)

Why FlexBoxRadioGroup
----------------
Are you tired of having your RadioGroup as just a LinearLayout? FlexBoxRadioGroup can arrange your RadioButton to a new line when screen is not wide enough.

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
	        implementation 'com.github.jeffreyliu8:FlexBoxRadioGroup:0.0.3'
	}
```

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

        <RadioButton
            android:id="@+id/rb_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="RB 2" />

        <RadioButton
            android:id="@+id/rb_3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="RB 3" />

    </com.askjeffreyliu.flexboxradiogroup.FlexBoxRadioGroup>
````
Check out MainActivity.java on how to use it in code. Very simple.

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
