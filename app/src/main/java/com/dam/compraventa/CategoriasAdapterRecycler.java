package com.dam.compraventa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.compraventa.model.Categoria;

import java.util.List;

public class CategoriasAdapterRecycler extends RecyclerView.Adapter<CategoriasAdapterRecycler.ViewHolder>{

    private static final String TAG = "SeriesAdapterRecycler";
    private List<Categoria> listCat;
    private Activity mActivity;
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView catName;
        View v;
        CardView card;

        public ViewHolder(View fila){
            super(fila);
            v = fila;
            card = fila.findViewById(R.id.card);
            catName = fila.findViewById(R.id.catName);
        }

        public TextView getCatName() {
            return catName;
        }

        public View getV() {
            return v;
        }

    }

    public CategoriasAdapterRecycler(List<Categoria> dataSet, Activity activity) {
        listCat = dataSet;
        mActivity = activity;
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
        Categoria cat = listCat.get(position);

        holder.catName.setText(cat.getName());
        holder.card.setBackgroundColor(Color.parseColor(cat.getColour()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent i1 = new Intent(context, MainActivity.class);
                i1.putExtra("CAT_ID", cat.getId());
                i1.putExtra("CAT_NAME", cat.getName());
                System.out.println("Extrass: " + i1.getExtras());
                mActivity.setResult(Activity.RESULT_OK, i1);
                mActivity.finish();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listCat.size();
    }

}
