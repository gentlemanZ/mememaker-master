package com.teamtreehouse.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.teamtreehouse.mememaker.utils.StorageType;

public class MemeMakerApplicationSettings {
    SharedPreferences mSharedPreference;
    public MemeMakerApplicationSettings(Context context){
        mSharedPreference = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getStoragePreference(){
        return mSharedPreference.getString("Storage",StorageType.INTERNAL);
    }

    public void setSharedPreference(String storageType){
        mSharedPreference
                .edit()
                .putString("Storage",storageType)
                .apply();
    }
}
