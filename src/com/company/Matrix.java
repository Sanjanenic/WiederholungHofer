package com.company;

public class Matrix {
    public static void main(String[] args) {
        int [][] ergebnisReturn=generateIdentityMatrix(5,7);
        printMatrix(ergebnisReturn);

    }
    public static int [][] generateIdentityMatrix(int sizeX, int sizeY){   //ovim sam napravila matricu
         int [][] tabelle = new int [sizeX][sizeY];
        for(int zeile=0; zeile <tabelle.length; ++zeile){
            for (int spalte=0; spalte<tabelle[zeile].length; ++spalte) {
                if(zeile==spalte){
                    tabelle[zeile][spalte] =1; //dodijelila vrijednost po dijagonali

                }

                else{
                    tabelle[zeile][spalte] =0;

                }
            }

        }
        return tabelle;

    }
    public static void printMatrix(int[][] matrix){
        for(int zeile=0; zeile <matrix.length; ++zeile) {

            for (int spalte = 0; spalte < matrix[zeile].length; ++spalte) {

                System.out.print(matrix[zeile][spalte]+"\t");

            }
            System.out.println();
        }
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