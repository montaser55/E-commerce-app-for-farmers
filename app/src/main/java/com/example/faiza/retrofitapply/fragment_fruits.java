package com.example.faiza.retrofitapply;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_fruits extends Fragment {
    RecyclerView recyclerView;
    List<Product> productList;

    public fragment_fruits() {
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


        View view = inflater.inflate(R.layout.fragment_fragment_fruits, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        ProductAdapter adapter = new ProductAdapter(getActivity().getApplicationContext(), productList);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        recyclerView.setAdapter(adapter);


        return view;
    }

/*
    private void getProducts(){
        String urlString=Api.BASE_URL+"show_ad";
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                urlString,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);

                        try {
                            JSONArray jsonArray=new JSONArray(response);
                            for(int i=0;i<jsonArray.length();i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                productList.add(
                                        new Product(
                                                jsonObject.getString("adid"),
                                                jsonObject.getString("title"),
                                                Float.parseFloat(jsonObject.getString("unit_cost")),
                                                Float.parseFloat(jsonObject.getString("amount")),
                                                jsonObject.getString("description"),
                                                jsonObject.getString("sellerid"),
                                                jsonObject.getString("division"),
                                                jsonObject.getString("district"),
                                                jsonObject.getString("upazila"),
                                                jsonObject.getString("unionloc"),
                                                jsonObject.getString("available_date"),
                                                jsonObject.getString("expiry_date"),
                                                R.drawable.userpic));
                            }

                            ProductAdapter adapter = new ProductAdapter(showproduct.this, productList);



                            //setting adapter to recyclerview
                            recyclerView.setAdapter(adapter);

                            //Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                return params;
            }
        };


        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);


    }

    */

}
