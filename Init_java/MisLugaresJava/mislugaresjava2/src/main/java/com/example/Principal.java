package com.example;


/**
 * Created by jafamo on 04/04/15.
 */
public class Principal {

    public static void main(String[] main) {
        /*Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,TipoLugar.EDUCACION,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        System.out.println("Lugar " + lugar.toString());*/

        for(Lugar l : Lugares.vectorLugares) {
            System.out.println(l);
        }



    }

}
