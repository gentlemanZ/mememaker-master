package com.teamtreehouse.mememaker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.teamtreehouse.mememaker.models.Meme;
import com.teamtreehouse.mememaker.models.MemeAnnotation;

import java.util.ArrayList;

public class MemeDataSource {

    private Context mContext;
    private MemeSQLiteHelper mMemeSqliteHelper;
    public MemeDataSource(Context context) {
        mContext = context;
        mMemeSqliteHelper = new MemeSQLiteHelper(context);
        SQLiteDatabase database = mMemeSqliteHelper.getReadableDatabase();
        database.close();
    }
}













