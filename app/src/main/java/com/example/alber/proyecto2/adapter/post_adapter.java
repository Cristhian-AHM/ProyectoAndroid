package com.example.alber.proyecto2.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.alber.proyecto2.R;
import com.example.alber.proyecto2.model.Post;
import com.squareup.picasso.Picasso;

import java.util.List;


public class post_adapter extends RecyclerView.Adapter<post_adapter.PostViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Post item);
    }

    private List<Post> mDataset;
    private final OnItemClickListener listener;

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView tvUser;
        TextView tvHrs;
        TextView tvLikes;
        ImageView imgPost;

        PostViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.pictureC);
            tvUser = (TextView)itemView.findViewById(R.id.titulo);
            tvHrs = (TextView)itemView.findViewById(R.id.date);
            tvLikes = (TextView)itemView.findViewById(R.id.likeNumberCard);
            imgPost = (ImageView) itemView.findViewById(R.id.card_Image);
        }

        public void bind(final Post item, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

    }

    public post_adapter(List<Post> myDataset, OnItemClickListener listener) {
        mDataset = myDataset;
        this.listener = listener;
    }

    @Override
    public post_adapter.PostViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        PostViewHolder vh = new PostViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.tvUser.setText(mDataset.get(position).getUsuario());
        holder.tvHrs.setText(mDataset.get(position).getHrs()+" horas");
        holder.tvLikes.setText(mDataset.get(position).getLikes()+"");
        Picasso.get().load(mDataset.get(position).getPicture()).into(holder.imgPost);
        holder.bind(mDataset.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
