package com.example.android.grz_task;

import io.reactivex.Observable;

public class HomeRepository {
   private ApiServerGateway mServerGateway;

    public HomeRepository(ApiServerGateway serverGateway) {
        this.mServerGateway = serverGateway;
    }
   public Observable<MainView> getHomeFragmentData(){
        return mServerGateway.getMainViewData();
   }
}
