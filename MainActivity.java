package com.example.aarti_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] tAarti=getResources().getStringArray(R.array.title_aarti);
        final String[] dAarti=getResources().getStringArray(R.array.detail_aarti);

        listView=findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, tAarti);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String t= dAarti[position];
                Intent intent=new Intent(MainActivity.this,Aarti.class);
                intent.putExtra("Aarti",t);
                startActivity(intent);

            }
        });

    }
}
