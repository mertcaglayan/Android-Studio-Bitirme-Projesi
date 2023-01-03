package com.example.bootcamp.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.bootcamp.data.entity.Yemekler;

@Database(entities = {Yemekler.class},version = 1)
public abstract class Veritabani extends RoomDatabase {
    public abstract YemeklerDao getYemeklerDao();
}
