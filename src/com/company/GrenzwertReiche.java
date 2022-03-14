package com.company;

public class GrenzwertReiche {
    public static void main(String[] args) {
        int n =0;
        double current= 0.0;
        double previous= 0.0;

        while (true){
                                             //ovako se moze sa uslovom true pisati samo ako hocu beskonacnu petlju koja se prekida samo sa return ili break
            current+=1/Math.pow(2,n);        //Math je klasa sa matematickim formulama a ova konkrentna .pow je za potenciranje
            if(current-previous<0.0001){
                System.out.println(current);
                System.out.println(n);
                return;
            }

            previous=current;             //ovako ide dalje kroz niz pa trenutna vrijednost postahje predhodna
                    n++;
        }
    }
}
