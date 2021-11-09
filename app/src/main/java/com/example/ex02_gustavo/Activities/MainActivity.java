package com.example.ex02_gustavo.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ex02_gustavo.Fragments.CriarAnotacoesFragment;
import com.example.ex02_gustavo.Fragments.VerAnotacoesFragment;
import com.example.ex02_gustavo.R;

public class MainActivity extends AppCompatActivity {

    CriarAnotacoesFragment criarAnotacoesFragment;
    VerAnotacoesFragment verAnotacoesFragment;
    Button btnAbaCriar, btnAbaVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbaCriar = findViewById(R.id.btnCriar);
        btnAbaVer = findViewById(R.id.btnVer);
        criarAnotacoesFragment = new CriarAnotacoesFragment();
        verAnotacoesFragment = new VerAnotacoesFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, criarAnotacoesFragment);
        transaction.commit();

        btnAbaCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, criarAnotacoesFragment);
                transaction.commit();
            }
        });

        btnAbaVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, verAnotacoesFragment);
                transaction.commit();
            }
        });
    }
}