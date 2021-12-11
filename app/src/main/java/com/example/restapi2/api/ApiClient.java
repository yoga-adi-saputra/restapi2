package com.example.restapi2.api;


import com.example.restapi2.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static ApiClient mInstannce;
    private final Retrofit retrofit;

    private ApiClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BaseURL).addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiClient getInstance(){
        if(mInstannce==null){
            mInstannce=new ApiClient();
        }
        return mInstannce;
    }

    public Api getApi(){
        return retrofit.create(Api.class);
    }
}
