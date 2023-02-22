package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }
    public void menu(View view){
        Intent intent = new Intent(MainActivity.this, ActivityLinear.class);
        startActivity(intent);
    }
    public void menu2(View view){
        Intent intent = new Intent(MainActivity.this, ActivityRelative.class);
        startActivity(intent);
    }
    public void menu3(View view){
        Intent intent = new Intent(MainActivity.this, ActivityConstraint.class);
        startActivity(intent);
    }public void menu4(View view){
        Intent intent = new Intent(MainActivity.this, ActivityFrame.class);

        startActivity(intent);
    }

    public void menu5(View view){
        Intent intent = new Intent(MainActivity.this, ActivityTable.class);

        startActivity(intent);
    }
    public void menu6(View view){
        Intent intent = new Intent(MainActivity.this, ActivityMaterialDesign.class);

        startActivity(intent);
    }
    public void menu7(View view){
        Intent intent = new Intent(MainActivity.this, ActivityScrollViewHorizontal.class);

        startActivity(intent);
    }
    public void menu8(View view){
        Intent intent = new Intent(MainActivity.this, ActivityScrollViewVertical.class);

        startActivity(intent);
    }
}