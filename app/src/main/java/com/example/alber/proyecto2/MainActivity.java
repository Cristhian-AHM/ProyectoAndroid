package com.example.alber.proyecto2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.alber.proyecto2.view.primary_view;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accesar(View view){
        Intent intent = new Intent(getApplicationContext(), primary_view.class);
        startActivity(intent);
    }

    public void loginActivity(View view){
        Intent intent = new Intent(getApplicationContext(), new_user_activity.class);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        startActivity(intent);
    }

    public void internet(View view){
        Uri uri = Uri.parse("https://github.com/Cristhian-AHM");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
