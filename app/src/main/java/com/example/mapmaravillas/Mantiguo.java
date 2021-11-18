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

public class Mantiguo extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantiguo);
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
        LatLng peru = new LatLng(-6.8699697, -75.0458515);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(peru).title("Bienvenido a Peru").snippet
                ("Maravillas Antiguas"));

        LatLng giza = new LatLng(29.9870753, 31.2118063);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(giza).title("La gran pirámide de Giza").snippet
                ("Su altura original de 146,5 metros convirtió a la pirámide en la estructura más alta del mundo hecha por humanos hasta que la catedral de Lincoln la eclipsó en el siglo XIV.").icon(BitmapDescriptorFactory.fromResource(R.drawable.giza )));

        LatLng mausoleo = new LatLng(38.9597594, 34.9249653);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(mausoleo).title("Mausoleo de Halicarnaso").snippet
                ("Hecha de mármol blanco, la estructura monumental se asentaba sobre una colina que dominaba la capital que había construido.").icon(BitmapDescriptorFactory.fromResource(R.drawable.mausoleo)));

        LatLng zeus = new LatLng(38.9953683, 21.9877132);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(zeus).title("Estatua de Zeus").snippet
                ("El dios del trueno sostenía una estatua de Nike, la diosa de la victoria, en su mano derecha extendida y un cetro con un águila en la parte superior izquierda.").icon(BitmapDescriptorFactory.fromResource(R.drawable.zeus)));

        LatLng babilionia = new LatLng(40.5050458, 21.1582661);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(babilionia).title("Jardines Colgantes de Babilonia").snippet
                ("Una teoría es que el rey de Babilonia Nabucodonosor II hizo que se crearan los Jardines Colgantes, en el 600 a.C., para consolar a su nostálgica esposa, que extrañaba el verdor de su tierra natal de Median (lo que ahora es Irán).").icon(BitmapDescriptorFactory.fromResource(R.drawable.mausoleo)));

        LatLng alejandria = new LatLng(25.2540493, 27.2675469);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(alejandria).title("JEl Faro de Alejandría").snippet
                ("Se cree que el faro tenía una altura un poco menos de 140 metros, lo que lo convierte en la segunda estructura más alta hecha por humanos de la antigüedad después de la Gran Pirámide de Giza.").icon(BitmapDescriptorFactory.fromResource(R.drawable.mausoleo)));

        LatLng artemisa = new LatLng(35.9597594, 32.9249653);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(artemisa).title("Templo de Artemisa").snippet
                ("La Maravilla fue destruida repetidamente por una inundación del siglo VII a.C., un pirómano llamado Herostratus en 356 a.C. -que quería alcanzar la fama por cualquier medio- y una incursión de los godos germánicos orientales en el siglo III.").icon(BitmapDescriptorFactory.fromResource(R.drawable.artemisa)));

        LatLng coloso = new LatLng(32.9597594, 31.9249653);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(coloso).title("Coloso de Rodas").snippet
                ("La leyenda afirma que la gente de Rodas vendió las herramientas dejadas por su enemigo vencido para ayudar a pagar el Coloso, fundió las armas abandonadas para aprovechar el bronce y hierro en la edificación y usó una torre de asedio como andamio.").icon(BitmapDescriptorFactory.fromResource(R.drawable.escultura)));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(peru, 7));

        float zoolevel = 16;
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        return false;
    }
}