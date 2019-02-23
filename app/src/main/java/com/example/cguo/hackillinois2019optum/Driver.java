package com.example.cguo.hackillinois2019optum;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.gson.Gson;

public class Driver {

    private Data data;
    private final String FILE_NAME = "OptumData.json";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Driver() {
        Gson gson = new Gson();
        data = gson.fromJson(FileContent.getFileContentsAsString(FILE_NAME), Data.class);
    }

    //calculate distance between patient and employee



}
