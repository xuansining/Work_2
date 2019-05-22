package com.example.work_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.work_2.Adapter.FragAdapter;
import com.example.work_2.Fragment.FirstFragment;
import com.example.work_2.Fragment.SecondFragment;
import com.example.work_2.Fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class PagePulsFragActivity extends FragmentActivity {
    //只有FragmentActivity才能内嵌fragment页面
  ViewPager viewPager;
  FragAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_puls_frag);
        List<Fragment> fragmentss=new ArrayList<Fragment>() ;
        fragmentss.add(new FirstFragment());
        fragmentss.add(new SecondFragment());
        fragmentss.add(new ThirdFragment());
        viewPager=(ViewPager)findViewById(R.id.vp);
        adapter=new FragAdapter(getSupportFragmentManager(),fragmentss);
        viewPager.setAdapter(adapter);


    }
}
