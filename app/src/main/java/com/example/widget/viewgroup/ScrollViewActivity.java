package com.example.widget.viewgroup;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import com.example.widget.R;

public class ScrollViewActivity extends AppCompatActivity {
  private static final String TAG = "ScrollViewActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scroll_view);
    NestedScrollView scrollView = findViewById(R.id.scrollView);
    View wrapper = findViewById(R.id.wrapper);
    View first = findViewById(R.id.first);
    View second = findViewById(R.id.second);

    scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
      @Override
      public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX,
          int oldScrollY) {
        Log.e(TAG, "onScrollChange: scrollY " + scrollY);
        Log.e(TAG, "onScrollChange: wrapper y " + wrapper.getY());
        Log.e(TAG, "onScrollChange: first y " + first.getY());
        Log.e(TAG, "onScrollChange: second y " + second.getY());
      }
    });


  }
}