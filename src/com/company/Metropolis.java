package com.company;

public class Metropolis {
    public static void main(String[] args) {


        System.out.println(isMetropolis(true, 15000000,560 ));
        System.out.println(isMetropolis(false,48098, 370));


    }
    public static boolean isMetropolis(boolean isCapital,int inhabitants, double taxPerPersonAndMonth){
//moram provjeriti ovoaj uslov jer ne razumijem zadatak
        //Stadt gilt als Metropole, sofern
        //a) sie Hauptstadt mit mehr als 100.000 Einwohnern ist oder
        //b) mehr als 200.000 Einwohner sowie mindestens 720Mio. jährliche
        //Steuereinnahmen aufweist
        if((isCapital == true && inhabitants>= 100000) ||((inhabitants>=200000) &&(inhabitants*taxPerPersonAndMonth*12>=720000000)) ){
         //uvijek koristiti zagrade kad imamo logicke operatore, tao ce uslov sigurno biti tacan
            return true;
        }
        return false;
    }
}
