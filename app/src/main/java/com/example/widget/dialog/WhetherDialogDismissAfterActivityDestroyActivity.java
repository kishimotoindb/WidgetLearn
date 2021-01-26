package com.example.widget.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;

import com.example.widget.R;

public class WhetherDialogDismissAfterActivityDestroyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whether_dialog_dismiss_after_destroy);

        /*
         * Activity销毁的时候，dialog会自动销毁。
         */
        new AlertDialog.Builder(this).setMessage("测试是否一起销毁").show();

        findViewById(android.R.id.content).postDelayed(this::finish, 5000);
    }
}