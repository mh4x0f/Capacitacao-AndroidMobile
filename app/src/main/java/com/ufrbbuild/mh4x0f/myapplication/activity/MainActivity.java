package com.ufrbbuild.mh4x0f.myapplication.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.ufrbbuild.mh4x0f.myapplication.R;
import com.ufrbbuild.mh4x0f.myapplication.adapters.TesteAdapter;
import com.ufrbbuild.mh4x0f.myapplication.model.Books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ListView mlvBooks;
    private List<Books> books;
    private Button myButtonAtualizar;
    private TesteAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.vsToolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(R.string.appTitle);

        books = getallbooks();

        mlvBooks = findViewById(R.id.lv_books);
        myButtonAtualizar = findViewById(R.id.btn_adicionar);

        myAdapter = new TesteAdapter(books, this);
        mlvBooks.setAdapter(myAdapter);
    }

    private List<Books> getallbooks() {

        books = new ArrayList<> (Arrays.asList(
                new Books("Capacitação android 1", "01/10/2018", "Marcos Bomfim"),
        new Books("Capacitação android 2", "01/10/2018", "Marcos Bomfim"),
        new Books("Capacitação android 3", "01/10/2018", "Marcos Bomfim") ));
        return books;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.main_menu_sair){
            Toast.makeText(getApplicationContext(), "clicked -> menu sair", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    public void addNewBookOnListView(View view) {
        Books bookexemple = new Books("Capacitação android 4", "01/10/2018","desconhecido");
        books.add(bookexemple);
        Toast.makeText(getApplicationContext(), "Livro adicionado com sucesso!",Toast.LENGTH_SHORT).show();
        myAdapter.updateBooks(books);
    }
}
