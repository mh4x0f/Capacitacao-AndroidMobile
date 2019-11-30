package com.example.capacitacao.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.capacitacao.R;
import com.example.capacitacao.models.Concrets;

import java.util.List;


public class ConcretsAdapter extends RecyclerView.Adapter {

    private List<Concrets> concerts;
    private Activity myActivity;
    private View itemView;

    public ConcretsAdapter(List<Concrets> concerts, Activity main_) {
        this.concerts = concerts;
        this.myActivity = main_;
    }



    public void updateConcretsAdapterItens(List<Concrets> results) {
        this.concerts = results;
        //Triggers the list update
        notifyDataSetChanged();
    }

    public List<Concrets> getConcerts() {
        return concerts;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(myActivity.getApplicationContext())
                .inflate(R.layout.item_rv_concrets_infor, parent, false);
        itemView = view;

        ConcretsViewHolder holder = new ConcretsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int position) {

        final ConcretsViewHolder holder = (ConcretsViewHolder) viewHolder;

        final Concrets con_item  = concerts.get(position) ;

        holder.tv_concrets_nome.setText(con_item.getName());
        holder.tv_concrets_url.setText(con_item.getImage_url());
        holder.tv_concrets_author.setText(con_item.getAuthor());


        RequestOptions options = new RequestOptions()
                .centerCrop()
                .circleCrop()
                .placeholder(R.drawable.avatar)
                .error(R.drawable.avatar)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH);

        Glide.with(itemView.getContext())
                .load(con_item.getImage_url())
                .apply(options)
                .into(holder.image_concrets);
    }

    @Override
    public int getItemCount() {
        return concerts.size();
    }
}