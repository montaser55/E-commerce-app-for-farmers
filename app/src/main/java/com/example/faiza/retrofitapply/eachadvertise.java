package com.example.faiza.retrofitapply;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

public class eachadvertise extends AppCompatActivity {

    Product product;
    private final String CANCELABLE_REQUEST_TAG = "volleyImageRequest";
    TextView titleTextview,unitcostTextview,amountTextview,descriptionTextview,availabledateTextview,expirydateTextview,divisionTextview,districtTextview;
    ImageView imgRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eachadvertise);

        titleTextview=findViewById(R.id.title);
        unitcostTextview=findViewById(R.id.unitcostvalue);
        amountTextview=findViewById(R.id.amountvalue);
        descriptionTextview=findViewById(R.id.description);
        availabledateTextview=findViewById(R.id.availabledatevalue);
        expirydateTextview=findViewById(R.id.expiryDatevalue);
        divisionTextview=findViewById(R.id.divisionvalue);
        districtTextview=findViewById(R.id.districtvalue);
        imgRes=findViewById(R.id.productimage);

        Intent i = getIntent();
        product = (Product) i.getSerializableExtra("productObject");

        titleTextview.setText(product.getTitle());
        unitcostTextview.setText(String.valueOf(product.getUnitcost()));
        amountTextview.setText(String.valueOf(product.getAmount()));
        descriptionTextview.setText(product.getDescription());
        availabledateTextview.setText(product.getAvailableDate());
        expirydateTextview.setText(product.getExpiryDate());
        divisionTextview.setText(product.getDivision());
        districtTextview.setText(product.getDistrict());
        //imgRes.setImageResource(R.drawable.userpic);
        String base=Api.BASE_IMAGEURL+"uploads/";
        String addidImage=product.getId();
        String url=base+addidImage+".jpg";
        System.out.println(url);

        ImageRequest imgRequest = new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imgRes.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        //imgRequest.setTag(CANCELABLE_REQUEST_TAG);
        RequestHandler.getInstance(eachadvertise.this).getRequestQueue().add(imgRequest);

       // imgRes.setImageResource(R.drawable.userpic);



    }
}
