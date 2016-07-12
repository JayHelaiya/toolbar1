package com.example.nichetech.tabviewviewpager;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Menu bar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home :
            onBackPressed();
                return true;
            case R.id.english :
                Toast.makeText(getApplicationContext(),"English Language selected",Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.gujarati :
                Toast.makeText(getApplicationContext(),"gujarati Language selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.hindi :
                Toast.makeText(getApplicationContext(),"hindi Language selected",Toast.LENGTH_SHORT).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.memu_main,menu);
        return  true;
    }
}
