package com.firebasetesting;

import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_header);

        ((ViewPager.LayoutParams) pagerTabStrip.getLayoutParams()).isDecor = true;
    }
}
