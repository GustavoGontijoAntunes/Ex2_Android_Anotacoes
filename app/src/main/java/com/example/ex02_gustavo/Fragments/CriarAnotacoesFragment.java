package com.example.ex02_gustavo.Fragments;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ex02_gustavo.R;

public class CriarAnotacoesFragment extends Fragment {

    Button btnSalvar;
    EditText editAnotacoes;

    public CriarAnotacoesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_criar_anotacoes, container, false);
        btnSalvar = view.findViewById(R.id.btnSalvar);
        editAnotacoes = view.findViewById(R.id.editAnotacoes);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("Dados", 0);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(!editAnotacoes.getText().toString().equals("")){
                    editor.putString("texto", editAnotacoes.getText().toString());
                    editor.commit();
                    editAnotacoes.getText().clear();
                    Toast.makeText(getContext(), "Dados salvos com sucesso!", Toast.LENGTH_LONG). show();
                } else{
                    Toast.makeText(getContext(), "Preencha o campo anotações", Toast.LENGTH_LONG). show();
                }
            }
        });

        return view;
    }
}