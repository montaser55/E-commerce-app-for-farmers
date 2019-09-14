package com.example.faiza.retrofitapply;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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

public class ReviewAll extends AppCompatActivity {


    //a list to store all the reviews
    List<Review> reviewList;
    Product product;
    //the recyclerview
    RecyclerView recyclerView;
    String userid;
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
        setContentView(R.layout.activity_review_all);
        //PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        product = (Product) getIntent().getSerializableExtra("productObject");
        userid=SharedPrefManager.getInstance(getApplicationContext()).getUserID();
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the reviewlist
        reviewList = new ArrayList<>();



        //creating recyclerview adapter
       getReviews();
    }

    private void getReviews(){
        String urlString=Api.BASE_URL+"search_reviews";
        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                urlString,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);

                        try {
                            JSONArray jsonArray=new JSONArray(response);
                            for(int i=0;i<jsonArray.length();i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                reviewList.add(
                                        new Review(
                                                1,
                                                jsonObject.getString("name"),
                                                jsonObject.getString("review")));

                            }

                            ReviewAdapter adapter = new ReviewAdapter(ReviewAll.this, reviewList);

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
                params.put("adid",product.getId());


                return params;
            }
        };


        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);


    }
}
