package com.example.logutil;

import android.util.Log;

class LogDebug {

    private static final String TAG = "MyApp";

    public void d(String message) {
        Log.d(TAG, message);
    }

    private void c(String message) {
        Log.d(TAG, message);
    }

    protected void p(String message) {
        Log.d(TAG, message);
    }
}
