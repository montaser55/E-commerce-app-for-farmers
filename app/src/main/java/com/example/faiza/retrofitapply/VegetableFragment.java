package com.example.faiza.retrofitapply;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;


public class VegetableFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    List<Product> productList;
    public VegetableFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list


        productList.add(
                new Product(
                        "1",
                        "Microsoft ",
                        4,
                        4,
                        "jj",
                        "2",
                        "ddd",
                        "ddf",
                        "ddff",
                        "ddd",
                        "fdf",
                        "fdfd",
                        R.drawable.userpic));



        View view = inflater.inflate(R.layout.fragment_fruit, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        ProductAdapter adapter = new ProductAdapter(getActivity().getApplicationContext(), productList);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        recyclerView.setAdapter(adapter);


        return view;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_vegetables, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_vegetable) {
            Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT)
                    .show();
        }
        return true;    }


}
