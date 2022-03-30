package com.company;

public class TomagochiApp {
    public static void main(String[] args) {

  Tamagochi erste = new Tamagochi();
  erste.x = 6;
  erste.y=4;

  erste.futterstand=5;

        erste.bewegung("links",6); //wir hoffen das es 6 geht aber woll nur 5 sritte
        erste.futtern(5);
        erste.bewegung("links",1);
        erste.bewegung("unten",4);
        System.out.println(erste.x + " "+ erste.y);


//in console sollte 0 0 sein, das war Übung!




    }
}
