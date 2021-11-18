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

public class Turistico extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turistico);
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
        LatLng cusco = new LatLng(-13.5170887, -71.9785356);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(cusco).title("Bienvenido a Cusco").snippet
                ("Ciudad Imperial del Cusco, Cuna de los Incas y el Dios Sol"));

        LatLng sacsa = new LatLng(-13.5067266, -71.9802925);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(sacsa).title("Fortaleza de Sacsayhuaman").snippet
                ("Fortaleza ceremonial Inca(Lugar donde se sacia el Halcon)").icon(BitmapDescriptorFactory.fromResource(R.drawable.sacsa)));

        LatLng piqui = new LatLng(-13.6127123, -71.7171595);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(piqui).title("Piquillacta - La ciudad Pre-Inca").snippet
                ("Complejo arqueológico construido por la cultura Wari fue aproximadamente en el año 500 de nuestra era").icon(BitmapDescriptorFactory.fromResource(R.drawable.sacsa)));

        LatLng pitumarca = new LatLng(-13.9803842, -71.4173328);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(pitumarca).title("El valle rojo de pitumarca").snippet
                ("Las laderas y cumbres de este sitio están teñidas de rojo debido a un proceso de mineralización hace millones de año").icon(BitmapDescriptorFactory.fromResource(R.drawable.montana)));

        LatLng palcoyo = new LatLng(-14.0442471, -71.3172262);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(palcoyo).title("La Montaña de los 7 Colores de Palcoyo").snippet
                ("cumbre teñida de varios colores de forma muy parecida al Vinicunca, se puede apreciar un bosque de piedras formado de manera natural").icon(BitmapDescriptorFactory.fromResource(R.drawable.montana)));

        LatLng putucusi = new LatLng(-12.6171445, -72.4902046);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(putucusi).title("Montaña Putucusi").snippet
                (" Putucusi, pertenece a la cadena montañosa que rodea Machu Picchu. No existe ninguna construcción inca conocida pero desde su cima se logra apreciar la Maravilla del Mundo a la distancia.").icon(BitmapDescriptorFactory.fromResource(R.drawable.montanas)));

        LatLng huamantay = new LatLng(-13.3007411, -72.5800804);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(huamantay).title("Laguna Humantay").snippet
                ("aguna está rodeada de cumbres nevadas").icon(BitmapDescriptorFactory.fromResource(R.drawable.camping)));

        LatLng cocalmayo = new LatLng(-13.1311853, -72.5948321);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(cocalmayo).title("Aguas termales de Cocalmayo").snippet
                ("Sus aguas son claras y tienen propiedades curativas y relajantes. Muchos turistas llegan allí en su camino a Machu Picchu con el fin de relajarse").icon(BitmapDescriptorFactory.fromResource(R.drawable.aguacaliente)));

        LatLng lares = new LatLng(-13.1041821, -72.0442395);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(lares).title("Baños termo-medicinales de Lares").snippet
                ("famoso por ser una ruta obligada del ‘Lares Trek’, el cual conduce a Machu Picchu luego de 4 días de caminata").icon(BitmapDescriptorFactory.fromResource(R.drawable.aguacaliente)));

        LatLng huasao = new LatLng(-13.5699431, -71.8125254);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(huasao).title("Humedal de Huasao").snippet
                ("Los humedales de Huasao es un ambiente natural donde uno puede estar alejado de la ciudad y disfrutar de la naturaleza.").icon(BitmapDescriptorFactory.fromResource(R.drawable.aguacaliente)));

        LatLng puente = new LatLng(-12.6460037, -72.3059645);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(puente).title("El Puente Inca de Q’eswachaka").snippet
                ("Todas las segundas semanas de junio, los pobladores de las comunidades aledañas reconstruyen el puente tal como lo hacían sus antepasados incas hace cientos de años").icon(BitmapDescriptorFactory.fromResource(R.drawable.puentes)));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cusco, 7));

        float zoolevel = 16;
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        return false;
    }
}