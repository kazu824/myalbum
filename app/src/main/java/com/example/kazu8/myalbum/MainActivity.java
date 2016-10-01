package com.example.kazu8.myalbum;

import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewpager = (ViewPager)findViewById(R.id.viewPager);
        final PagerTitleStrip pagerTitleStrip =(PagerTitleStrip)findViewById(R.id.pager_title_strip);

        int[] imageList = {R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3};

        final MyPagerAdapter pagerAdapter = new MyPagerAdapter(getFragmentManager(),imageList);
        viewpager.setAdapter(pagerAdapter);

        viewpager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                Random random = new Random();
                int n = random.nextInt(2);

                if(n == 0){
                    pagerTitleStrip.setTextColor(4);
                }
                if(n == 1){
                    pagerTitleStrip.setTextColor(8);
                }
                if(n == 2){
                    pagerTitleStrip.setTextColor(9);
                }
            }
        });


    }
}
