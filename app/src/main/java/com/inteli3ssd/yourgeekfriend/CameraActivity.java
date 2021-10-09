package com.inteli3ssd.yourgeekfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        if (null == savedInstanceState)
        {
            //getFragmentManager().beginTransaction().replace(R.id.container, Camera2BasicFragment.newInstance()).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,Camera2BasicFragment.newInstance()).commit();
        }

    }
}
