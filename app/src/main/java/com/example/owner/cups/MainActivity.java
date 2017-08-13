package com.example.owner.cups;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;

    Button newGame;

    List<Integer> cards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Allows card graphical images to become interactive and dynamic
        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);

        //Allows new game button to become interactive and dynamic
        newGame = (Button) findViewById(R.id.newgame);


        cards = new ArrayList<>();
        cards.add(107); // 7 of diamonds
        cards.add(307); // 7 of hearts
        cards.add(407); // 7 of spades


        //Scramble the cards
        Collections.shuffle(cards);


        //Makes left card image interactive
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cards.get(0) == 107){

                    left.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();

                } else if(cards.get(0) == 307){

                    left.setImageResource(R.drawable.hearts);

                } else {

                    left.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(1) == 107){

                    middle.setImageResource(R.drawable.spades);

                } else if(cards.get(1) == 307){

                    middle.setImageResource(R.drawable.hearts);

                } else {

                    middle.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(2) == 107){

                    right.setImageResource(R.drawable.spades);

                } else if(cards.get(2) == 307){

                    right.setImageResource(R.drawable.hearts);

                } else {

                    right.setImageResource(R.drawable.diamonds);

                }




            }
        });

        //Makes middle card image interactive
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cards.get(0) == 107){

                    left.setImageResource(R.drawable.spades);


                } else if(cards.get(0) == 307){

                    left.setImageResource(R.drawable.hearts);

                } else {

                    left.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(1) == 107){

                    middle.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();

                } else if(cards.get(1) == 307){

                    middle.setImageResource(R.drawable.hearts);

                } else {

                    middle.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(2) == 107){

                    right.setImageResource(R.drawable.spades);

                } else if(cards.get(2) == 307){

                    right.setImageResource(R.drawable.hearts);

                } else {

                    right.setImageResource(R.drawable.diamonds);

                }

            }
        });

        //Makes right card image interactive
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cards.get(0) == 107){

                    left.setImageResource(R.drawable.spades);

                } else if(cards.get(0) == 307){

                    left.setImageResource(R.drawable.hearts);

                } else {

                    left.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(1) == 107){

                    middle.setImageResource(R.drawable.spades);

                } else if(cards.get(1) == 307){

                    middle.setImageResource(R.drawable.hearts);

                } else {

                    middle.setImageResource(R.drawable.diamonds);

                }

                if(cards.get(2) == 107){

                    right.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();

                } else if(cards.get(2) == 307){

                    right.setImageResource(R.drawable.hearts);

                } else {

                    right.setImageResource(R.drawable.diamonds);

                }


            }
        });


        //Makes 'NEW GAME' button interactive
        newGame.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Collections.shuffle(cards);

                left.setImageResource(R.drawable.back);
                middle.setImageResource(R.drawable.back);
                right.setImageResource(R.drawable.back);

                Animation animLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                Animation animMiddle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                Animation animRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                left.startAnimation(animLeft);
                middle.startAnimation(animMiddle);
                right.startAnimation(animRight);

            }

        });

    }

}




