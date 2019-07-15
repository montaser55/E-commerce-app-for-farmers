package com.example.faiza.retrofitapply;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class navigationtab extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationtab);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String name=SharedPrefManager.getInstance(getApplicationContext()).getUsername();
        String num=SharedPrefManager.getInstance(getApplicationContext()).getMobileno();

        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        ViewPager pager=(ViewPager) findViewById(R.id.viewPager);

        tabpagerAdapter Tabpageradapter=new tabpagerAdapter(getSupportFragmentManager());
        pager.setAdapter(Tabpageradapter);
        tabLayout.setupWithViewPager(pager);





        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerView=navigationView.getHeaderView(0);
      TextView username=(TextView)headerView.findViewById(R.id.usernametextview);
        TextView mobilenum=(TextView) headerView.findViewById(R.id.mobilenumtextview);

       username.setText(name);
        mobilenum.setText(num);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigationtab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.editprofile) {
            Intent intent=new Intent(this, passwordChange.class);
            startActivity(intent);
        } else if (id == R.id.phn) {
            Intent intent=new Intent(this, phnnumchange.class);
            startActivity(intent);

        } else if (id == R.id.location) {


        } else if (id == R.id.history) {

        } else if (id == R.id.settings) {

        } else if (id == R.id.help) {

        }else if (id == R.id.rating) {

        }else if (id == R.id.logout) {
            SharedPrefManager.getInstance(getApplicationContext()).logout();
            finish();
            startActivity(new Intent(this, MainActivity.class));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
