package com.example.ejercicioind9m4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // forma para obtener la img
        ImageView selectedImage = findViewById(R.id.selectedImage);
        int imageResId = getIntent().getIntExtra("imageResId", -1);

        // aca la config de la img
        if (imageResId != -1) {
            selectedImage.setImageResource(imageResId);
        }

        // un boton para volver ala principal
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> finish());
    }
}
