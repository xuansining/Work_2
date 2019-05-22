package com.example.work_2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.work_2.Adapter.ImagePageAdapter;
import com.example.work_2.Bean.ImageBean;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity  {

     ImagePageAdapter mAdapter;
     ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_pager);
        viewPager=(ViewPager)findViewById(R.id.vp_content);
        mAdapter=new ImagePageAdapter(this,ImageBean.arrayImage,ImageBean.arrayTitle);
        viewPager.setAdapter(mAdapter);




    }


}

