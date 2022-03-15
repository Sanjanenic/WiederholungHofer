package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayTest2 {
    public static void main(String[] args) {

        String[]smartphoneNamen={"SamsungA 51", "iPhone 13","Huawei 15","Nokia 3210","Xiaomi 7"};

        //eine zeile steht für inen smarphone
        //jede spalte in der zeile fur verkaufte in quartalen: f, sommer, h, winter

        int [][]smartphoneVerkaufZahl = {{2000,3000,4000,1000},{2000,3000,4000,1000},
                   {2000,3000,4000,1000},{2000,3000,4000,1000},{2000,3000,4000,1000}};

        for(int  s =0; s<smartphoneNamen.length; ++s){
            System.out.println(smartphoneNamen[s]);
        }
        //ovako bi moglo sa for each petljom,
        // recht vom : steht das arrey (odar so was was mehrere daten hat drinnen
        //links daneben meine laufvariable die den typ des inhaltes
        //for (String smartpone : smartphoneNamen){
          //  System.out.println(smartpone);
        //}

//alle smartphone auszahl inclusive Namen ausgeben
        for(int sIndex=0; sIndex<smartphoneVerkaufZahl.length; ++ sIndex){
            System.out.println(smartphoneNamen[sIndex] + ": ");
            for(int qIndex=0; qIndex < smartphoneVerkaufZahl[sIndex].length; ++qIndex){
                System.out.print(smartphoneVerkaufZahl[sIndex][qIndex] +" ");

            }
            //Nach Ausgabe aller Quartalszahlen einen Zeienubruch bitte
            System.out.println();
        }

        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, 5));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, -1));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, 1));
    }
    //machen wir jetzt eine Methode die soll die verkaufen Zahl eines Smartphons züruck liefern
    //zalen: unsere verkaufZahlen
    //welchesscharhone: index der angibt an welche smartphone wir interessiert in (0 basiert
    //weitere anforderung: wen ungültige wert auf smartphone angegeben wird bitte -1 züruck liefern

    public static int verkaufteAnzahlJahr(int [][]zahlen, int welchesSmartphone){


            if(welchesSmartphone <=0 || welchesSmartphone <zahlen.length){
                return -1;

            }
            int summe=0;
            for(int q =0; q<zahlen[welchesSmartphone].length; ++q){
                summe +=zahlen[welchesSmartphone][q];
            }
        return summe;


    }
    //Die folgende Methode sollte uns den namen des Smartphones liefern, das in einem bestimmten Quartal am erfolgreichstes war
    //am erfolgreistes war
    //zahlen:unser verkaufzahlen
    //namen: unsere smartphone namen
    //quartalNr: für welches quartal soll berechnet werden (von 1 bis 4)- sonst liefert -1

     public static String erfolgreistesSmartphoneQuartal(int [][]zahlen, String[]namen, int quartalNr){


       return""; //TODO durch korrekten Code ersetzen
     }
}
