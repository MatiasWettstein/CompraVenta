package com.dam.compraventa;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import static androidx.recyclerview.widget.RecyclerView.*;

public class CategoryViewHolder extends ViewHolder {
    CardView card;
    TextView titulo;
    ProgressBar pbRating;
    ImageView imgGenero;
    ImageView imgFav;
    Button btnSerie;
    RatingBar rbCalificacion;

    public CategoryViewHolder(View v){
        super(v);
        card = v.findViewById(R.id.cardSerie);
        titulo = v.findViewById(R.id.rowTitulo);
        pbRating = v.findViewById(R.id.rowRating);
        imgGenero = v.findViewById(R.id.rowImgGenero);
        btnSerie = v.findViewById(R.id.rowBtnElegir);
        rbCalificacion = v.findViewById(R.id.rowCalificacion);
        imgFav = v.findViewById(R.id.rowBtnFavorito);
    }
}
