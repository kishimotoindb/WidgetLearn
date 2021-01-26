package com.example.widget.props;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.widget.databinding.ActivityEnableStateColorExprBinding;

public class EnableStateColorExprActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityEnableStateColorExprBinding binding =
        ActivityEnableStateColorExprBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    binding.btnSwitchState.setOnClickListener(view -> {
      TextView target = binding.target;
      target.setEnabled(!target.isEnabled());
      target.setAlpha(target.isEnabled() ? 1f : 0.5f);

    });
  }
}