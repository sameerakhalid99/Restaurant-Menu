package com.example.restaurantmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void food(View view) {
        Intent intent = new Intent(this,food.class);
        startActivity(intent);
    }

    public void drinks(View view) {
        Intent intent = new Intent(this,drinks.class);
        startActivity(intent);
    }

    public void desserts(View view) {
        Intent intent = new Intent(this,desserts.class);
        startActivity(intent);
    }
}
