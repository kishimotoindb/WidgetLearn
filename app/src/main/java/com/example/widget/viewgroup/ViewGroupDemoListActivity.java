package com.example.widget.viewgroup;

import com.example.widget.BaseActivity;

public class ViewGroupDemoListActivity extends BaseActivity {

  {
    mTitle = new String[]{
        "ConstraintLayout布局参数实验",
        "ScrollView滚动监听",
    };
    mClasses = new Class[]{
        ConstraintLayoutExprActivity.class,
        ScrollViewActivity.class,
    };
  }
}