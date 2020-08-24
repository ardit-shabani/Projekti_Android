package com.pt.projekti_trete.network;

import com.pt.projekti_trete.model.News;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://api.myjson.com/";

    @GET("bins/r4sjq/")
    Call<ArrayList<News>> getNews();


}