package com.ufrbbuild.mh4x0f.myapplication.adapters;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.ufrbbuild.mh4x0f.myapplication.R;
import com.ufrbbuild.mh4x0f.myapplication.activity.VisualizarActivity;
import com.ufrbbuild.mh4x0f.myapplication.model.Books;

import java.util.List;

/**
 * Created by mh4x0f on 26/11/18.
 */

public class TesteAdapter extends BaseAdapter {
    private List<Books> books;
    private Activity main_act;
    private TextView nome;
    private TextView autor;
    private TextView data;
    private Button btn_visualizar;
    private Gson myGsonConverter;

    public TesteAdapter(List<Books> book, Activity act){
        this.books = book;
        myGsonConverter = new Gson();
        this.main_act = act;

    }

    @Override
    public int getCount() {
        return this.books.size();
    }

    @Override
    public Books getItem(int i) {

        return books.get(i);
    }

    public void updateBooks(List<Books> book){
        this.books = book;
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view_layout = main_act.getLayoutInflater().inflate(R.layout.listview_layout,viewGroup, false);
        final Books book = getItem(i);
        Log.d("TESTE", "getView () -> " + book.getNome());
        nome = view_layout.findViewById(R.id.txt_nome);
        autor = view_layout.findViewById(R.id.txt_autor);
        data = view_layout.findViewById(R.id.txt_data);

        btn_visualizar = view_layout.findViewById(R.id.btn_visualizar);

        btn_visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVisualizar = new Intent(main_act, VisualizarActivity.class);
                String strBook = myGsonConverter.toJson(book);
                Log.d("TESTE",strBook);
                Log.d("TESTE", "btn_openactiviy () -> " + book.getNome());
                intentVisualizar.putExtra("BookItem",strBook);
                main_act.startActivity(intentVisualizar);
            }
        });

        nome.setText(book.getNome());
        autor.setText(book.getAutor());
        data.setText(book.getData());
        return view_layout;
    }
}
