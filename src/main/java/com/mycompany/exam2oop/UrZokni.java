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
    public String azonosito;
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        this.azonosito = azonosito; // this.azonosito szukseges a helyes adattarolashoz
        this.tisztasagPont = tisztasagPont;
    }
        
    public void mosas(int pluszPont) {
        tisztasagPont += pluszPont;
    }
        
    public int getTisztasagPont() {
        return tisztasagPont;
    }
    public String cimke() {
        return azonosito + ": " + tisztasagPont;
    }
}