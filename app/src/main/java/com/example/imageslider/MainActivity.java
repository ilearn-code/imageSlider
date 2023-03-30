package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.brochure,R.drawable.namecard};
    adapter mViewPagerAdapter;
    ViewPager mViewPager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
      mViewPager.setPadding(130, 0, 130, 0);
        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new adapter(MainActivity.this, images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

    }
}