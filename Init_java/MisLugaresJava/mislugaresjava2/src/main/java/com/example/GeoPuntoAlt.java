package com.example;

/**
 * Created by jafamo on 05/04/15.
 */
public class GeoPuntoAlt extends GeoPunto {

    private double altura;

    public GeoPuntoAlt(double longitud,double latitud){
        super(longitud,latitud);
        altura = 0;
    }
    public GeoPuntoAlt(double altura){
        this.altura = altura;
    }
    public GeoPuntoAlt(double longitud,double latitud,double altura){
        super(longitud,latitud);
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString(){
        return "\nLa longitud: "+this.getLongitud()+"\nLa latitud: "+getLatitud()+"\nLa altura: "+altura;
    }

    public double distancia(GeoPuntoAlt punto){
        double disNueva = Math.pow(this.distancia(punto),2)+ Math.pow(altura - punto.altura,2);
        return Math.sqrt(disNueva);

    }
}
