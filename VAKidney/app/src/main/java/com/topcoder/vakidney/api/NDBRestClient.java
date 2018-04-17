package com.topcoder.vakidney.api;

import com.topcoder.vakidney.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by afrisalyp on 16/03/2018.
 * This class implement rest client manager to access NDB API
 */

public class NDBRestClient {

    private static final String REST_API_URL = BuildConfig.NDB_BASE_URL;

    private static Retrofit sRetrofit;

    static {
        sRetrofit = new Retrofit.Builder()
                .baseUrl(REST_API_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
    }

    public static <T> T getService(Class<T> serviceClass) {
        return sRetrofit.create(serviceClass);
    }
}