package com.example.faiza.retrofitapply;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_vegetables extends Fragment {
    RecyclerView recyclerView;
    List<Product> productList;

    public fragment_vegetables() {
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
                       1));



        View view = inflater.inflate(R.layout.fragment_fragment_vegetables, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView1);

        ProductAdapter adapter = new ProductAdapter(getActivity().getApplicationContext(), productList);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        recyclerView.setAdapter(adapter);


        return view;
    }

}
