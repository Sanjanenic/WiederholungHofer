package com.company;

public class Konstante {



    public static void main(String[] args) {

        // das sind beides konstaten , - mit final konnen wir parametar und variablen
        //als solche deklariren ihnen kann man maximal 1 mal einen wert zugeweisen
        final int geburtstJahr=1970;
        final int todesJahr;


        System.out.println(geburtstJahr);
        //geburtstJahr=1998 hier kan ich nicht wert von konstaten wechseln

        //hegt nicht das unten weil noch nicht initialisiert ist
        //System.out.println(todesJahr);

        todesJahr=2222;
        System.out.println(todesJahr);

        //nur einmal kann man bei konstatnten zugeweisung machen

    }
}
