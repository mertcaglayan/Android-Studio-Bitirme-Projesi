package com.example.bootcamp.room;

import androidx.room.Query;

import com.example.bootcamp.ui.adapter.Yemekler;

import java.util.List;

import io.reactivex.Single;

public interface YemeklerDao {
    @Query("SELECT * FROM yemekler")
    Single<List<Yemekler>> yemekleriYukle();
}
