package com.example.intentexplicit29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GalleryImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_image);

        Intent intent = getIntent();
        if (intent != null) {
//            String[] arrNameImages = intent.getStringArrayExtra("array");
//            Person person = (Person) intent.getSerializableExtra("object");
            Person person = (Person) intent.getParcelableExtra("object");
            Log.d("BBB",person.name + "");
        }
    }
}
