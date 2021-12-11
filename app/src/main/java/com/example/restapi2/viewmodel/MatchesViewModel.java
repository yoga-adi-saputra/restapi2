package com.example.restapi2.viewmodel;

import android.nfc.Tag;
import android.util.Log;
import android.util.LogPrinter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.restapi2.BuildConfig;
import com.example.restapi2.api.ApiClient;
import com.example.restapi2.model.MatchesList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MatchesViewModel extends ViewModel {

    MutableLiveData<MatchesList> matchesList;

    public MutableLiveData<MatchesList> getMatchesList() {
        if (matchesList == null) {
            matchesList = new MutableLiveData<>();
            setMatchesList();
        }
        return matchesList;
    }

    private void setMatchesList() {
        ApiClient.getInstance().getApi().getFinishedMatchesList("2001","FINISHED" , BuildConfig.APIToken)
        .enqueue(new Callback<MatchesList>() {
            @Override
            public void onResponse(Call<MatchesList> call, Response<MatchesList> response) {
                matchesList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<MatchesList> call, Throwable t) {

            }
        });


    }
}
