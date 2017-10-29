package com.shanemcc94gmail.kings;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Rules extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rules);
        Toast.makeText(getApplicationContext(), "Touch Any Card To Display Rule",
                Toast.LENGTH_SHORT).show();


        Button newButton1= (Button)findViewById(R.id.mainMenu1);
        newButton1.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        startActivity(new Intent(Rules.this, MainActivity.class));
                    }
                });

        ImageButton imageButtonRule= (ImageButton)findViewById(R.id.imageButton);
        imageButtonRule.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardAce = new Intent(Rules.this, RulesExplanation.class);
                        cardAce.putExtra("cardNum", 1);
                        startActivity(cardAce);
                    }
                });

        ImageButton imageButtonRule2= (ImageButton)findViewById(R.id.imageButton2);
        imageButtonRule2.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardTwo = new Intent(Rules.this, RulesExplanation.class);
                        cardTwo.putExtra("cardNum", 2);
                        startActivity(cardTwo);
                    }
                });

        ImageButton imageButtonRule3= (ImageButton)findViewById(R.id.imageButton3);
        imageButtonRule3.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardThree = new Intent(Rules.this, RulesExplanation.class);
                        cardThree.putExtra("cardNum", 3);
                        startActivity(cardThree);
                    }
                });

        ImageButton imageButtonRule4= (ImageButton)findViewById(R.id.imageButton4);
        imageButtonRule4.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardFour = new Intent(Rules.this, RulesExplanation.class);
                        cardFour.putExtra("cardNum", 4);
                        startActivity(cardFour);
                    }
                });

        ImageButton imageButtonRule5= (ImageButton)findViewById(R.id.imageButton5);
        imageButtonRule5.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardFive= new Intent(Rules.this, RulesExplanation.class);
                        cardFive.putExtra("cardNum", 5);
                        startActivity(cardFive);
                    }
                });

        ImageButton imageButtonRule6= (ImageButton)findViewById(R.id.imageButton6);
        imageButtonRule6.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardSix= new Intent(Rules.this, RulesExplanation.class);
                        cardSix.putExtra("cardNum", 6);
                        startActivity(cardSix);
                    }
                });

        ImageButton imageButtonRule7= (ImageButton)findViewById(R.id.imageButton7);
        imageButtonRule7.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardSeven= new Intent(Rules.this, RulesExplanation.class);
                        cardSeven.putExtra("cardNum", 7);
                        startActivity(cardSeven);
                    }
                });

        ImageButton imageButtonRule8= (ImageButton)findViewById(R.id.imageButton8);
        imageButtonRule8.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardEight= new Intent(Rules.this, RulesExplanation.class);
                        cardEight.putExtra("cardNum", 8);
                        startActivity(cardEight);
                    }
                });

        ImageButton imageButtonRule9= (ImageButton)findViewById(R.id.imageButton9);
        imageButtonRule9.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardNine= new Intent(Rules.this, RulesExplanation.class);
                        cardNine.putExtra("cardNum", 9);
                        startActivity(cardNine);
                    }
                });

        ImageButton imageButtonRule10= (ImageButton)findViewById(R.id.imageButton10);
        imageButtonRule10.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardTen= new Intent(Rules.this, RulesExplanation.class);
                        cardTen.putExtra("cardNum", 10);
                        startActivity(cardTen);
                    }
                });

        ImageButton imageButtonRule11= (ImageButton)findViewById(R.id.imageButton11);
        imageButtonRule11.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardJack= new Intent(Rules.this, RulesExplanation.class);
                        cardJack.putExtra("cardNum", 11);
                        startActivity(cardJack);
                    }
                });

        ImageButton imageButtonRule12= (ImageButton)findViewById(R.id.imageButton12);
        imageButtonRule12.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardQueen= new Intent(Rules.this, RulesExplanation.class);
                        cardQueen.putExtra("cardNum", 12);
                        startActivity(cardQueen);
                    }
                });

        ImageButton imageButtonRule13= (ImageButton)findViewById(R.id.imageButton13);
        imageButtonRule13.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent cardKing= new Intent(Rules.this, RulesExplanation.class);
                        cardKing.putExtra("cardNum", 13);
                        startActivity(cardKing);
                    }
                });


    }
}