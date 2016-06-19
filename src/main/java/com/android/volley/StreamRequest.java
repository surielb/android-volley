package com.android.volley;

import java.io.OutputStream;

/**
 * Created by surielb on 19/06/2016.
 */
public interface StreamRequest {
    void writeOutput(OutputStream stream);
}
