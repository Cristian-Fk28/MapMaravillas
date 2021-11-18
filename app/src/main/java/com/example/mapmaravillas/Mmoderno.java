package com.example.mapmaravillas;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mmoderno extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmoderno);
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if (status == ConnectionResult.SUCCESS) {

            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //habilitar mapas
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng peru = new LatLng(-13.5170887, -71.9785356);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(peru).title("Bienvenido a Peru").snippet
                ("Cuna de una maravilla mundial"));



        LatLng chiche = new LatLng(20.6845957, -88.8755669);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(chiche).title("Chichén Itzá").snippet
                ("Esta antigua ciudad maya es uno de los centros arqueológicos más importantes de la península de Yucantán").icon(BitmapDescriptorFactory.fromResource(R.drawable.chiche )));

        LatLng roma = new LatLng(41.8933203, 12.4829321);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(roma).title("El Coliseo de Roma").snippet
                ("Este anfiteatro es uno de los tesoros que el Imperio romano ha dejado como herencia a la Ciudad Eterna. También fue el más grande jamás construido. Su nombre original era anfiteatro Flavio").icon(BitmapDescriptorFactory.fromResource(R.drawable.roma )));


        LatLng cristo = new LatLng(-22.9110137, -43.2093727);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(cristo).title("La estatua Cristo Redentor").snippet
                ("El Cristo Redentor es una de las estatuas más famosas del mundo, y también una de las más grandes. Con sus 30 metros de altitud, Jesús de Nazaret acoge con los brazos abiertos la ciudad brasileña de Río de Janeiro, en Brasil").icon(BitmapDescriptorFactory.fromResource(R.drawable.crist )));

        LatLng muralla = new LatLng(35.000074, 104.999927);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(muralla).title("La gran muralla").snippet
                ("Es la obra arquitectónica más importante de China, una antigua fortaleza que a los chinos les sirvió como defensa ante los posibles ataques mongoles.").icon(BitmapDescriptorFactory.fromResource(R.drawable.murallac )));

        LatLng machu = new LatLng(-13.1644186, -72.544764);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(machu).title("Machu Picchu").snippet
                ("Una de las joyas andinas mejor conservadas del imperio inca. Data del siglo XV y se cree que sirvió como antiguo santuario y como residencia del soberano del imperio").icon(BitmapDescriptorFactory.fromResource(R.drawable.sacsa )));


        LatLng petra = new LatLng(30.3273975, 35.4464006);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(petra).title("Petra").snippet
                ("La capital del antiguo reino nabateo está esculpida sobre la roca. Es uno de los enclaves arqueológicos más importantes de Jordania, y uno de los más visitados del país. Fue fundada en el siglo VIII a.C y era una de las localidades de paso de la popular Ruta de la Seda").icon(BitmapDescriptorFactory.fromResource(R.drawable.petra )));

        LatLng taj = new LatLng(27.1750123, 78.0420968);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(taj).title("El Taj Mahal").snippet
                ("uno de los edificios más románticos del mundo,  Arjumand Bano Begum, más conocida como Mumtaz Mahal. Ella perdió la vida en su decimocuarto parto y se dice que, el emperador estaba tan enamorado, que ordenó construir el mausoleo más bello y grandioso en su honor").icon(BitmapDescriptorFactory.fromResource(R.drawable.tajmahal )));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(peru, 7));

        float zoolevel = 16;
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        return false;
    }
}