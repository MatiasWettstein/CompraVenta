package com.dam.compraventa;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.compraventa.model.Categoria;

import java.util.List;

public class CategoriasAdapterRecycler extends RecyclerView.Adapter<CategoriasAdapterRecycler.ViewHolder>{

    private static final String TAG = "SeriesAdapterRecycler";
    private List<Categoria> listCat;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView catColour;
        TextView catName;
        TextView catId;
        View v;

        public ViewHolder(View fila){
            super(fila);
            v = fila;
            catColour = fila.findViewById(R.id.rowTitulo);
            catName = fila.findViewById(R.id.rowTitulo);



        }

        public TextView getCatName() {
            return catName;
        }

        public TextView getCatId() {
            return catId;
        }

        public View getV() {
            return v;
        }

        public TextView getCatColour() {
            return catColour;
        }


    }


    public CategoriasAdapterRecycler(List<Categoria> dataSet) {
        listCat = dataSet;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fila_cat, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "Element " + position + " set.");

        Categoria cat = listCat.get(position);
        if(position%2==0){
            holder.getV().setBackgroundColor(Color.parseColor("#FFC0F3ED"));
        }

        holder.catName.setText(cat.getName());
        holder.catColour.setText(cat.getId());
        holder.catId.setText(position);



    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
