package com.example.capacitacao.adapters;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capacitacao.R;

/**
 * Created by mh4x0f on 27/12/18.
 */



public class ConcretsViewHolder extends RecyclerView.ViewHolder {

    final TextView tv_concrets_nome;
    final TextView tv_concrets_url;
    final TextView tv_concrets_author;
    final ImageView image_concrets;


    public ConcretsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_concrets_nome = (TextView) itemView.findViewById(R.id.tv_concrets_name);
        tv_concrets_url = (TextView) itemView.findViewById(R.id.tv_concrets_url);
        tv_concrets_author = (TextView) itemView.findViewById(R.id.tv_concrets_author);
        image_concrets = (ImageView) itemView.findViewById(R.id.image_concrets);
    }
}
