package com.mastercoding.moviesretrofitapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder>{

    private Context mContext;
    private List<Movie> movieList;

    //constructor

    public Adaptery(Context mContext, List<Movie> movieList) {
        this.mContext = mContext;
        this.movieList = movieList;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v = layoutInflater.inflate(R.layout.movie_item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText(movieList.get(position).getName());

        // The Trick: Getting data from the nested json object
        holder.duration.setText(movieList.get(position).getMoreDetails().getDuration());

        holder.release.setText(movieList.get(position).getMoreDetails().getRelease());
        holder.category.setText(movieList.get(position).getMoreDetails().getCategory());

        // Addling Glide Library

        Glide.with(mContext)
                .load(movieList.get(position).getPoster())
                .into(holder.img);

        // Setting the rating bar value
        holder.ratingBar.setRating((float)(movieList.get(position).getRating())/2);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView duration;
        ImageView img;
        RatingBar ratingBar;
        TextView category;
        TextView release;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);
            duration = itemView.findViewById(R.id.textView2);
            img = itemView.findViewById(R.id.imageView);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            category = itemView.findViewById(R.id.textView3);
            release = itemView.findViewById(R.id.textView4);

        }
    }
}
