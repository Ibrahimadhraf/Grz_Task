package com.example.android.grz_task;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment_Lists {
    public HomeFragment_Lists() {
    }
    public List<MainView.SliderInfo>slisers=new ArrayList<>();
    public List<MainView.CategoryInfo>categoryI=new ArrayList<>();
    public List<MainView.ProductRateInfo>productRate=new ArrayList<>();

    public List<MainView.SliderInfo> getSlisers() {
        return slisers;
    }

    public void setSlisers(List<MainView.SliderInfo> slisers) {
        this.slisers = slisers;
    }

    public List<MainView.CategoryInfo> getCategoryI() {
        return categoryI;
    }

    public void setCategoryI(List<MainView.CategoryInfo> categoryI) {
        this.categoryI = categoryI;
    }

    public List<MainView.ProductRateInfo> getProductRate() {
        return productRate;
    }

    public void setProductRate(List<MainView.ProductRateInfo> productRate) {
        this.productRate = productRate;
    }
}
