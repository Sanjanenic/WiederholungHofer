package com.company;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

         int [] a1 = new int [3];
         a1 [0]= 3;
         a1 [1]= 4;
         a1 [2]= 5;


       int [] a2 = {7,1,3};



        for (int z = 0; z<a1.length; ++z){
            System.out.print(a1[z]+a2[z]);  //z sluzi da iscita iz oba array
            System.out.print(" , ");

        }
        System.out.println();
        for (int z = 0; z<a1.length; ++z){
            System.out.print(a1[z]*a2[z]);
            System.out.print(" , ");
        }

//muss ich eingabe einfugen

        //Erstellen Sie die Klasse ArrayDemo mit main-Methode(). Erzeugen
        //Sie zwei int Arrays mit jeweils einer Länge von 3 und initialisieren
        //Sie diese mit beliebigen Ganzzahlen. Geben Sie danach auf der
        //Konsole die elementweise Addition sowie Multiplikation aus.
        //Bsp.
        //Array1 => [3,4,5]
        //Array2 => [7,1,3]
        //Ausgabe:
        //+ 10,5,8
        //* 21,4,15


    }
}
