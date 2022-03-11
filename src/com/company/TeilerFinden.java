package com.company;

public class TeilerFinden {
    public static void main(String[] args) {
    isTeilbar(24);
        System.out.println("-------------------");
    isTeilbar(50);
    }

    public static void isTeilbar(int zahl){ //void je zato sto
        int t=2;
        while(t<zahl){

            if(zahl%t==0){
                System.out.println(t); //ako stavim ovdje return izace it while petlje i ispisati samo prvi broj
            }

            t++;
        }

    }

}

//Erstellen Sie die Klasse TeilerFinden mit main-Methode(). Schreiben
//Sie unter Zuhilfenahme von Bedingungen und Schleifen ein Programm,
//das alle Teiler Ti einer Ganzzahl Z auf der Konsole ausgibt.