package com.shanemcc94gmail.kings;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button quitButton = (Button) findViewById(R.id.quit_button);
        quitButton.setOnClickListener
        (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button newButton= (Button)findViewById(R.id.new_button);
        newButton.setOnClickListener
        (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainActivity.this,
                        RandomCard.class));
            }
        });

        Button rulesButton= (Button)findViewById(R.id.rules_button);
        rulesButton.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        startActivity(new Intent(MainActivity.this,
                                Rules.class));
                    }
                });

    }





}
