package com.shanemcc94gmail.kings;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;


public class SplashScreen extends Activity {
    protected boolean _active = true;
    protected int _splashTime = 3000; // time to display the splash screen in ms



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(hasCamera()){
            Toast.makeText(getApplicationContext(), "Camera Detected",
                    Toast.LENGTH_LONG).show();
        }
        setContentView(R.layout.activity_splash_screen);


        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 100;
                        }
                    }
                } catch (Exception ignored) {

                } finally {

                    startActivity(new Intent(SplashScreen.this,
                            MainActivity.class));
                    finish();
                }
            }
        };
        splashTread.start();
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private boolean hasCamera(){
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }
}
