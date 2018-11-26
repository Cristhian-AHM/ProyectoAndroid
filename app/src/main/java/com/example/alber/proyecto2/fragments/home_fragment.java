package com.example.alber.proyecto2.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alber.proyecto2.R;
import com.example.alber.proyecto2.adapter.post_adapter;
import com.example.alber.proyecto2.model.Post;
import com.example.alber.proyecto2.view.PostActivity;

public class home_fragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Toolbar mToolbar;

    public home_fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        activity.setTitle("Home");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = getView().findViewById(R.id.reciclerViewHome);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter =  new post_adapter(Post.publicaciones, new post_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(Post item) {
                Intent intent = new Intent(getView().getContext(), PostActivity.class);
                intent.putExtra("picture", item.getPicture());
                intent.putExtra("nombre", item.getUsuario());
                intent.putExtra("likes", item.getLikes());
                intent.putExtra("titulo", item.getTitle());
                intent.putExtra("cuerpo", item.getBody());
                getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent);
            }
        });

        mRecyclerView.setAdapter(mAdapter);
    }
}

