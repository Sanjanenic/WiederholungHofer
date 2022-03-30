package com.company;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidee";  //ovo je staticki atribut

    // es ist normale methode, nicht statische, nur mit objekt kann ich das anrufen
    public void hoppel(String wohin){
        System.out.println(name + " hoppelt "+wohin);

    }
    //In statische methoden konnen wir nur auf statische attribute zugreifen
    //java weiss bei nicht statischen attributen auf welchem objekt oder instanz wir wollen zugreifen
    public static void ausgabeSpezies (){
        System.out.println(spezies);
        //System.out.println(name); sad geht nicht weil attribute neme ist nicht static, braucht objekt
    }

}
