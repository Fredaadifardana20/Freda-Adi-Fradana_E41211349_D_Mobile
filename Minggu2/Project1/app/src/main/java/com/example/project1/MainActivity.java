package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
    }
    public void menu(View view){
        Intent intent = new Intent(MainActivity.this,activity_linear.class);
        startActivity(intent);
    }
    public void menu2(View view){
        Intent intent = new Intent(MainActivity.this,activity_relative.class);
        startActivity(intent);
    }
    public void menu3(View view){
        Intent intent = new Intent(MainActivity.this,activity_constraint.class);
        startActivity(intent);
    }public void menu4(View view){
        Intent intent = new Intent(MainActivity.this,activity_frame.class);

        startActivity(intent);
    }

    public void menu5(View view){
        Intent intent = new Intent(MainActivity.this,activity_table.class);

        startActivity(intent);
    }
    public void menu6(View view){
        Intent intent = new Intent(MainActivity.this,activity_material_design.class);

        startActivity(intent);
    }
    public void menu7(View view){
        Intent intent = new Intent(MainActivity.this,activity_scroll_view_horizontal.class);

        startActivity(intent);
    }
    public void menu8(View view){
        Intent intent = new Intent(MainActivity.this,activity_scroll_view_vertical.class);

        startActivity(intent);
    }
}