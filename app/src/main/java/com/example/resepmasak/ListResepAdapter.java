package com.example.resepmasak;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resepmasak.R;
import com.example.resepmasak.ResepMasak;

import java.time.Instant;
import java.util.ArrayList;

public class ListResepAdapter extends RecyclerView.Adapter<ListResepAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<ResepMasak> listResep;

    private ArrayList<ResepMasak> getListResep() {

        return listResep;
    }

    public void setListResep(ArrayList<ResepMasak> listResep) {
        this.listResep = listResep;
    }

    public ListResepAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_masak, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListResep().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListResep().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}