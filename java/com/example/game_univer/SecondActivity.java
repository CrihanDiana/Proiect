package com.example.game_univer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    TextView mTitleText, mDescrText;
    ImageView imageView;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();

        mTitleText = findViewById(R.id.title2);
        mDescrText = findViewById(R.id.descript);
        imageView = findViewById(R.id.imageView);

        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".GicitoriActivity");
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mbytes = getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mbytes, 0, mbytes.length);

        actionBar.setTitle(mTitle);

        mTitleText.setText(mTitle);
        mDescrText.setText(mDescription);
        imageView.setImageBitmap(bitmap);
    }

}
