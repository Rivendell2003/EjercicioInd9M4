package com.example.ejercicioind9m4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);

        image1.setOnClickListener(v -> openSecondActivity(R.drawable._055551));
        image2.setOnClickListener(v -> openSecondActivity(R.drawable._273667));
        image3.setOnClickListener(v -> openSecondActivity(R.drawable._314583));
        image4.setOnClickListener(v -> openSecondActivity(R.drawable._554316));
    }

    private void openSecondActivity(int imageResId) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }
}
