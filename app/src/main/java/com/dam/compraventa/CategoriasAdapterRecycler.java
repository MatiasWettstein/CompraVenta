package com.dam.compraventa;

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


        TextView catName;
        TextView catId;
        View v;

        public ViewHolder(View fila){
            super(fila);
            v = fila;

        }

        public TextView getCatName() {
            return catName;
        }

        public void setCatName(TextView catName) {
            this.catName = catName;
        }

        public TextView getCatId() {
            return catId;
        }

        public void setCatId(TextView catId) {
            this.catId = catId;
        }

        public View getV() {
            return v;
        }

        public void setV(View v) {
            this.v = v;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
