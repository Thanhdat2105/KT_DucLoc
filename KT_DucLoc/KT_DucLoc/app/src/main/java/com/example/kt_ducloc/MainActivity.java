package com.example.kt_ducloc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView,imageView2,imageView3,imageView5,imageView4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void Thoat(View view) {
     finish();
    }


    public void so1(View view) {
        imageView.setOnClickListener(v ->{
            i = new Intent(MainActivity.this,KTS1Activity.class);
            startActivity(i);
    });
}

    public void so2(View view) {
        imageView2.setOnClickListener(v ->{
            i = new Intent(MainActivity.this,KTS2Activity.class);
            startActivity(i);
        });
    }



}