package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayTest2 {
    public static void main(String[] args) {

        String[]smartphoneNamen={"SamsungA 51", "iPhone 13","Huawei 15","Nokia 3210","Xiaomi 7"};

        //eine zeile steht für inen smarphone
        //jede spalte in der zeile fur verkaufte in quartalen: f, sommer, h, winter

        int [][]smartphoneVerkaufZahl = {
                {2000,3900,4000,1000},     //sa prvom for petljom idem vertikalno a drugom horizontalno
                {2200,3001,4000,1000},
                {2000,3000,4900,1000},
                {2000,3000,4000,1090},
                {2000,3800,4600,1000}};

        for(int  s =0; s<smartphoneNamen.length; ++s){
            System.out.println(smartphoneNamen[s]);
        }
        //ovako bi moglo sa for each petljom,
        // recht vom : steht das arrey (odar so was was mehrere daten hat drinnen
        //links daneben meine laufvariable die den typ des inhaltes
        //for (String smartpone : smartphoneNamen){
          //  System.out.println(smartpone);
        //}

//alle smartphone auszahl inclusive Namen ausgeben , ispisati matricu i dodati ime telefona
        for (int i =0; i<smartphoneVerkaufZahl.length; i++){
            System.out.println(smartphoneNamen[i]);//ova linija sluzi za printanje imena iz prvog, jednodimenzionalnog niza
            //ove dvije petlje su za isprintati matricu(dvodimenzionalni array), uvijek funkcionise
            for(int j=0; j<smartphoneVerkaufZahl[i].length; j++){
                System.out.print(smartphoneVerkaufZahl[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, 5));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, -1));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufZahl, 1));

        System.out.println(erfolgreistesSmartphoneQuartal(smartphoneVerkaufZahl,smartphoneNamen,3));
        System.out.println(erfolgreistesSmartphoneQuartal(smartphoneVerkaufZahl,smartphoneNamen,1));


    }
    //machen wir jetzt eine Methode die soll die verkaufen Zahl eines Smartphons züruck liefern
    //zalen: unsere verkaufZahlen
    //welchesscharhone: index der angibt an welche smartphone wir interessiert in (0 basiert
    //weitere anforderung: wen ungültige wert auf smartphone angegeben wird bitte -1 züruck liefern

    public static int verkaufteAnzahlJahr(int [][]zahlen, int welchesSmartphone){  //vraca godisnju prodaju svakog smartphon


            if(welchesSmartphone <0 || welchesSmartphone >=zahlen.length){
                return -1;

            }
            int summe=0;
            //olaksan nacin:int[]nizNiza=zahlen[welchesSmartphone];   i dalje koristim ovo umjesto duplog areja sa dva indexa
            for(int q =0; q<zahlen[welchesSmartphone].length; ++q){
                //iz niza zahlen citam duzinu reda koji odgovara aktuelnom indexu

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
        int najveciBroj=zahlen[0][quartalNr]; //pomocna varijabla za uporedjivanje brojeva u nizu
        int indexNajvecegBroja=0;
        //pomocna varijabla za odredjivanje indexa imena telefona koji ima najvecu prodaju u trazenom kvartalu
for(int i =0; i<zahlen.length;i++){
    int j=quartalNr;
    if(najveciBroj<zahlen[i][j]){
        najveciBroj=zahlen[i][j];
        indexNajvecegBroja=i;
        //ova if petlja sluzi za dobiti najveci broj u nizu
    }
}

       return namen[indexNajvecegBroja];
     }
}
