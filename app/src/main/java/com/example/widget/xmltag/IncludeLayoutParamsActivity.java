package com.example.widget.xmltag;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.widget.R;

/*
 * include标签下直接增加LayoutParam，如果layout中也有LayoutParam，哪个生效？
 * 答：include标签下的LayoutParam生效。
 */
public class IncludeLayoutParamsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_include_layout_params);
  }
}