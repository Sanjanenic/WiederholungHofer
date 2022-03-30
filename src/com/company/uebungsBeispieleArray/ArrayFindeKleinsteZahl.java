package com.company.uebungsBeispieleArray;

import java.util.Arrays;

public class ArrayFindeKleinsteZahl {

    public static void main(String[] args) {

//pozvati metodu koja vraca niz intova
        int niz[]={20,78,54,80,8,9};
        System.out.println(findeKleinsteZahl(niz));

//pozvati metodu koja racuna sumu kontr adijagonale u duplom array

        int [][] dupliNiz={{1,2,3,4},{5,6,7,8}, {9,1,2,3},{4,5,6,7}};
        System.out.println(summeGegendiagonale(dupliNiz));

//pozvati metodu koja racuna prosjek u svakoj liniji duplog array i vraca jednodimenzionalni array
        float[][] x ={{10,20,30},
                      {3,5,7},
                     {11,12,20}} ;
        System.out.println(Arrays.toString(mittelwertBerechnen(x)));

//pozvati metodu koja vraca array napravljen od zajednickih elemenata dva druga arrays
        //i odredjuje koji array od dva prametra je kraci pa takvu duzinu daje arrayju koji vraca
 String namen1[]={"Lara","Sara","Lisa","Liv","Iv" };
 String namen2[]={"Julia","Sara","Lisa", "Liv","Iva","Mira"};
        System.out.println(Arrays.toString(luckyLooser(namen1,namen2)));

    }


//    ) Erstellen Sie eine Methode findeKleinsteZahl die ein int Array als Parameter erhält und den Index
//    der kleinen Zahl als Rückgabewert zurückliefert

    public static int findeKleinsteZahl(int niz[]){

    int kleinsteZahl=niz[0];
    // kleinsteZahl je pomocna varijabla kojom racunam, na poceku je setujem za prvi broj u nizu
    int indexKleinsteZahl=0;
    //pomocna varijabla za racunanje indexa

        for(int i=0; i< niz.length; i++){
            if(kleinsteZahl> niz[i]){  //ova for if kombinacija sluzi za naci najmanji broj u nizu, za najveci samo obrunti znak kleinsteZahl<niz[i] bi bilo
                kleinsteZahl=niz[i];
                indexKleinsteZahl=i;
            }
        }
        return indexKleinsteZahl;
    }
 //
//) Die Methode summeGegendiagonale soll die Summe aller Elemente auf der Gegendiagonale eines
//zweidimensionalen int Arrays (->Parameter) berechnen und als Rückgabewert zurückliefern.
//Bsp Größe 4
// 1 2 3 4 dann sind die Elemente 1 2 3 X
// 5 6 7 8 auf der Gegendiagonale 5 6 X 8
// 9 1 2 3 mit X markiert         9 X 2 3
// 4 5 6 7 X 5 6 7

    public static int summeGegendiagonale(int matrix [][]){
        int sum =0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){

                if(i==0 && j==i+3){
                    sum=sum+matrix[0][3];
                }
                if(i==1 && j==i+1){
                    sum=sum+matrix[1][2];
                }
                if(i==2 && j==i-1) {
                    sum = sum + matrix[2][1];
                }
                if(i==3 && j==i-3) {
                    sum = sum + matrix[3][0];
                }
            }
        }

       return sum;
    }
  //Die Methode mittelwerte erhält als Parameter ein zweidimensionales float Array. (-> Parameter).
    //Für jede Zeile wird der Mittelwert berechnet und in einem neuen Array gespeichert -> dieses Array
    //soll als Rückgabewert zurückgeliefert werden.
    //Den arithmetische Mittelwert erhält man wenn man die aufsummierten Werte durch die Anzahl der
    //Elemente dividiert.

public static float[] mittelwertBerechnen (float [][] niz) {


    float mittelwertArray[] = new float[niz.length]; //pomocni array u koji cu upisati moje srednje vrijednosti za svaku liniju duplog array

       float average=0.0f;
    for (int i = 0; i < niz.length; i++) {
        float sumPerline = 0.0f;
         average = 0.0f;

        for (int j = 0; j < niz[i].length; j++) {

            if (i == 0) {
                sumPerline = (sumPerline + niz[i][j]);
                average = sumPerline / niz.length;

            }
            if(i==1){
                sumPerline = (sumPerline + niz[i][j]);
                average = sumPerline / niz.length;
            }
            if(i==2){
                sumPerline = (sumPerline + niz[i][j]);
                average = sumPerline / niz.length;
            }

mittelwertArray[i]=average; //ova linija upisuje u niz novi i mora biti u vanjskoj for ali van unutrasnje
        }

    }
    return mittelwertArray; //ovjde samo ime array mora funkcionisati
}

//Erstellen Sie eine Methode luckyLooser die zwei Arrays mit Namen als Parameter erhält. Im ersten
//Array sind all jene Personen die im ersten Gewinnspiel nichts gewonnen haben und im zweiten Array
//all jene Namen die beim zweiten Gewinnspiel nichts gewonnen haben. Alle jene die weder im ersten
//noch im zweiten Gewinnspiel etwas gewonnen haben erhalten einen Trostpreis. Der Rückgabewert
//soll ein Array mit den Namen der Trostpreis GewinnerInnen sein. (Das Array soll so lang sein wie der
//Größere der beiden Parameter)

    public static String[]luckyLooser (String []namen1, String[]namen2){
        int indexKurzer=0;  //pomocna varijabla za odredjivanje koji je niz kraci
        if(namen1.length<namen2.length){  //if petlja koja poredi duzinu dva niza i upisuje u varijablu kraci
            indexKurzer=namen1.length;
        }
        else if(namen1.length>namen2.length){
            indexKurzer=namen2.length;
        }
     String [] trostpreisGewinnerInnen= new String [indexKurzer];
    String hilfe =" ";


     for (int i=0; i< namen1.length;i++){
         for(int i2=0; i2<namen2.length; i2++) {
             if (namen1[i] == namen2[i2]){
                 hilfe= namen1[i];
                 trostpreisGewinnerInnen[i]=hilfe;
             }
         }
     }

     return trostpreisGewinnerInnen;
    }

//) Als Mobilfunkbetreiber sind Sie daran interessiert wie viele neue Smartphones in einer Zeitperiode
//verkauft werden. Erstellen Sie die Methode smartphoneSales - Als Parameter erhalten Sie ein
//zweidimensionales Array, wobei jede Zeile so aufgebaut ist: erste Zahl ist eine ganzzahlige ID die für
//ein Handymodell steht, zweite Zahl die Anzahl verkauften Telefone mit der ID
//1, 50 (Smartphone mit Nummer 1, 50 Stück)
//2, 40
//1, 60
//Sie sollen diese Daten zusammenfassen und ein zwei dimensionales Array zurückliefern, welches die
//Verkaufszahlen für jedes Handy aggregiert. Also beispielsweise
//[[1, 110],
//[2, 40]]
//Einfache Version: Nehmen Sie an es gibt maximal 10 unterschiedliche Geräte.
//Erweiterte Version: Berechnen Sie zuerst wie viele unterschiedliche Geräte es gibt. (Achtung knifflig)

    public static int [][]smartphoneSales(int [][]verkauftenTelefone){
    int[][] verkaufsFurJederHandy=new int [][];

    for(int i =0; i< verkauftenTelefone.length; i++){
        for(int j=0;j< verkauftenTelefone[i].length; j++){

        }
    }

        return verkaufsFurJederHandy;

    }

}

