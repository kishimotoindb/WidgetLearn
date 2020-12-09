package com.example.widget;

import com.example.widget.edittext.EditTextActivity;
import com.example.widget.textview.TextViewActivity;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";

  {
    mTitle = new String[]{
        "TextView",
        "EditText",
    };
    mClasses = new Class[]{
        TextViewActivity.class,
        EditTextActivity.class,
    };
  }
}