package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Random object to choose which ball to choose
    private Random rnd;

    // Image view to show the ball
    private ImageView ballImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate variables
        rnd = new Random();
        ballImageView = findViewById(R.id.image_eightBall);

        final int[] images = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        // Create onclick for the button
        findViewById(R.id.askButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballImageView.setImageResource(images[rnd.nextInt(images.length)]);
            }
        });
    }
}
