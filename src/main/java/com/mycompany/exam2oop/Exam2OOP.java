/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam2oop;

/**
 *
 * @author hunorszilvasi
 */
public class Exam2OOP {

    public static void main(String[] args) {
        UrZokni z = new TeleportalosUrZokni("ZOKNI-42", 4, "Andromeda"); // inherited version
        z.mosas(6);
        System.out.println(z.cimke());
        
        UrZokni z2 = new UrZokni("ZOKNI-1", 4); // default version
        z2.mosas(5);
        System.out.println(z2.cimke());
        
        // #5 exercise
        int[] sorszamok = {4, 1, 2, 2, 0, -5};
        System.out.println(elsoHianyzoZokni(sorszamok));
        System.out.println(elsoHianyzoZokni(new int[] {1, 2, 3}));
        
        int[] sorszamok2 = {6, 1, 1, 6, -2, -5};
        System.out.println(elsoHianyzoZokni(sorszamok2));
        
        int[] sorszamok3 = {};
        System.out.println(elsoHianyzoZokni(sorszamok3));
        
    }
    
    public static int elsoHianyzoZokni(int[] sorszamok){
        int szam = 1; // starting value for UrZokni
        while(true){
            boolean found = false;
            // searching for the lowest missing number
            for(int i = 0; i< sorszamok.length; i++){
                if(sorszamok[i] == szam){ // no missing number (UrZokni), means skipping
                    found = true;
                    break;
                }
            }
            // missing number (UrZokni) found 
            if (!found){ 
                return szam;
            }
            szam++;
        }
    }
}
