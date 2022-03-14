package com.company;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

         int [] a1 = new int [3];
         a1 [0]= 3;
         a1 [1]= 4;
         a1 [2]= 5;
        //System.out.println(Arrays.toString(a1));

      //  a1 [0]= a1[0]+10;
      //  a1 [1]= a1[1]+5;
        //a1 [2]= a1[2]+8;
      //  System.out.println(Arrays.toString(a1));

       int [] a2 = {7,1,3};
       // System.out.print(Arrays.toString(a2));
       // a2 [0]= a2[0]*21;
        //a2 [1]= a2[1]*4;
       // a2 [2]= a2[2]*15;
        //System.out.print(Arrays.toString(a2));


        for (int z = 0; z<a1.length; ++z){
            System.out.print(a1[z]+a2[z]);
            System.out.print(" , ");

        }
        System.out.println();
        for (int z = 0; z<a1.length; ++z){
            System.out.print(a1[z]*a2[z]);
            System.out.print(" , ");
        }

//muss ich eingabe einfugen

        //


    }
}
