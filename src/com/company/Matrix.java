package com.company;

public class Matrix {
    public static void main(String[] args) {
        generateIdentityMatrix(7);

    }
    public static double[][] generateIdentityMatrix(int size){
        double [][] tabelle = new double [4][3];
        for(int zeile=0; zeile <tabelle.length; ++zeile){
            for (int spalte=0; spalte<tabelle[zeile].length; ++spalte) {
                if(zeile==spalte){
                    System.out.print(tabelle[zeile][spalte] =1);
                    System.out.println(" ");
                   // System.out.println(java.util.Arrays.toString(tabelle [zeile][spalte]) );
                }

                else{
                    tabelle[zeile][spalte] =0;
                    System.out.print( tabelle[zeile][spalte] =0);
                }
            }

        }
        return tabelle;
    }
}



//alle weten sollen auf die zahl 7 gesetzen werden!
//int [][] tabelle = new int [4][3];
       // for(int zeile=0; zeile <tabelle.length; ++zeile){
        //das ist schleife fur undere spalten
        //for (int spalete=0; spalte<tabelle[zeile].length; ++spalete){ //das ist nur Hilfe dam schreibe ich meine Aufbage
       // tabelle[zeile][spalete]= 42;  so ausgeben
   //system.out.println(Arra.) //oder so..... za svaki red moram ponovo, koristecu "zeile"kao index
//
      //  }