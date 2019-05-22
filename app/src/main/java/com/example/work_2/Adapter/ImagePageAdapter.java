package com.example.work_2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.work_2.Bean.ImageBean;
import com.example.work_2.R;

import java.util.ArrayList;

public class ImagePageAdapter extends PagerAdapter {
    Context mcontext;//声明一个上下文的对象

    LayoutInflater inflater;
    private String [] mTitle;
    private int []mdates;

//声明object的信息队列

public ImagePageAdapter(Context context,int []dates,String []mTitle){
      this.mcontext=context;
      this.mdates=dates;
      this.mTitle=mTitle;
      inflater=LayoutInflater.from(context);
      //



}

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
    View view=inflater.inflate(R.layout.page,null);
    ImageView imageView=view.findViewById(R.id.image_view);
    imageView.setImageResource(mdates[position]);
    container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return mdates.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle[position];
    }
}
