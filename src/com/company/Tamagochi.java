package com.company;

public class Tamagochi {
    int x;
    int y;
    int futterstand;


    public void futtern(int f){
        futterstand=futterstand+f;
        //f ist variable für zusatzliche punke fur essen
    }


    public void bewegung(String richtung, int schritte) {
  while(futterstand>0 && schritte>0){
      if(richtung.equals("oben")){
          ++y;
      }
      else if(richtung.equals("unten")){
          --y;
      }
      else if(richtung.equals("links")){
          --x;
      }
      else if (richtung.equals("rechts")){
          ++x;
      }
      --schritte;
      --futterstand;
  }



    }




     }

