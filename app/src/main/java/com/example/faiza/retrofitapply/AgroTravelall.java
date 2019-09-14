package com.example.faiza.retrofitapply;

/*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class AgroTravelall extends AppCompatActivity {


    //a list to store all the agrotravels
    List<AgroTravel> agrotravelList;

    //the recyclerview
    RecyclerView recyclerView;

    //// egula tabLayout er jonno chilo
    ///dekhar drkr nai


    /*Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabChats;
    TabItem tabStatus;
    TabItem tabCalls;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agro_travelall);
        //PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());


        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the agrotravellist
        agrotravelList = new ArrayList<>();


        //adding some items to our list
        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Title of agro travel place",
                        "f  jshsdjkajh jksdsdhkfhca jsdhdjadjashsdekhane description likha thakbe r ki. djfdj djshffja hshdas ",
                        R.drawable.ic_menu_gallery));

        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Dell ",
                        "14 inch",
                        R.drawable.ic_menu_gallery));

        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Microsoft ",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.ic_menu_gallery));


        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.ic_menu_gallery));


        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.ic_menu_gallery));


        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.ic_menu_gallery));


        agrotravelList.add(
                new AgroTravel(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.ic_menu_gallery));

        //creating recyclerview adapter
        AgroTravelAdapter adapter = new AgroTravelAdapter(this, agrotravelList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
