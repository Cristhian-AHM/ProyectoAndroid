package com.example.alber.proyecto2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alber.proyecto2.R;
import com.squareup.picasso.Picasso;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        showToolbar();

        Bundle bundle = getIntent().getExtras();

        TextView tvNombre = findViewById(R.id.userNamePost);
        TextView tvlikes = findViewById(R.id.likeNumberPost);
        TextView tvtitulo = findViewById(R.id.TitlePost);
        TextView tvcuerpo = findViewById(R.id.bodyPost);
        ImageView imgPost = findViewById(R.id.picture_post);

        Picasso.get().load(bundle.getString("picture")).into(imgPost);
        tvNombre.setText(bundle.getString("nombre"));
        tvlikes.setText(bundle.getInt("likes")+"");
        tvtitulo.setText(bundle.getString("titulo"));
        tvcuerpo.setText(bundle.getString("cuerpo"));
    }

    public void showToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar_transparent);
        setSupportActionBar(toolbar);
        setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setBackgroundColor(0);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}