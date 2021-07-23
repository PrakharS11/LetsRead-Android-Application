package com.example.myapplication2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBManager extends SQLiteOpenHelper {

    private static final String dbname="dbbooks";
    Adapter_1 adapter;

    public DBManager(Context context ) {
        super(context,dbname,null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        String qry="create table tbl_book ( id integer primary key autoincrement, book text, author text, genre text)";
        DB.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        String qry="DROP TABLE IF EXISTS tbl_book";
        DB.execSQL(qry);
        onCreate(DB);

    }

    public  Boolean addRecord(String book, String author, String genre)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("book",book);
        contentValues.put("author",author);
        contentValues.put("genre",genre);
        long result = db.insert("tbl_book",null,contentValues);
        if(result == -1)
            return false;
        else
            return  true;
    }

    public boolean delRecord(String book)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from tbl_book where book = ?", new String[]{book});
        if (cursor.getCount() > 0) {
            long result = DB.delete("tbl_book", "book=?", new String[]{book});

            if (result == -1)
                return false;
            else
                return true;
        }
        else
            return true;
    }

    public Cursor readData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String qry="select * from tbl_book order by id asc";
        Cursor cursor=db.rawQuery(qry,null);
        return  cursor;
    }

}
