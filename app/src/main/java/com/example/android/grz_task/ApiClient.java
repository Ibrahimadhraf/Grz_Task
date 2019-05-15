package com.example.android.grz_task;

import android.support.annotation.NonNull;

import java.util.concurrent.TimeUnit;

import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "http://shopgate.codesroots.com/api/";
    private static final int TIMEOUT = 30;
    private static Retrofit retrofit = null;
    @NonNull
    private static OkHttpClient getOkHttpClient(){
        return new OkHttpClient()
                .newBuilder()
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT,TimeUnit.SECONDS)
                .build();
    }
    public static Retrofit getRetrofit()

    {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .build();

        }
        return retrofit;

    }

}
