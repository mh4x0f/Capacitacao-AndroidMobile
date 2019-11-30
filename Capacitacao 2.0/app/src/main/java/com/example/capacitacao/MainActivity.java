package com.example.capacitacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.capacitacao.adapters.ConcretsAdapter;
import com.example.capacitacao.adapters.EventsAdapter;
import com.example.capacitacao.models.Concrets;
import com.example.capacitacao.models.Events;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EventsAdapter mEventsAdapter;
    private ConcretsAdapter mConcretsAdapter;

    private RecyclerView mRecyclerViewEvents;
    private RecyclerView mRecyclerViewConcrets;

    private LinearLayoutManager manager_events;
    private LinearLayoutManager manager_concrets;


    private SpaceNavigationView spaceNavigationView;


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerViewEvents = (RecyclerView) findViewById(R.id.rv_events);
        mRecyclerViewConcrets = (RecyclerView) findViewById(R.id.rv_concrets);


        mEventsAdapter = new EventsAdapter(getAllEvents(),this);
        mRecyclerViewEvents.setAdapter(mEventsAdapter);
        manager_events = new LinearLayoutManager(this);
        mRecyclerViewEvents.setLayoutManager(manager_events);
        manager_events.setOrientation(LinearLayout.HORIZONTAL);


        mConcretsAdapter = new ConcretsAdapter(getAllConcrets(),this);
        mRecyclerViewConcrets.setAdapter(mConcretsAdapter);
        manager_concrets = new LinearLayoutManager(this);
        mRecyclerViewConcrets.setLayoutManager(manager_concrets);
        manager_concrets.setOrientation(LinearLayout.HORIZONTAL);


        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space_navigation);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_account_balance_wallet_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_archive_black_24dp));
        spaceNavigationView.shouldShowFullBadgeText(true);
        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Log.d("onCentreButtonClick ", "onCentreButtonClick");
                spaceNavigationView.shouldShowFullBadgeText(true);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Log.d("onItemClick ", "" + itemIndex + " " + itemName);
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Log.d("onItemReselected ", "" + itemIndex + " " + itemName);
            }
        });


    }

    public List<Events> getAllEvents(){
        ArrayList<Events> models =  new ArrayList<Events>();
        models.add(new Events("Taylor Swift 1", "Wen 21, Agus", "Club Devil, 5th, Aveunce 287","#ffdd7c"));
        models.add(new Events("Taylor Swift 2", "Wen 22, Agus", "Club Devil, 6th, Aveunce 288", "#BAF0DF"));
        models.add(new Events("Taylor Swift 3", "Wen 23, Agus", "Club Devil, 7th, Aveunce 289", "#F78EB6"));
        return models;
    }


    public List<Concrets> getAllConcrets(){
        ArrayList<Concrets> models =  new ArrayList<Concrets>();
        models.add(new Concrets("https://picsum.photos/id/649/400/300?grayscale", "cap 1", "Recode Jr campacitacao 1"));
        models.add(new Concrets("https://picsum.photos/id/866/400/400", "cap 2", "Recode Jr campacitacao 2"));
        models.add(new Concrets("https://picsum.photos/400/300/?blur", "cap 3", "Recode Jr campacitacao 3"));
        return models;
    }


}
