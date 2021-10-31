package com.techtown.t_bate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.techtown.t_bate.DBHelper.DATABASE_NAME;


public class MainActivity extends AppCompatActivity {

        DBHelper helper;
        SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        helper = new DBHelper(MainActivity.this, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);

        String sql = "select * from mytable;";
        Cursor c = db.rawQuery(sql, null);
        String[] strs = new String[]{"txt"};
        int[] ints = new int[] {R.id.listView};

        SimpleCursorAdapter adapter = null;
        adapter = new SimpleCursorAdapter(listView.getContext(), R.layout.listview, c, strs, ints,0);

        listView.setAdapter(adapter);

        Button editPostingButton = findViewById(R.id.editPostingButton);
        editPostingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditPostingActivity.class);
                startActivity(intent);

            }
        });

    }

}
