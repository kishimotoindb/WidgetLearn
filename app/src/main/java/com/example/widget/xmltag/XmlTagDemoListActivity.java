package com.example.widget.xmltag;

import com.example.widget.BaseActivity;
import com.example.widget.recyclerview.ListEmptyBackgroundNotDrawActivity;

public class XmlTagDemoListActivity extends BaseActivity {
  private static final String TAG = "XmlTagDemoListActivity";

  {
    mTitle = new String[]{
        "include标签的layout params，layout中的layout params，哪个生效",
    };
    mClasses = new Class[]{
        ListEmptyBackgroundNotDrawActivity.class,
    };
  }
}