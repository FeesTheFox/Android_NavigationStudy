package com.example.navigationstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("menu1");
        menu.add("menu1");
        menu.add("menu1");
        menu.add("menu1");
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return  super.onOptionsItemSelected(item);
    }
}