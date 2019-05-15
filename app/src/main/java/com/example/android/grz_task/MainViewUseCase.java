package com.example.android.grz_task;

import android.arch.lifecycle.MutableLiveData;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class MainViewUseCase {
    public void retrieveHomeFragmentData(CompositeDisposable mcompositeDisposable,
     MutableLiveData<HomeFragment_Lists> data,HomeRepository repository
             ,MutableLiveData<String>   errorMessage ){
        repository.getHomeFragmentData().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mainView ->
                        this.postValue(mainView,data),throwable -> postError(throwable,errorMessage));
    }
private void postValue(MainView mainViewData,MutableLiveData<HomeFragment_Lists>data){
HomeFragment_Lists homeFragment_lists=new HomeFragment_Lists();
homeFragment_lists.setSlisers(mainViewData.getSliders());
homeFragment_lists.setCategoryI(mainViewData.getCategory());
homeFragment_lists.setProductRate(mainViewData.getProductsbyrate());
data.postValue(homeFragment_lists);
}
private void postError(Throwable throwable, MutableLiveData<String>errorMessage){
  errorMessage.postValue(throwable.toString());
}
}
