package com.example.widget;

import com.example.widget.dialog.DialogDemoListActivity;
import com.example.widget.edittext.EditTextActivity;
import com.example.widget.props.PropsDemoListActivity;
import com.example.widget.recyclerview.RecyclerViewDemoListActivity;
import com.example.widget.textview.TextViewActivity;
import com.example.widget.viewgroup.ViewGroupDemoListActivity;
import com.example.widget.xmltag.XmlTagDemoListActivity;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";

  {
    mTitle = new String[]{
        "TextView",
        "EditText",
        "RecyclerView",
        "XmlTag",
        "控件属性",
        "ViewGroup",
        "Dialog",
    };
    mClasses = new Class[]{
        TextViewActivity.class,
        EditTextActivity.class,
        RecyclerViewDemoListActivity.class,
        XmlTagDemoListActivity.class,
        PropsDemoListActivity.class,
        ViewGroupDemoListActivity.class,
        DialogDemoListActivity.class,
    };
  }
}