package com.blogspot.yourfavoritekaisar.bantudonasi;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterLombok extends RecyclerView.Adapter<AdapterLombok.ViewHolder> {
    Context context;
    int[] GambarPulau;
    String[] namaPulau,DetailPulau;

    public AdapterLombok(Context context, int[] gambarPulau, String[] namaPulau, String[] detailPulau) {
        this.context = context;
        this.GambarPulau = gambarPulau;
        this.namaPulau = namaPulau;
        this.DetailPulau = detailPulau;
    }



    @NonNull
    @Override
    public AdapterLombok.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_krban, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterLombok.ViewHolder viewHolder, final int i) {
        viewHolder.mNamaPulau.setText(namaPulau[i]);
        Glide.with(context).load(GambarPulau[i]).into(viewHolder.logo);
        viewHolder.itemView.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent pindah = new Intent(context, DetailActivity.class);
            pindah.putExtra("np", namaPulau[i]);
            pindah.putExtra("dp", DetailPulau[i]);
            pindah.putExtra("gp", GambarPulau[i]);
            context.startActivity(pindah);

        }
    });
    }


    @Override
    public int getItemCount() {  return GambarPulau.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView mNamaPulau;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.imgList);
            mNamaPulau = itemView.findViewById(R.id.namalist);
        }
    }
}
