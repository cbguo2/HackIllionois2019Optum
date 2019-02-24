package com.example.cguo.hackillinois2019optum;

import com.google.gson.annotations.SerializedName;

public class Cluster {
    @SerializedName("LAT")
    private float latitude;
    @SerializedName("LON")
    private float longitude;
    @SerializedName("CLUSTER")
    private int cluster;

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getCluster() {
        return cluster;
    }



}
