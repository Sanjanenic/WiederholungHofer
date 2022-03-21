package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {
        String hansisLieblingsPizza=null;  //zeight nirgendwochin - konnen nichts damit tun weil dahinter kein string objekt stegt

        //hansisLieblingsPizza.indexOf("a");  --->

//solbald wir ein objekt zuweisen es ist kein problem geht es normal

        hansisLieblingsPizza="Margherita(mit 1,2 kleinen Ananas unter dem Käse versteckt";
        System.out.println(hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase());

        String Donau= "Donaudampfschifffahrtgeselschaft";

        System.out.println(Donau.indexOf("dampf")); //daaaampf wen ich schreibe bekomme in consoe -1, weil exisitiert nicht
    }
}
