package com.techtown.t_bate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

public class EditPostingActivity extends AppCompatActivity {

    DBHelper dbHelper;



    Posting Post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_posting);

        Post.postingName = findViewById(R.id.postingName).toString();
        Post.postingContent = findViewById(R.id.postingContent).toString();

        dbHelper = new DBHelper(EditPostingActivity.this, 1);

        Button editPostingDBButton = findViewById(R.id.editPostingDBButton);
        editPostingDBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.insert(Post.postingName, Post.postingContent);
                Toast.makeText(getApplicationContext(), "생성되었습니다",  Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}

