package com.deifm.radio.listeners;

public interface MediaRecorderStatusListener {
    void onMyRecorderStart();
    void onMyRecorderStop();
    void onMyRecorderError();
}
