package com.techtown.t_bate;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "posting.db";

    public DBHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Posting(postingName TEXT, postingContent TEXt)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Posting");
        onCreate(db);
    }

    public void insert(String postingName, String postingContent) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Posting VALUES('" + postingName + "', '" + postingContent + "')");
        db.close();
    }

    public void Update(String postingName, String postingContent) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE Posting SET postingName = '" + postingName + "'', postingContent = '" + postingContent + "'");
        db.close();
    }

    public void Delete(String name) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE Posting WHERE postingName = '" + name + "'");
        db.close();
    }

    public String getResult() {
        SQLiteDatabase db = getWritableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT * FROM Posting", null);
        while (cursor.moveToNext()) {
            result += " 제목: " + cursor.getString(0)
                    + "\n"
                    + cursor.getString(1);
        }

        return result;
    }

}
