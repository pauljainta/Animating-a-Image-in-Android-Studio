package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int flag;

    public void fade(View view)
    {
        ImageView imageView1=findViewById(R.id.imageView1);
        ImageView imageView2=findViewById(R.id.imageView2);

        if(flag==1)
        {
            imageView1.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            flag=2;
        }
        else
        {
            imageView2.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(2000);
            flag=1;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag=1;
    }
}