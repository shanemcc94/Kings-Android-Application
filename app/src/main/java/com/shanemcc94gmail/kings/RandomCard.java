package com.shanemcc94gmail.kings;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Random;

public class RandomCard extends Activity {
    private ImageButton cardButton;
    private Drawable drawable;
    private Drawable [] drawables = null;
    public int Kings =4;
    public int cardsLeft = 52;

    ArrayList<Integer> test = new ArrayList<>();

    public int ranNum(){

        Random random = new Random();
        int randomNumber = 0;

        for (Drawable ignored : drawables) {

            randomNumber = random.nextInt(drawables.length);

            if (!(test.contains(randomNumber))) {
                test.add(randomNumber);

                Log.d(getClass().getName(), "value = " + randomNumber);

                return randomNumber;

            }

        }
        return randomNumber;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_card);




        cardButton = (ImageButton) findViewById(R.id.cardButton);
        Button appButton = (Button) findViewById(R.id.button);
        Toast toast= Toast.makeText(getApplicationContext(),
                "Tap The Card-Face To Display It's Rule", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
        if(Kings == 0){
            Intent gameOverIntent = new Intent(this, GameOver.class);
            startActivity(gameOverIntent);
        }
        drawables = new Drawable[] {
                getResources().getDrawable(R.drawable.s1),
                getResources().getDrawable(R.drawable.s2),
                getResources().getDrawable(R.drawable.s3),
                getResources().getDrawable(R.drawable.s4),
                getResources().getDrawable(R.drawable.s5),
                getResources().getDrawable(R.drawable.s6),
                getResources().getDrawable(R.drawable.s7),
                getResources().getDrawable(R.drawable.s8),
                getResources().getDrawable(R.drawable.s9),
                getResources().getDrawable(R.drawable.s10),
                getResources().getDrawable(R.drawable.sj),
                getResources().getDrawable(R.drawable.sq),
                getResources().getDrawable(R.drawable.sk),

                getResources().getDrawable(R.drawable.c1),
                getResources().getDrawable(R.drawable.c2),
                getResources().getDrawable(R.drawable.c3),
                getResources().getDrawable(R.drawable.c4),
                getResources().getDrawable(R.drawable.c5),
                getResources().getDrawable(R.drawable.c6),
                getResources().getDrawable(R.drawable.c7),
                getResources().getDrawable(R.drawable.c8),
                getResources().getDrawable(R.drawable.c9),
                getResources().getDrawable(R.drawable.c10),
                getResources().getDrawable(R.drawable.cj),
                getResources().getDrawable(R.drawable.cq),
                getResources().getDrawable(R.drawable.ck),

                getResources().getDrawable(R.drawable.d1),
                getResources().getDrawable(R.drawable.d2),
                getResources().getDrawable(R.drawable.d3),
                getResources().getDrawable(R.drawable.d4),
                getResources().getDrawable(R.drawable.d5),
                getResources().getDrawable(R.drawable.d6),
                getResources().getDrawable(R.drawable.d7),
                getResources().getDrawable(R.drawable.d8),
                getResources().getDrawable(R.drawable.d9),
                getResources().getDrawable(R.drawable.d10),
                getResources().getDrawable(R.drawable.dj),
                getResources().getDrawable(R.drawable.dq),
                getResources().getDrawable(R.drawable.dk),

                getResources().getDrawable(R.drawable.h1),
                getResources().getDrawable(R.drawable.h2),
                getResources().getDrawable(R.drawable.h3),
                getResources().getDrawable(R.drawable.h4),
                getResources().getDrawable(R.drawable.h5),
                getResources().getDrawable(R.drawable.h6),
                getResources().getDrawable(R.drawable.h7),
                getResources().getDrawable(R.drawable.h8),
                getResources().getDrawable(R.drawable.h9),
                getResources().getDrawable(R.drawable.h10),
                getResources().getDrawable(R.drawable.hj),
                getResources().getDrawable(R.drawable.hq),
                getResources().getDrawable(R.drawable.hk)
        };


        if(Kings == 0){

            Intent gameOverIntent = new Intent(this, GameOver.class);
            finish();
            startActivity(gameOverIntent);

        }
        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNumber = ranNum();
                drawable = drawables[randomNumber];


                cardsLeft = cardsLeft - 1;

                cardButton.setImageDrawable(drawable); // set the image to the ImageView

               // appImageView.setImageDrawable(drawable); // set the image to the ImageView
                if ((drawables[randomNumber] == drawables[12]) || (drawables[randomNumber] == drawables[25]) || (drawables[randomNumber] == drawables[38]) || (drawables[randomNumber] == drawables[51])) {
                    Kings = Kings - 1;
                }


                    if ((drawables[randomNumber] == drawables[0])||(drawables[randomNumber] == drawables[13])||(drawables[randomNumber] == drawables[26])||(drawables[randomNumber] == drawables[39])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("Ace - Touch Your Face");

                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardAce = new Intent(RandomCard.this, RulesExplanation.class);
                                        cardAce.putExtra("cardNum", 1);
                                        startActivity(cardAce);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[1])||(drawables[randomNumber] == drawables[14])||(drawables[randomNumber] == drawables[27])||(drawables[randomNumber] == drawables[40]))  {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("2 - F You");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardTwo= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardTwo.putExtra("cardNum", 2);
                                        startActivity(cardTwo);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[2])||(drawables[randomNumber] == drawables[15])||(drawables[randomNumber] == drawables[28])||(drawables[randomNumber] == drawables[41]))  {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("3 - F Me");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardThree= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardThree.putExtra("cardNum", 3);
                                        startActivity(cardThree);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[3])||(drawables[randomNumber] == drawables[16])||(drawables[randomNumber] == drawables[29])||(drawables[randomNumber] == drawables[42]))  {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("4 - Touch The Floor");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardFour= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardFour.putExtra("cardNum", 4);
                                        startActivity(cardFour);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[4])||(drawables[randomNumber] == drawables[17])||(drawables[randomNumber] == drawables[30])||(drawables[randomNumber] == drawables[43])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("5 - All The guys");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardFive= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardFive.putExtra("cardNum", 5);
                                        startActivity(cardFive);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[5])||(drawables[randomNumber] == drawables[18])||(drawables[randomNumber] == drawables[31])||(drawables[randomNumber] == drawables[44]))  {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("6 - All The chicks");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardSix= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardSix.putExtra("cardNum", 6);
                                        startActivity(cardSix);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[6])||(drawables[randomNumber] == drawables[19])||(drawables[randomNumber] == drawables[32])||(drawables[randomNumber] == drawables[45])){
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("7 - Heaven");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardSeven= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardSeven.putExtra("cardNum", 7);
                                        startActivity(cardSeven);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[7])||(drawables[randomNumber] == drawables[20])||(drawables[randomNumber] == drawables[33])||(drawables[randomNumber] == drawables[46])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("8 - Pick A Mate");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardEight= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardEight.putExtra("cardNum", 8);
                                        startActivity(cardEight);
                                    }
                                });
                    }
                    if((drawables[randomNumber] == drawables[8])||(drawables[randomNumber] == drawables[21])||(drawables[randomNumber] == drawables[34])||(drawables[randomNumber] == drawables[47])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("9 - Bust A Rhyme");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardNine = new Intent(RandomCard.this, RulesExplanation.class);
                                        cardNine.putExtra("cardNum", 9);
                                        startActivity(cardNine);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[9])||(drawables[randomNumber] == drawables[22])||(drawables[randomNumber] == drawables[35])||(drawables[randomNumber] == drawables[48])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("10 - Waterfall");
                        cardButton.setOnClickListener
                        (new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent cardTen = new Intent(RandomCard.this, RulesExplanation.class);
                                cardTen.putExtra("cardNum", 10);
                                startActivity(cardTen);
                            }
                        });
                    }
                    if ((drawables[randomNumber] == drawables[10])||(drawables[randomNumber] == drawables[23])||(drawables[randomNumber] == drawables[36])||(drawables[randomNumber] == drawables[49])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("Jack - Make A Rule");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardJack= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardJack.putExtra("cardNum", 11);
                                        startActivity(cardJack);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[11])||(drawables[randomNumber] == drawables[24])||(drawables[randomNumber] == drawables[37])||(drawables[randomNumber] == drawables[50])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("Queen - Quiz-master");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardQueen= new Intent(RandomCard.this, RulesExplanation.class);
                                        cardQueen.putExtra("cardNum", 12);
                                        startActivity(cardQueen);
                                    }
                                });
                    }
                    if ((drawables[randomNumber] == drawables[12])||(drawables[randomNumber] == drawables[25])||(drawables[randomNumber] == drawables[38])||(drawables[randomNumber] == drawables[51])) {
                        TextView textElement01 = (TextView) findViewById(R.id.rulesText);
                        textElement01.setText("KING!");
                        cardButton.setOnClickListener
                                (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent cardKing = new Intent(RandomCard.this, RulesExplanation.class);
                                        cardKing.putExtra("cardNum", 13);
                                        startActivity(cardKing);
                                    }
                                });


                    }


                TextView textElement = (TextView) findViewById(R.id.textView2);

                textElement.setText("Kings Remaining: " + Kings);

                TextView cardRemaining = (TextView) findViewById(R.id.textView4);
                cardRemaining.setText("Cards Remaining: " + cardsLeft);

                if (Kings == 0) {
                    startActivity(new Intent(RandomCard.this, GameOver.class));
                    finish();
                }



            }
        });

        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        startActivity(new Intent(RandomCard.this, MainActivity.class));
                    }
                });

    }


}
