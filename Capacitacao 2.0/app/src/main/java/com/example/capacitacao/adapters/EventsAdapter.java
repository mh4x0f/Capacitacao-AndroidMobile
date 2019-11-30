package com.example.capacitacao.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.capacitacao.R;
import com.example.capacitacao.models.Events;
import java.util.List;


public class EventsAdapter extends RecyclerView.Adapter {

    private List<Events> events_all;
    private Activity myActivity;

    public EventsAdapter(List<Events> concerts, Activity main_) {
        this.events_all = concerts;
        this.myActivity = main_;
    }



    public void updateEventsAdapterItens(List<Events> results) {
        this.events_all = results;
        //Triggers the list update
        notifyDataSetChanged();
    }

    public List<Events> getEvents() {
        return events_all;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myActivity.getApplicationContext())
                .inflate(R.layout.item_rv_events_infor, parent, false);

        EventsViewHolder holder = new EventsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int position) {

        final EventsViewHolder holder = (EventsViewHolder) viewHolder;

        final Events even_item  = events_all.get(position) ;

        holder.tv_events_nome.setText(even_item.getName());
        holder.tv_events_data.setText(even_item.getData());
        holder.tv_events_city.setText(even_item.getLocalization());


    }

    @Override
    public int getItemCount() {
        return events_all.size();
    }
}