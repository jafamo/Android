package com.example;

/**
 * Created by jafamo on 04/04/15.
 */
public class Principal {

        public static void main(String[] main) {
            /**
             *ComplejoAmpliado z, w;
             z = new ComplejoAmpliado(-1.5, 3.0);
             w = new ComplejoAmpliado(-1.2, 2.4);
             z.suma(w);
             System.out.println("Complejo: " + z.toString());
             *
             *
             */

            //ejercicio
            Complejo lista[] = new Complejo[4];
            lista[0] = new Complejo(-1.5, 3.0);
            lista[1] = new Complejo(-1.2, -3.0);
            lista[2] = new ComplejoAmpliado(-1.5, 3.0);
            lista[3] = new ComplejoAmpliado(-1.2, 0);
            for(int i = 0; i < lista.length; i++) {
                System.out.println("Complejo: " + lista[i]);
                if(lista[i] instanceof ComplejoAmpliado){
                    System.out.println("  esReal=" + ((ComplejoAmpliado) lista[i]).esReal());
                }
            }

        }
}
