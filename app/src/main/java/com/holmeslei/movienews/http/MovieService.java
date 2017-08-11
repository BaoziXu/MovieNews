package com.holmeslei.movienews.http;

import com.holmeslei.movienews.mvp.model.entity.ShowingMovies;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Description:
 * author         xulei
 * Date           2017/8/8
 */

public interface MovieService {
    //正在上映
    @GET("v2/movie/{param1}")
    Observable<ShowingMovies> getMoviesNewsByParam(@Path("param1") String param1, @Query("city") String city);
}
