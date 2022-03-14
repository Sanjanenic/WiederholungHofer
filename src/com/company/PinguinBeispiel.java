package com.company;

public class PinguinBeispiel {
    public static void main(String[] args) {
        lesen();
    }

    public static void lesen(){
        System.out.println("Der Pinguin schlug die Zeiten auf, da stand: ");
        lesen();  //StackOverflowError kommt diese Error in Konsole, wir haben keine break Bedinung, kako rijesiti sa for dekrement??
    }
}
