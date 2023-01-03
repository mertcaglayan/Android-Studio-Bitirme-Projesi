package com.example.bootcamp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "yemekler")
public class Yemekler implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "yemek_id")
    @NonNull
    private int yemek_id;

    public Yemekler(int yemek_id, @NonNull String yemek_adi, @NonNull String yemek_resim_adi, int fiyat) {
        this.yemek_id = yemek_id;
        this.yemek_adi = yemek_adi;
        this.yemek_resim_adi = yemek_resim_adi;
        this.fiyat = fiyat;
    }

    @ColumnInfo(name = "yemek_adi")
    @NonNull
    private String yemek_adi;

    public int getYemek_id() {
        return yemek_id;
    }

    public void setYemek_id(int yemek_id) {
        this.yemek_id = yemek_id;
    }

    @NonNull
    public String getYemek_adi() {
        return yemek_adi;
    }

    public void setYemek_adi(@NonNull String yemek_adi) {
        this.yemek_adi = yemek_adi;
    }

    @NonNull
    public String getYemek_resim_adi() {
        return yemek_resim_adi;
    }

    public void setYemek_resim_adi(@NonNull String yemek_resim_adi) {
        this.yemek_resim_adi = yemek_resim_adi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @ColumnInfo(name = "yemek_resim_adi")
    @NonNull
    private String yemek_resim_adi;
    @ColumnInfo(name = "fiyat")
    @NonNull
    private int fiyat;

    public Yemekler() {
    }
}
