package com.example.android.grz_task;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URI;
import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<MainView.SliderInfo> slider;
    ViewPagerAdapter(Context context,List<MainView.SliderInfo>sliderInfos){
        this.mContext=context;
        this.slider=sliderInfos;

    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater !=null;
        View view=layoutInflater.inflate(R.layout.viewpagerimage,container,false);
        ImageView image_product=view.findViewById(R.id.image_slider);
        String image_url=slider.get(position).getPhoto();
          if(image_url!=null&&!image_url.isEmpty()){
              Uri uri=Uri.parse(image_url);
              Picasso.get().load(uri).into(image_product);
          }else {
              image_product.setImageResource(R.drawable.viewpager);
          }
       container.addView(view);
        return view;
    }
    @Override
    public int getCount() {
        return slider.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view==obj;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      View view=(View)object;
      container.removeView(view);
    }
}
