package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailMovie extends AppCompatActivity {
    ImageView imageDetail;
    ImageView imageBg;
    TextView textTitle,textDesc,textRating;

    public static final String Extra_movie = "extra_movie";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        imageDetail = findViewById(R.id.image_detail);
        imageBg = findViewById(R.id.bg_image);
        textTitle = findViewById(R.id.tex_title);
        textDesc = findViewById(R.id.tex_desc);
        textRating = findViewById(R.id.tex_rating);

        Movie movie = getIntent().getParcelableExtra(Extra_movie);
        String title = movie.getName();
        String desc = movie.getDescription();
        String rating = movie.getRating();
        int image = movie.getPhoto();

        textTitle.setText(title);
        textDesc.setText(desc);
        textRating.setText(rating);
        imageDetail.setImageResource(image);
        imageBg.setImageResource(image);



    }


}
