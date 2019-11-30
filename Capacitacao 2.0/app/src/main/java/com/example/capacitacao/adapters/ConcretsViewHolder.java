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

    final ImageView image_concrets;


    public ConcretsViewHolder(@NonNull View itemView) {
        super(itemView);
        image_concrets = (ImageView) itemView.findViewById(R.id.image_concrets);
    }
}
