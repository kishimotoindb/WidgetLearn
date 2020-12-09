package com.example.widget.textview.inputfilter;

import android.os.Bundle;
import android.text.InputFilter;
import androidx.appcompat.app.AppCompatActivity;

import com.example.widget.databinding.ActivityInputFilterSetBinding;

/*
 * InputFilter与文字内容的设置顺序问题：
 * 1）先设置文字，再设置InputFilter，InputFilter在下次输入的时候生效
 * 2）先设置InputFilter，后设置文字，InputFilter设置后即生效，也就说后面设置的文字会被裁剪到5个字。
 */
public class InputFilterSetActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    final ActivityInputFilterSetBinding binding =
        ActivityInputFilterSetBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    binding.buttonFilter.setOnClickListener(v -> {
      binding.editText.setFilters(new InputFilter[]{
          new InputFilter.LengthFilter(5)});
    });
    binding.buttonWord.setOnClickListener(v -> {
      binding.editText.setText("我是六个字的");
    });
  }
}