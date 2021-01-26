package com.example.widget.dialog;

import com.example.widget.BaseActivity;
import com.example.widget.viewgroup.ConstraintLayoutExprActivity;
import com.example.widget.viewgroup.ScrollViewActivity;

public class DialogDemoListActivity extends BaseActivity {

  {
    mTitle = new String[]{
        "Activity销毁，Dialog是否会同时被关闭",
    };
    mClasses = new Class[]{
        WhetherDialogDismissAfterActivityDestroyActivity.class,
    };
  }
}