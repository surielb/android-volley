package com.android.volley;

/**
 * Created by surielb on 06/03/2016.
 */
public interface ExtendedRequest<T> {
    void deliverResponse(Response<T> response);
}
