package com.example.test3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class UpdateProfile extends AppCompatActivity {

    private static final int PERMISSION_CODE1 = 500;
    ImageView imageView;
    private static final int PERMISSION_CODE=1000;
    Uri imageUri;
    private static final int CONTENT_REQUST_CODE=1001;
    private static final int IMAGE_PICK_CODE=501;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        imageView=(ImageView)findViewById(R.id.updateImage);
    }
    //on click listener for capture button
    public void capturePhoto(View view)
    {
        //Grant runtime permission if >marshmellow
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
        {
            if(checkSelfPermission(Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED
                    ||checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_DENIED)
            {
                String[] permissions={Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permissions,PERMISSION_CODE);
            }
            else
            {
                openCamera();
            }
        }
        else
        {
            openCamera();
        }
    }
    public void choosePhoto(View view)
    {
        //Grant runtime permission if >marshmellow
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
        {
            if(checkSelfPermission(Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED
                    ||checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_DENIED)
            {
                String[] permissions={Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE};
                requestPermissions(permissions,PERMISSION_CODE1);
            }
            else
            {
                pickImage();
            }
        }
        else
        {
            pickImage();
        }
    }

    private void pickImage()
    {
        Intent pick=new Intent(Intent.ACTION_PICK);
        pick.setType("image/*");
        startActivityForResult(pick,IMAGE_PICK_CODE);
    }

    private void openCamera()
    {
        ContentValues content=new ContentValues();
        content.put(MediaStore.Images.Media.TITLE,"New image");
        content.put(MediaStore.Images.Media.DESCRIPTION,"From the camera");
        imageUri=getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,content);
        //Intent to camera
        Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
        startActivityForResult(cameraIntent,CONTENT_REQUST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case PERMISSION_CODE:
            {
                if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    openCamera();
                }
                else
                {
                    Toast.makeText(this,"Permission denied",Toast.LENGTH_LONG).show();
                }
            }
            break;
            case PERMISSION_CODE1:
            {
                if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED)
                {
                    pickImage();
                }
                else
                {
                    Toast.makeText(this,"Permission denied",Toast.LENGTH_LONG).show();
                }
            }
            break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode==RESULT_OK&&requestCode==CONTENT_REQUST_CODE)
        {
            imageView.setImageURI(imageUri);
        }
        else if(resultCode==RESULT_OK && requestCode==IMAGE_PICK_CODE)
        {
            imageView.setImageURI(data.getData());
        }
    }
}
