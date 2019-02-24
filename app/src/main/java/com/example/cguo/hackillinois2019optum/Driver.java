package com.example.cguo.hackillinois2019optum;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Driver {

    private Data data;
    private final String FILE_NAME = "OptumData.json";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Driver() {
        Gson gson = new Gson();
        data = gson.fromJson(FileContent.getFileContentsAsString(FILE_NAME), Data.class);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        Driver driver = new Driver();
        ModifiedData modifiedData = new ModifiedData();
        modifiedData.populateClusterMap(Arrays.asList(driver.data.getPatients()));
        for (Integer label : modifiedData.getClusters().keySet()) {
            System.out.println(label + ", " + modifiedData.getClusters().get(label));
        }

        System.out.println("\n");

        modifiedData.populateNursesMap(Arrays.asList(driver.data.getEmployees()));
        for (Integer label : modifiedData.getClusterNurses().keySet()) {
            System.out.println(label + ", " + modifiedData.getClusterNurses().get(label));
        }

        System.out.println();

    }



}
