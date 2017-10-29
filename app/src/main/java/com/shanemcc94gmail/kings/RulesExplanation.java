package com.shanemcc94gmail.kings;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;


public class RulesExplanation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_rules_explanation);
        getTaskId();

        Intent cardAce = getIntent();
        int intValue = cardAce.getIntExtra("cardNum", 0);






        if (intValue == 1) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.ace_Rule));
        } else if (intValue == 2) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.two_Rule));
        } else if (intValue == 3) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.three_Rule));
        } else if (intValue == 4) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.four_Rule));
        } else if (intValue == 5) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.five_Rule));
        } else if (intValue == 6) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.six_Rule));
        } else if (intValue == 7) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.seven_Rule));
        } else if (intValue == 8) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.eight_Rule));
        } else if (intValue == 9) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.nine_Rule));
        } else if (intValue == 10) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.ten_Rule));
        } else if (intValue == 11) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.jack_Rule));
        } else if (intValue == 12) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.queen_Rule));
        } else if (intValue == 13) {
            TextView textExOnScreen = (TextView) findViewById(R.id.text_explanation_on_screen);
            textExOnScreen.setText(getString(R.string.king_Rule));
        }


        Button newButtonBack = (Button) findViewById(R.id.backButton);
        newButtonBack.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                       // startActivity(new Intent(RulesExplanation.this, Rules.class));
                    }
                });
    }
}
