package com.company;

public class HaeschenApp {
    public static void main(String[] args) {

        //statisches attriebut/methode j kann auc ohne Objektinstanz verwenden werden mit name der Classe
        System.out.println(Haeschen.spezies);
        Haeschen rogger= new Haeschen();

        //attribut zugreifen mittels instanz name
        rogger.name="Rogger Rabbit";
        rogger.farbe="weiss";
        System.out.println(rogger.name + " "+ rogger.farbe);

        Haeschen bugs= null;//nur zu zeigen dass auch speter instanz erzeugt werden kann
        //irgendwann spater

        bugs=new Haeschen();
        bugs.name="bugs Bunny";
        bugs.farbe= "grau";

        //tersten unsere hoppel methode hier:
        //Haeschen....geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

        //Character.toChars()   //zB das ist nur ein Beispiel von statische Methode, brauchen wir keine aber hier

        //aufruf statische Methode, kann nur aucf statische sachen zugreifen
        Haeschen.ausgabeSpezies();




    }
}
