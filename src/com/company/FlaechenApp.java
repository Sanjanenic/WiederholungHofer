package com.company;

public class FlaechenApp {
    public static void main(String[] args) {
        //Objet deklarieren
        Punkt a;
        Punkt b=new Punkt();
          // a und c sind die gleiche Punkt Objekte zigen auf gleiche

        //inizialisieren, Object erzeugen
        a=new Punkt();
        Punkt c = a;
        //a.x=12;ovako bismo mogli i dodijeliti vrijednost x ali ne radi se tako
        System.out.println(a.x + " "+ a.y);

        a.aenderePosition(1,2);
        System.out.println(a.x + " "+ a.y);  //a.x ovako pristupamo atributu x
        System.out.println(c.x + " "+ c.y);

        if (a==c){
            System.out.println("a und c zeigen aucf gleiche Punkt Instanz");
        }
    }
}
