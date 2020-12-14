package com.example.widget.recyclerview;

import com.example.widget.BaseActivity;
import com.example.widget.edittext.EditTextActivity;
import com.example.widget.textview.TextViewActivity;

public class RecyclerViewActivity extends BaseActivity {
  private static final String TAG = "RecyclerViewActivity";

  {
    mTitle = new String[]{
        "列表为空，背景是否会绘制",
    };
    mClasses = new Class[]{
        ListEmptyBackgroundNotDrawActivity.class,
    };
  }
}