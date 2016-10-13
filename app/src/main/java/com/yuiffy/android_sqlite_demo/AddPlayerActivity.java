package com.yuiffy.android_sqlite_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddPlayerActivity extends AppCompatActivity {

    List<String> players = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
        findViewById(R.id.btnAddPlayer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTV = (TextView) findViewById(R.id.editAddPlayerName);
                String playerName = nameTV.getText().toString();
                ListView lv = (ListView) findViewById(R.id.addPlayerListView);
                players.add(playerName);
                System.out.println(players);
                ArrayAdapter<String> theAdapter = new ArrayAdapter<String>(AddPlayerActivity.this, android.R.layout.simple_expandable_list_item_1, players);
                lv.setAdapter(theAdapter);
            }
        });
    }
}
