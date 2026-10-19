/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam2oop;

/**
 *
 * @author hunorszilvasi
 */
public class TeleportalosUrZokni extends UrZokni {
    private String galaxis;
    
    public TeleportalosUrZokni(String azonosito, int tisztasagPont, String galaxis) {
        super(azonosito, tisztasagPont);
        this.galaxis = galaxis;
    }
    
    // inherited version for "azonosito", 
    // "tisztasagPont" and the special "galaxis" variable
    @Override
    public String cimke() {
        // using a getter for the "azonosito" variable
        return "Teleport zokni: " + getAzonosito() + " " + getTisztasagPont() + " " + galaxis;
    }
}
