package com.shanemcc94gmail.kings;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Random;


public class GameOver extends Activity {

   static final int REQUEST_IMAGE_CAPTURE=1;
   ImageView viewPic;


    MediaPlayer loserSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        loserSound = MediaPlayer.create(this, R.raw.losersong);
        loserSound.start();
        Button newButton= (Button)findViewById(R.id.mainMenu);
        Button camButton= (Button)findViewById(R.id.camButton);
        viewPic=(ImageView) findViewById(R.id.viewPic);
        //Disable Button if user does not have camera
        if(!hasCamera())
               camButton.setEnabled(false);



        newButton.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        loserSound.stop();
                        startActivity(new Intent(GameOver.this, MainActivity.class));

                    }
                });




    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private boolean hasCamera(){
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    //Launching Camera
    public void launchCamera(View view){
        Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView textElement01 = (TextView) findViewById(R.id.textView5);
        textElement01.setText(" ");

        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
           //Means Image was taken without error
            Bundle extras = data.getExtras();
            assert extras != null;
            Bitmap photo = (Bitmap)extras.get("data");
            //Converts Photo info to bitmap
            viewPic.setImageBitmap(photo);
            //Sets ImageView to captured Image
            OutputStream output;
            // Find the storage path
            File filePath = Environment.getExternalStorageDirectory();
            // Create a new folder in Storage
            File dir = new File(filePath.getAbsolutePath()
                    + "/KingsApp/");

            //Random number generator for filename so multiple images can be saved
            Random generator = new Random();
            int n = 10000;
            n = generator.nextInt(n);
            String fileName= "KingsLoserPic" + n + ".jpg" ;

            // Create a name for the saved image
            File file = new File(dir, fileName );
            try {

                output = new FileOutputStream(file);

                // Compress into png format image from 0% - 100%
                assert photo != null;
                photo.compress(Bitmap.CompressFormat.JPEG, 100, output);
                output.flush();
                output.close();
                addImageToGallery(file.getAbsolutePath(), GameOver.this);
            }

            catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }


    public static void addImageToGallery(final String filePath, final Context context) {

        ContentValues values = new ContentValues();

        values.put(MediaStore.Images.Media.DATE_TAKEN, System.currentTimeMillis());
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
        values.put(MediaStore.MediaColumns.DATA, filePath);

        context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
    }
}
