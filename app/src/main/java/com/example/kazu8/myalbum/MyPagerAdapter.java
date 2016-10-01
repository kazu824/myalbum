package com.example.kazu8.myalbum;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class MyPagerAdapter extends android.support.v13.app.FragmentPagerAdapter {

    private int[] mImageList;

    public MyPagerAdapter(FragmentManager fm, int[] imageList){
        super(fm);
        mImageList = imageList;
    }

    @Override
    public Fragment getItem(int position){
        PictureFragment fragment = new PictureFragment();
        Bundle args = new Bundle();
        args.putInt("image_id", mImageList[position]);
        fragment.setArguments(args);
        return  fragment;
    }

    @Override
    public int getCount(){
        return mImageList.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "test";
            case 1:
                return "test2";
            case 2:
                return "test3";
        }
        return null;
    }


}
