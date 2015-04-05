package com.example;

/**
 * Created by jafamo on 05/04/15.
 */
public enum TipoLugar {

        OTROS("Otros", 5),
        RESTAURANTE("Restaurante", 2),
        BAR("Bar", 6),
        COPAS("Copas", 0),
        ESPECTACULO("Espectáculo", 0),
        HOTEL("Hotel", 0),
        COMPRAS("Compras", 0),
        EDUCACION("Educación", 0),
        DEPORTE("Deporte", 0),
        NATURALEZA("Naturaleza", 0),
        GASOLINERA("Gasolinera", 0);

        private final String texto;
        private final int recurso;

    /**
     * @Constructor.
     * a cada tipo le asociamos un String con el nombre del tipo de lugar y un entero.
     * El entero será utilizado más adelante para indicar un recurso gráfico en Android
     * con un icono representativo del tipo.
     * @param texto
     * @param recurso
     */

        TipoLugar(String texto, int recurso) {
            this.texto = texto;
            this.recurso = recurso;
        }

        public String getTexto() { return texto; }

        public int getRecurso() { return recurso; }
    }
