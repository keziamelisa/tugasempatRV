package com.example.tugasempat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView, recyclerView1, recyclerView2;
    FilmAdapter adapter;
    FilmPresenter presenter;
    List<FilmModel> filmModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FilmAdapter(this, filmModels);
        recyclerView.setAdapter(adapter);
        presenter = new FilmPresenter(this, this);
        presenter.setData();
        recyclerView1 = findViewById(R.id.recycler_view_H);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, true));
        adapter = new FilmAdapter(this, filmModels);
        recyclerView1.setAdapter(adapter);
        presenter = new FilmPresenter(this, this);
        presenter.setData();
        recyclerView2 = findViewById(R.id.recycler_view_G);
        recyclerView2.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new FilmAdapter(this, filmModels);
        recyclerView2.setAdapter(adapter);
        presenter = new FilmPresenter(this, this);
        presenter.setData();
    }

    @Override
    public void onSuccess(List<FilmModel> filmModels) {
        this.filmModels.clear();
        this.filmModels.addAll(filmModels);
        this.adapter.notifyDataSetChanged();
    }
}
