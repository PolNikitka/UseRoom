package com.example.useroom;

import android.app.Application;

import androidx.room.Room;

import com.example.useroom.database.MusicDatabase;

public class AppDelegate extends Application {

    private MusicDatabase mMusicDatabase;

    @Override
    public void onCreate() {
        super.onCreate();

        mMusicDatabase = Room.databaseBuilder(getApplicationContext(), MusicDatabase.class, "music_database")
                .allowMainThreadQueries()
                .build();
    }

    public MusicDatabase getMusicDatabase() {
        return mMusicDatabase;
    }
}
