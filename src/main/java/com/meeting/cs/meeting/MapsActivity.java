package com.meeting.cs.meeting;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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


    @Override
    public void onMapReady(GoogleMap googleMap) {
        prueba(googleMap);
    }


    public void prueba(GoogleMap map) {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        LatLng poss1 = new LatLng(-16.4044345, -71.5270685);
        map.setMyLocationEnabled(true);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        map.addMarker(new MarkerOptions().position(poss1).title("poss1"));
        //map.moveCamera(CameraUpdateFactory.newLatLngZoom(poss1, 16));
        //en c++ entra  varias posiciones y sale una una coordenas ((lat,long),x ) donde se pueda ver a todos dentro de mapa

        LatLng poss2 = new LatLng(-16.4049345,-71.5280685);
        map.addMarker(new MarkerOptions().position(poss2).title("poss2"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(poss2, 14));
        //%%%%%%%%%%%%%%%%%%
        //##################
        //ESto es una prueba del GIT
        //%%%%%%%%%%%%%%%%%%
        //##################
        //ESto es una prueba del GIT
        //%%%%%%%%%%%%%%%%%%
        //##################
        //ESto es una prueba del GIT
    }






}



