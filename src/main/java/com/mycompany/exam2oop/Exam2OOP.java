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
        System.out.println(z2.cimke());
    }
}
