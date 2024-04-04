package com.example.tugasnavv.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tugasnavv.R;
import com.example.tugasnavv.bangun_datar.jajar_genjang;
import com.example.tugasnavv.bangun_datar.persegi_panjang;
import com.example.tugasnavv.bangun_datar.segitiga;
import com.example.tugasnavv.bangun_datar.trapesium;
import com.example.tugasnavv.bangun_datar.persegi;

public class datar extends Fragment {

    ImageView jajargenjang;
    ImageView persegi;
    ImageView persegi_panjang;
    ImageView segitiga;
    ImageView trapesium;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datar, container, false);

        jajargenjang = view.findViewById(R.id.jajargenjang);
        persegi = view.findViewById(R.id.persegi);
        persegi_panjang = view.findViewById(R.id.persegi_panjang);
        segitiga = view.findViewById(R.id.segitiga);
        trapesium = view.findViewById(R.id.trapesium);

        jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kejajargenjang = new Intent(getActivity(), jajar_genjang.class);
                startActivity(kejajargenjang);
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kepersegi = new Intent(getActivity(), persegi.class);
                startActivity(kepersegi);
            }
        });

        persegi_panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kepersegipanjang = new Intent(getActivity(), persegi_panjang.class);
                startActivity(kepersegipanjang);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kesegitiga = new Intent(getActivity(), segitiga.class);
                startActivity(kesegitiga);
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ketrapesium = new Intent(getActivity(), trapesium.class);
                startActivity(ketrapesium);
            }
        });

        return view;
    }
}

