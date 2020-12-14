package com.example.widget.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.widget.R;

/*
 * RecyclerView的背景，即使列表为空，也是会进行绘制的。
 */
public class ListEmptyBackgroundNotDrawActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_empty_background_not_draw);
    RecyclerView rv = findViewById(R.id.list);
    rv.setLayoutManager(new LinearLayoutManager(this));
    rv.setAdapter(new ListAdapter(new DiffUtil.ItemCallback() {
      @Override
      public boolean areItemsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        return false;
      }

      @Override
      public boolean areContentsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        return false;
      }
    }) {
      @NonNull
      @Override
      public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
      }

      @Override
      public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

      }
    });
  }
}