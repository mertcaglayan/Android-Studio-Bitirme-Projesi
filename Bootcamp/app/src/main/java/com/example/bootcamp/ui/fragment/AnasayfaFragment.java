package com.example.bootcamp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcamp.R;
import com.example.bootcamp.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anasayfa, container, false);
    }
}