package com.example.android.grz_task;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

public class HomeViewModelFactory implements ViewModelProvider.Factory {
    private Application application;

    public HomeViewModelFactory(Application mApplication) {
        this.application = mApplication;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
         if(modelClass==HomeViewModel.class){
             final T object = (T) new HomeViewModel(getRepository(), getUseCase());
             return object;
         }
        throw new IllegalArgumentException("");
    }

   private ApiServerGateway getApiService(){
        return ApiClient.getRetrofit().create(ApiServerGateway.class);
   }
   private MainViewUseCase getUseCase(){
        return new MainViewUseCase();
   }
 private HomeRepository getRepository(){
        return new HomeRepository(getApiService());
 }
}
