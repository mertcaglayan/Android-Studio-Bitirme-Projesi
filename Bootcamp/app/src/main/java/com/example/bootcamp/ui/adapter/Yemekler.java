package com.example.bootcamp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcamp.databinding.CardTasarimBinding;
import com.example.bootcamp.ui.fragment.AnasayfaFragment;

import java.util.List;

public class Yemekler extends RecyclerView.Adapter<Yemekler.CardTasarimTutucu> {
    private Context mContext;
    private List<Yemekler> yemeklerListesi;

    public Yemekler(Context mContext, List<Yemekler> yemeklerListesi) {
        this.mContext = mContext;
        this.yemeklerListesi = yemeklerListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    //Card a tıklandıgında ne olacak
    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Yemekler yemek = yemeklerListesi.get(position);
        CardTasarimBinding t = holder.binding;
    }

    @Override
    public int getItemCount() {
        return yemeklerListesi.size();

    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;

        public CardTasarimTutucu (CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
