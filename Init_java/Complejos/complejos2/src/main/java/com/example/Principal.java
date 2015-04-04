package com.example;

/**
 * Created by jafamo on 04/04/15.
 */
public class Principal {

        public static void main(String[] main) {
            ComplejoAmpliado z, w;
            z = new ComplejoAmpliado(-1.5, 3.0);
            w = new ComplejoAmpliado(-1.2, 2.4);
            z.suma(w);
            System.out.println("Complejo: " + z.toString());
        }
}
