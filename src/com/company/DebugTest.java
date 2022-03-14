package com.company;

public class DebugTest {
    public static void main(String[] args) {
        hansiSingt("1000 Traume");
        int x =5;   //debug: muss man rote Punkt stellen und dan auf Kefer program ran lassen, leuft bis rote punkt
        System.out.println(x+ " Punkte");
        hansiSingt("Nur du allein");
        hansiSingtViel("Wo bist du", 5);
    }
    public static void hansiSingt(String titel){
        System.out.println("Hansi singt "+titel);
        //text ausgeben wenn steht muss man sout machen, wenn berechnen und zuruck liefern gefragt ist muss man mit return arbeiten

    }
    public static void hansiSingtViel(String titel, int wieOft) {

       for(int i =0; i<wieOft;++i) {
           System.out.println("Hansi singt " + titel);
       }
    }
}
