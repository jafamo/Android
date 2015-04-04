package com.example;

public class GeoPunto {

    private double longitud,latitud;
    final double RADIO_TIERRA = 6371000; // en metros




    /**
     *   Constructor con dos parametros
     *@param longitud
     *@param latitud
     */

    public GeoPunto(double longitud,double latitud){
        this.longitud = longitud;
        this.latitud = latitud;

    }

    /**
     *   Get and Set attributes
     */
    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Metodo que retorna la informacion de un punto.
     * @return string
     */
    public String toString(){
        return "Longitud: "+this.longitud+"\nLatitud: "+this.latitud;
    }


    /**
     *Aproximar la distancia en metros entre dos coordenadas.
     * Podemos utilizar el algoritmo Haversine
     *
     * @param punto
     * @return double
     */
    public double distancia(GeoPunto punto){


        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +Math.sin(dLon/2) * Math.sin(dLon/2) *Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}
