package com.deifm.radio.listeners;

public interface PlayerListener {
    void onStartPlaying();
    void onPlayerPause();
    void onPlayerStop();
    void onPlayerError();
}
