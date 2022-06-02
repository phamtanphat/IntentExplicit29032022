package com.example.intentexplicit29032022;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
        randomImage(imgRandom);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_random:
                randomImage(imgRandom);
                break;
        }
        return true;
    }

    private void randomImage(ImageView imageView) {
        int indexRandom = random.nextInt(arrNameImages.length);
        valueImgRandom = getResources().getIdentifier(arrNameImages[indexRandom], "drawable", getPackageName());
        imageView.setImageResource(valueImgRandom);
    }
}
