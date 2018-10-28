package com.example.khush.cameraapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1,image2,image3,image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);
        image3 = (ImageView)findViewById(R.id.image3);
        image4 = (ImageView)findViewById(R.id.image4);
    }

    public void openCamera1(View view){
        Intent openCam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(openCam,1);
    }
    public void openCamera2(View view){
        Intent openCam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(openCam,2);
    }
    public void openCamera3(View view){
        Intent openCam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(openCam,3);
    }
    public void openCamera4(View view){
        Intent openCam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(openCam,4);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image1.setImageBitmap(imageBitmap);
        }
        if (requestCode == 2 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image2.setImageBitmap(imageBitmap);
        }
        if (requestCode == 3 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image3.setImageBitmap(imageBitmap);
        }
        if (requestCode == 4 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image4.setImageBitmap(imageBitmap);
        }
    }
}
