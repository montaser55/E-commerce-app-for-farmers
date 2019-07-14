package com.example.faiza.retrofitapply;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class UserActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;
    Toolbar toolbar2;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem tabChats;
    TabItem tabStatus;
    TabItem tabCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        toolbar2 = findViewById(R.id.toolbar2);
        toolbar2.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar2);

        tabLayout = findViewById(R.id.tablayout);
        tabChats = findViewById(R.id.tabChats);
        tabStatus = findViewById(R.id.tabCalls);
        tabCalls = findViewById(R.id.tabStatus);
        viewPager = findViewById(R.id.viewPager);
/*
        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 1) {


                    toolbar2.setBackgroundColor(ContextCompat.getColor(UserActivity.this,
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(UserActivity.this,
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(UserActivity.this,
                                R.color.colorPrimaryDark));
                    }


                } else if (tab.getPosition() == 2) {
                    //toolbar2.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                    //      android.R.color.colorPrimary));
                    //tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                    //      android.R.color.colorPrimary));
                    //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    //  getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                    //        android.R.color.colorPrimaryDark));
                }
                else {
                    toolbar2.setBackgroundColor(ContextCompat.getColor(UserActivity.this,
                            R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(UserActivity.this,
                            R.color.colorPrimary));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(UserActivity.this,
                                R.color.colorPrimaryDark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

*/




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation2);
        bottomNavigationView.setOnNavigationItemReselectedListener(navListener);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_open_drawer, R.string.navigation_close_drawer);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


    }

    private BottomNavigationView.OnNavigationItemReselectedListener navListener=
            new BottomNavigationView.OnNavigationItemReselectedListener() {
                @Override
                public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            //////////////////////////// ekhane home er activity call hbe

                            System.out.println("home");
                            break;


                        case R.id.nav_notification:

                            Intent intent_notification = new Intent(UserActivity.this,Notification.class);
                            startActivity(intent_notification);

                            break;
                        case R.id.nav_search:

                            Intent i_search = new Intent(UserActivity.this,search2.class);
                            startActivity(i_search);

                            break;
                    }
                    // drawer.closeDrawer(GravityCompat.START);


                    //return true;
                }
            };



    /*@Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();
        //drawer.closeDrawers();

        if (id == R.id.editprofile) {
            // Handle the home action
            menuItem.setChecked(true);

            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
        }
      *//*  else if (id == R.id.nav_the_wetlands) {
            Toast.makeText(this, "The Wetlands", Toast.LENGTH_SHORT).show();
            TheWetlandsFragment theWetlandsFragment = new TheWetlandsFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.relativelayout_for_fragment, theWetlandsFragment, theWetlandsFragment.getTag()).commit();
        } else if (id == R.id.nav_the_mistbelt_forests) {
            Toast.makeText(this, "The Mistbelt Forests", Toast.LENGTH_SHORT).show();
        }*//*

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
*/




//    private void setupDrawerContent(NavigationView navigationView) {
//        navigationView.setNavigationItemSelectedListener(
//                new NavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//                        switch (menuItem.getItemId()){
//
//                           case R.id.editprofile:
//
//                                System.out.println("edit profile");
//                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container,
//                                        new EditProfile()).commit();
//
//
//                                break;
//
//                        }
//
//                        drawer.closeDrawers();
//                        return true;
//                    }
//                });
//    }

    @Override
    public void onBackPressed() {

        if(drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
            super.onBackPressed();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
