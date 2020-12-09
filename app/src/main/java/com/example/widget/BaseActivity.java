package com.example.widget;

import android.app.Activity;
import android.os.Bundle;

import com.example.widget.databinding.ActivityMainBinding;

public class BaseActivity extends Activity {
    protected String[] mTitle;
    protected Class[] mClasses;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.listview.setAdapter(new MyAdapter(mTitle, mClasses));
    }
}
