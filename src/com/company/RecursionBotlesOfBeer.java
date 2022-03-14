package com.company;

public class RecursionBotlesOfBeer {
    public static void main(String[] args) {
       CountDownBeer(20,0);
    }

    public static void CountDownBeer(int start,int stop){
        if((start<=99) && (start>stop)){
   CountDownBeer(start-1, stop);
            System.out.println(start+"battles of Beer");   //broji u obrnutom smjeru, ????



        }
    }
}
