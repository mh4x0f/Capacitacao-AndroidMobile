package com.ufrbbuild.mh4x0f.myapplication.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ufrbbuild.mh4x0f.myapplication.R;
import com.ufrbbuild.mh4x0f.myapplication.model.Books;

public class VisualizarActivity extends AppCompatActivity {
    private Toolbar myToolbar;
    private Gson myGsonDesconverter;
    private Books myBook;
    private TextView txt_nome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        myToolbar = findViewById(R.id.vsToolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(R.string.visualizar_tela);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myGsonDesconverter = new Gson();

        myBook = myGsonDesconverter.fromJson(getIntent().getStringExtra("BookItem"), Books.class);
        txt_nome = findViewById(R.id.txt_nomeVisualizar);
        txt_nome.setText(myBook.getNome());

    }
}
