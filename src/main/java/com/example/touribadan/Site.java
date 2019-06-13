package com.example.touribadan;

import android.location.Location;

public class Site {
    private  String mTouristSite;
    private String mWorkingHours;
    private String mLocation;
    //private int mAudio;

    public Site(String touristSite, String workingHours, String location){
        mTouristSite = touristSite;
        mWorkingHours = workingHours;
        mLocation = location;
       // mAudio = audio;
    }

    public String getTouristSite() {
        return mTouristSite;
    }
    public String getWorkingHours(){
        return mWorkingHours;
    }
    public String getLocation(){
        return mLocation;
    }
//    public  int getAudio(){
//        return mAudio;
//    }
}
