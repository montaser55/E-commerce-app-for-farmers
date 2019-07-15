package com.example.faiza.retrofitapply;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class tabpagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray=new String[]{"Vegetables","Fruits","Crops"};
    public tabpagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
      switch(position)
      {
          case 0:
              fragment_vegetables vegetables=new fragment_vegetables();
              return  vegetables;
          case 1:
              fragment_fruits fruits=new fragment_fruits();
              return  fruits;
          case 2:
              fragment_crops crops=new fragment_crops();
              return crops;

      }
      return null;
    }

    @Override
    public int getCount() {
        return tabarray.length;
    }
}
