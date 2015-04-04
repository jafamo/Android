package com.example;

/**
 * Created by jafamo on 04/04/15.
 */
public class Principal {

    public static void main(String args[]){

        GeoPunto x,z;
        x = new GeoPunto(100,500);
        z = new GeoPunto(200,600);


        System.out.println(x.distancia(z));
        System.out.println("El valor de x = "+x.toString());
        System.out.println("El valor de z = "+z.toString());



    }
}
