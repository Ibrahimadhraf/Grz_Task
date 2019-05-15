package com.example.android.grz_task;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiServerGateway {
@GET("Productsizes/mainpage.json")
Observable<MainView> getMainViewData();

}
