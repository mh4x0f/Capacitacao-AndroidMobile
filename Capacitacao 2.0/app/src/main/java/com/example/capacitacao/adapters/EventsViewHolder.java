package com.example.capacitacao.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.capacitacao.R;

public class EventsViewHolder extends RecyclerView.ViewHolder{

    final TextView tv_events_nome;
    final TextView tv_events_data;
    final TextView tv_events_city;
    final CardView cardView_events;



    public EventsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_events_nome = (TextView) itemView.findViewById(R.id.tv_events_name);
        tv_events_data = (TextView) itemView.findViewById(R.id.tv_events_data);
        tv_events_city = (TextView) itemView.findViewById(R.id.tv_events_city);
        cardView_events = (CardView) itemView.findViewById(R.id.card_view_events);
    }
}
