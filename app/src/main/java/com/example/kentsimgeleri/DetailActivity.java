package com.example.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//import static com.example.kentsimgeleri.MainActivity.resimsec;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView ad = findViewById(R.id.ad);
        TextView aciklama = findViewById(R.id.aciklama);

        Intent intent = getIntent();
        String isim = intent.getStringExtra("isim");
        String tanim = intent.getStringExtra("aciklama");
        ad.setText(isim);
        aciklama.setText(tanim);


        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getResimsec());


        //imageView.setImageBitmap(resimsec);








    }
}