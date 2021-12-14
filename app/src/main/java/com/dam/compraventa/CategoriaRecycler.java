package com.dam.compraventa;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.compraventa.model.Categoria;

public class CategoriaRecycler extends AppCompatActivity {


    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }

    protected LayoutManagerType mCurrentLayoutManagerType;


    protected RecyclerView mRecyclerView;
    protected CategoriasAdapterRecycler mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_categoria_recycler);

        mRecyclerView = findViewById(R.id.listaRecycler);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CategoriasAdapterRecycler(Categoria.ejemplos(), CategoriaRecycler.this);
        mRecyclerView.setAdapter(mAdapter);

    }

}
