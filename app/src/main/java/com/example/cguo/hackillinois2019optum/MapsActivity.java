package com.example.cguo.hackillinois2019optum;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney,b Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng patientCluster1 = new LatLng(34.20287182, -118.5542218);
        mMap.addMarker(new MarkerOptions().position(patientCluster1).title("Cluster 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster1));

        LatLng patientCluster2 = new LatLng(34.00772143, -118.2667621);
        mMap.addMarker(new MarkerOptions().position(patientCluster2).title("Cluster 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster2));

        LatLng patientCluster3 = new LatLng(34.16187053, -118.4378463);
        mMap.addMarker(new MarkerOptions().position(patientCluster3).title("Cluster 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster3));

        LatLng patientCluster4 = new LatLng(33.80014556, -118.2850122);
        mMap.addMarker(new MarkerOptions().position(patientCluster4).title("Cluster 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster4));

        LatLng patientCluster5 = new LatLng(34.07718, -118.2430225);
        mMap.addMarker(new MarkerOptions().position(patientCluster5).title("Cluster 5"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster5));

        LatLng patientCluster6 = new LatLng(34.18217, -118.511026);
        mMap.addMarker(new MarkerOptions().position(patientCluster6).title("Cluster 6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster6));

        LatLng patientCluster7 = new LatLng(34.24486375, -118.4607625);
        mMap.addMarker(new MarkerOptions().position(patientCluster7).title("Cluster 7"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster7));

        LatLng patientCluster8 = new LatLng(34.06141, -118.3639725);
        mMap.addMarker(new MarkerOptions().position(patientCluster8).title("Cluster 8"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster8));

        LatLng patientCluster9 = new LatLng(34.00670571, -118.3271121);
        mMap.addMarker(new MarkerOptions().position(patientCluster9).title("Cluster 9"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster9));

        LatLng patientCluster10 = new LatLng(34.23159, -118.3551943);
        mMap.addMarker(new MarkerOptions().position(patientCluster10).title("Cluster 10"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(patientCluster10));

        LatLng Nurse1 = new LatLng(34.2905, -118.46202);
        mMap.addMarker(new MarkerOptions().position(Nurse1).title("Nurse 1")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse1));

        LatLng Nurse2 = new LatLng(34.04762, -118.46656);
        mMap.addMarker(new MarkerOptions().position(Nurse2).title("Nurse 2")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse2));

        LatLng Nurse3 = new LatLng(34.01756, -118.27057);
        mMap.addMarker(new MarkerOptions().position(Nurse3).title("Nurse 3")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse3));

        LatLng Nurse4 = new LatLng(34.19352, -118.58549);
        mMap.addMarker(new MarkerOptions().position(Nurse4).title("Nurse 4")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse4));

        LatLng Nurse5 = new LatLng(34.01288, -118.41775);
        mMap.addMarker(new MarkerOptions().position(Nurse5).title("Nurse 5")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse5));

        LatLng Nurse6 = new LatLng(34.14348, -118.42946);
        mMap.addMarker(new MarkerOptions().position(Nurse6).title("Nurse 6")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse6));

        LatLng Nurse7 = new LatLng(33.94404, -118.23353);
        mMap.addMarker(new MarkerOptions().position(Nurse7).title("Nurse 7")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse7));

        LatLng Nurse8 = new LatLng(34.20031, -118.64028);
        mMap.addMarker(new MarkerOptions().position(Nurse8).title("Nurse 8")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nurse8));
    }
}
