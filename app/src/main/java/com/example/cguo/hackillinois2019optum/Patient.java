package com.example.cguo.hackillinois2019optum;

import com.google.gson.annotations.SerializedName;

public class Patient {
    @SerializedName("LAT")
    private float latitude;

    @SerializedName("LON")
    private float longitude;

    @SerializedName("CLUSTER")
    private int cluster;

    @SerializedName("DAYS_TILL")
    private String daysTill;

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getCluster() {
        return cluster;
    }

    public int getDaysTill() {
        String formattedDaysTill[] = daysTill.trim().split(" ");
        return Integer.parseInt(formattedDaysTill[0]);
    }
}
