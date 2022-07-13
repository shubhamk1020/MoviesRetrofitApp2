package com.mastercoding.moviesretrofitapp2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {

    //"https://run.mocky.io/v3/54430e81-83bc-45c9-837d-fa6756cee732"

    //"https://run.mocky.io/v3/5bd716f9-261c-485e-bcfa-1475b3b244fd"

    @GET("v3/54430e81-83bc-45c9-837d-fa6756cee732")
    Call<JSONResponse> getMovies();


}
