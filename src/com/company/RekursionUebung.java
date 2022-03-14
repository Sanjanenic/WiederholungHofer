package com.company;

public class RekursionUebung {
    public static void main(String[] args) {
        HerunterZahlen(99,0);
        System.out.println("-------------------");
        HerunterZahlen(12,5);


    }
    public static void HerunterZahlen(int val,int stop){
        System.out.println(val);
       if(val>0 && val>stop){
           HerunterZahlen(val-1,stop);

        }
       if(val==stop){
           System.out.println("Einmalinge Ende");
       }
        System.out.println(" recursive Ende"); //Sa ovom linijom koda dobijem u konzoli Ende 8 puta za ovaj drugi poziv metode prvo de poziva ponovo i ponovo da ispise brojeve a onda ide ponovo jer nije isla do kraja ova metoda i sad printa ende svaki put

       //hat nicht mit losung zu tun, nur konfort, dass ich auch mit einen parametar anrufrn kann
//public static void HerunterZahlen (int val){
           //HerunterZahlen(99,0); ovdje nesto nije ok
        }
    }



