package com.example.bootcamp.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.bootcamp.room.YemeklerDao;
import com.example.bootcamp.ui.adapter.Yemekler;

import java.util.List;

public class YemeklerDaoRepository {
    private MutableLiveData<List<Yemekler>> yemeklerListesi;
    private YemeklerDao ydao;


    public YemeklerDaoRepository(YemeklerDao ydao) {
        this.ydao = ydao;
        yemeklerListesi = new MutableLiveData();
    }

    public MutableLiveData<List<Yemekler>> getYemeklerListesi() {
        return yemeklerListesi;
    }

}

