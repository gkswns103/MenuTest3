package com.example.menutest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.apple:
                Toast.makeText(getApplicationContext(), "사과 메뉴 선택", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.grape:
                Toast.makeText(getApplicationContext(), "포도 메뉴 선택", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.banana:
                Toast.makeText(getApplicationContext(), "바나나 메뉴 선택", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}