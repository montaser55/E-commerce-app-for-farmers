package com.example.faiza.retrofitapply;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class Home extends AppCompatActivity {
Button addproduct,home,showproduct,searchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        addproduct=findViewById(R.id.addproductbutton);
        home=findViewById(R.id.homebutton);
        showproduct=findViewById(R.id.showproductbutton);
        searchbutton=findViewById(R.id.searchbutton);

        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddProductActivity();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserActivity();
            }
        });
        showproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShowProductActivity();
            }
        });
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensearchActivity();            }
        });

    }

    public void opensearchActivity(){

        Intent intent=new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void openAddProductActivity(){

        Intent intent=new Intent(this, addproduct.class);
        startActivity(intent);
    }


    public void openUserActivity(){

        Intent intent=new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    public void openShowProductActivity(){

        Intent intent=new Intent(this, showproduct.class);
        startActivity(intent);
    }
}
