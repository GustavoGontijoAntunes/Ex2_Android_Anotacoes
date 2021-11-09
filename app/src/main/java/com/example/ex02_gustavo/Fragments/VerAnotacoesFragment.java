package com.example.ex02_gustavo.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ex02_gustavo.R;

public class VerAnotacoesFragment extends Fragment {

    TextView txtAnotacoes;

    public VerAnotacoesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ver_anotacoes, container, false);
        txtAnotacoes = view.findViewById(R.id.txtAnotacoes);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("Dados", 0);
        String texto = sharedPreferences.getString("texto", "Nenhum texto salvo");
        txtAnotacoes.setText(texto);

        return view;
    }
}