/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam2oop;

/**
 *
 * @author hunorszilvasi
 */
public class UrZokni {
    private String azonosito; // private type needed for data hiding
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        this.azonosito = azonosito; // this.azonosito needed for storing the data correctly
        this.tisztasagPont = tisztasagPont;
    }
        
    public void mosas(int pluszPont) {
        if(pluszPont >= 0){ // filtering negative numbers
            tisztasagPont += pluszPont;
        }
        else{
            throw new IllegalArgumentException(
                "Error: negative or null numbers not allowed");
        }
    }
        
    public int getTisztasagPont() {
        return tisztasagPont;
    }
    
    public String cimke() {
        return azonosito + ": " + tisztasagPont;
    }
    
    public String getAzonosito(){ // Getter for the "azonosito" string variable
        return azonosito;
    }
    
    public void setTisztasagPont(int tisztasagPont){ // Setter for the "tisztasagPont" int variable
        if (tisztasagPont > 0){ // filtering negative numbers
            this.tisztasagPont = tisztasagPont;
        }
    }
}