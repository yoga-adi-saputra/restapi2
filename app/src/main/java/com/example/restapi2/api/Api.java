package com.example.restapi2.api;

import com.example.restapi2.model.MatchesList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    @GET("competitions/{comp_id}/matches")
    Call<MatchesList> getFinishedMatchesList(@Path("comp_id") String comp_id, @Query("status") String status, @Header("X-Auth-Token") String token);


}
