package com.example.android.grz_task;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.android.grz_task.publicUseCase.makesnakeBar;

public class HomeFragment extends Fragment {
    private HomeViewModel mviewModel;
   ViewPager viewPager;
    RecyclerView sliderRecyclerView;
    RecyclerView productRecyclerView;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.homefragment, container, false);
        findViewFromXMl(view);
       mviewModel= ViewModelProviders.of(this,getViewmodelFactory()).get(HomeViewModel.class);
       mviewModel.mainViewMutableLiveData.observe(this,this::putDatainView);
       mviewModel.errorMessages.observe(this,message->
                       makesnakeBar(view,message)
               );

        return view;
    }

    private HomeViewModelFactory getViewmodelFactory(){
       return new HomeViewModelFactory(this.getActivity().getApplication());
    }

    private void putDatainView(HomeFragment_Lists mianData){
        setupviewPager(viewPager);
        swipViewPager();
        viewPager.setAdapter(new ViewPagerAdapter(getContext(),mianData.getSlisers()));
        sliderRecyclerView.setAdapter(new CategoryRecyclerViewAdapter(getContext(),mianData.getCategoryI()));
        sliderRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        productRecyclerView.setAdapter(new ProducutViewRecyclerViewAdapter(getContext(),mianData.getProductRate()));
        productRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

    }

    private  void setupviewPager(ViewPager viewPager) {
        viewPager.setPageTransformer(true, (view, position) ->{
            view.setTranslationX(-position * view.getWidth());
            if (Math.abs(position) < 0.5) {
                view.setVisibility(View.VISIBLE);
                view.setScaleX(1 - Math.abs(position));
                view.setScaleY(1 - Math.abs(position));
            } else if (Math.abs(position) > 0.5) {
                view.setVisibility(View.GONE);
            }
        });

        }


    private void swipViewPager(){
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };

        Timer swipTimer = new Timer();
       swipTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(Update);
            }
        }, 500, 3000);
    }
    private void findViewFromXMl(View view){
        viewPager=view.findViewById(R.id.viewPager);
        sliderRecyclerView=view.findViewById(R.id.recyclerView);
        productRecyclerView=view.findViewById(R.id.product_recyclerView);
    }

}
