package com.example.intentexplicit29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] arrNameImages;
    ImageView imgRandom, imgPick;
    Random random;
    int valueImgRandom = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgPick = findViewById(R.id.imgPick);
        imgRandom = findViewById(R.id.imgRandom);
        random = new Random();
        arrNameImages = getResources().getStringArray(R.array.arr_images);
        int indexRandom = random.nextInt(arrNameImages.length);
        valueImgRandom = getResources().getIdentifier(arrNameImages[indexRandom],"drawable",getPackageName());
        imgRandom.setImageResource(valueImgRandom);

    }
}
