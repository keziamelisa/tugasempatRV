package com.example.tugasempat;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class FilmPresenter {
    Context context;
    List<FilmModel> filmModels = new ArrayList<>();
    MainView view;
    public FilmPresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        FilmModel film;

        film = new FilmModel("Avengers: Infinity War", R.drawable.foto_avengers, "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.");
        filmModels.add(film);
        film = new FilmModel("Dilan 1991", R.drawable.foto_dilan, "DeskripsiDilan 1991 adalah sebuah film Indonesia tahun 2019 yang disutradarai oleh Fajar Bustomi dan Pidi Baiq. Film tersebut adalah sekuel dari Dilan 1990. Film tersebut pertama tayang pada 24 Februari 2019 dalam \"Hari Dilan\" di Bandung, sebelum resmi tayang di seluruh Indonesia empat hari kemudian.");
        filmModels.add(film);
        film = new FilmModel("Teman Tapi Menikah", R.drawable.foto_ttm, "Ditto suka setengah mati pada Ayu, artis yang bergaya preman. Sayangnya, selama 11 tahun bersahabat, Ditto selalu gagal keluar dari friend zone. Untungnya, kehidupan cinta Ayu yang berliku-liku, sering diselingkuhi sana-sini, memastikan Ditto selalu di dekatnya sebagai tempat curhat langganan. Sampai suatu hari, Ayu bercerita bahwa ia akan menikah dengan pacarnya, seorang pria sempurna luar dan dalam. Ditto harus memilih: menyatakan perasaan, atau merelakan cinta pertamanya jadi sahabat seumur hidup.");
        filmModels.add(film);
        film = new FilmModel("Maze Runner: The Death Cure", R.drawable.foto_deathcure, "Thomas leads some escaped Gladers on their final and most dangerous mission yet. To save their friends, they must break into the legendary Last City, a WCKD-controlled labyrinth that may turn out to be the deadliest maze of all. Anyone who makes it out alive will get answers to the questions that the Gladers have been asking since they arrived in the maze.");
        filmModels.add(film);
        film = new FilmModel("Insidious Chapter 2", R.drawable.foto_insidious, "Soon after their showdown with evil spirits that possessed their son, the Lamberts, Renai (Rose Byrne) and Josh (Patrick Wilson), are ready for their lives to return to normal. However, something still is seriously off, especially with Josh, who -- unbeknown to Renai -- is possessed too. In order to free Josh's soul and finally defeat the malevolent forces around them, Lorraine Lambert (Barbara Hershey) and her ghost-hunting friends investigate the past to save her family's future.");
        filmModels.add(film);
        film = new FilmModel("Justin Bieber: Never Say Never Movie", R.drawable.foto_jb, "A young singing sensation prepares to dazzle the crowd at a sold-out show at Madison Square Garden. Legions of adoring Bieber fans scream as he takes center stage for a memorable night of music. Concert footage mixes with home videos of Justin playing drums and showcasing his talent.");
        filmModels.add(film);
        film = new FilmModel("The Mortal Instruments: City Of Bones", R.drawable.foto_avengers, "In New York City, a seemingly ordinary teenager named Clary Fray (Lily Collins) learns that she is descended from a line of Shadowhunters -- half-angel warriors who protect humanity from evil forces. After her mother (Lena Headey) disappears, Clary joins forces with a group of Shadowhunters and enters Downworld, an alternate realm filled with demons, vampires and a host of other creatures. Clary and her companions must find and protect an ancient cup that holds the key to her mother's future.");
        filmModels.add(film);

        view.onSuccess(filmModels);

    }
}
