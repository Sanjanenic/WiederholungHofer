package com.company;

public class NUmberTest {
    public static void main(String[] args) {
        //Wie komme ich zu meiner Jahrzeht eines altes

        //25   ---> 2; 73 -> 7
        int age= 25;
        int zehnerStelle = age/10;
        System.out.println(zehnerStelle);

        //wie komme ich zu zehler stelle in einer zahl - also bei 137 ->3

        //zuerst durch 10 damit wir 7 verschwinden lassen- und dann modulo 10 für die aktuelll letze stelle
        int zehnerstelle = (137/10) %10;
        System.out.println(zehnerstelle);

    }
}
