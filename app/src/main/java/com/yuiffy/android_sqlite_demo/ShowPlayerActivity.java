package com.yuiffy.android_sqlite_demo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class ShowPlayerActivity extends AppCompatActivity {
    PlayerDbHelper mDbHelper;
    SQLiteDatabase db;

    // Define a projection that specifies which columns from the database
    // you will actually use after this query.
    String[] projection = {
            MyContract.PlayerEntry._ID,
            MyContract.PlayerEntry.COLUMN_NAME_PLAYER_NAME,
            MyContract.PlayerEntry.COLUMN_NAME_SEX,
            MyContract.PlayerEntry.COLUMN_NAME_AGE
    };
    // How you want the results sorted in the resulting Cursor
    String sortOrder =
            MyContract.PlayerEntry.COLUMN_NAME_PLAYER_NAME + " DESC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_player);

        mDbHelper = new PlayerDbHelper(this);
        db = mDbHelper.getReadableDatabase();

        List<String> players = new ArrayList<String>();
        players = mDbHelper.getAllPlayerName(db);
        ArrayAdapter<String> theAdapter = new ArrayAdapter<String>(ShowPlayerActivity.this, android.R.layout.simple_expandable_list_item_1, players);
        ListView lv = (ListView) findViewById(R.id.lv_show_players);
        lv.setAdapter(theAdapter);
    }
}
