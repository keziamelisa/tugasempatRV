package com.example.tugasempat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {
    Context context;
    List<FilmModel> filmModels = new ArrayList<>();

    public FilmAdapter(Context context, List<FilmModel> filmModels) {
        this.context = context;
        this.filmModels = filmModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvNamanya.setText(filmModels.get(i).getNamanya());
        viewHolder.imageView.setImageResource(filmModels.get(i).getGambarnya());
        viewHolder.overview.setText(filmModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, activity_detaill.class);
                intent.putExtra("name", filmModels.get(i).getNamanya());
                intent.putExtra("gambar", filmModels.get(i).getGambarnya());
                intent.putExtra("overview", filmModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, filmModels.get(i).getNamanya(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount()  {
        return filmModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamanya;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamanya = itemView.findViewById(R.id.tv_name);
            imageView = itemView.findViewById(R.id.iv_movie);
            overview = itemView.findViewById(R.id.tv_overview);
        }
    }
}

