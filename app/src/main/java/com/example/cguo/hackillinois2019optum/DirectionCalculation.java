package com.example.cguo.hackillinois2019optum;

import com.google.android.gms.maps.model.LatLng;

public class DirectionCalculation {
    public static double calculationByDistance(LatLng StartP, LatLng EndP) {
        double theta = StartP.longitude - EndP.longitude;
        double mathSinLat = Math.sin(degreesToRadians(StartP.latitude)) * Math.sin(degreesToRadians(EndP.latitude));
        double mathCosLat = Math.cos(degreesToRadians(StartP.latitude)) * Math.cos(degreesToRadians(EndP.latitude));
        double cosDegToRad = Math.cos(degreesToRadians(theta));
        double total = mathSinLat + mathCosLat * cosDegToRad;
        total = Math.acos(total);
        total = radiansToDegree(total);
        total = total * 60 * 1.1515;
        total = total * 1.609344; //kilometers
        return total;
    }

    public static double degreesToRadians(double deg) {
        return (deg * Math.PI / 180.0);
    }

    public static double radiansToDegree(double rad) {
        return (rad * 180.0) / Math.PI;
    }

    public static double kmToMiles(double km) {
        return km/1.609;
    }
}