package com.mycompany.exam2oop;

/**
 *
 * @author hunorszilvasi
 */
public class UrZokni {
    private String azonosito; // private type needed for data hiding
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        if (azonosito == null || azonosito.isEmpty()) {
            throw new IllegalArgumentException("Identifier cannot be null or empty");
        }

        if (tisztasagPont < 0) {
            throw new IllegalArgumentException("Cleanliness points cannot be negative");
        }
        this.azonosito = azonosito; // this.azonosito needed for storing the data correctly
        this.tisztasagPont = tisztasagPont;
    }
        
    public void mosas(int pluszPont) {
        if(pluszPont >= 0){ // filtering negative values
            tisztasagPont += pluszPont;
        }
        else{
            throw new IllegalArgumentException(
                "Error: negative or null values not allowed");
        }
    }
        
    public int getTisztasagPont() {
        return tisztasagPont;
    }
    
    public String cimke() { // default version with "azonosito" and "tisztasagPont"
        return azonosito + ": " + tisztasagPont;
    }
    
    public String getAzonosito(){ // Getter for the "azonosito" string variable
        return azonosito;
    }
    
    public void setTisztasagPont(int tisztasagPont){ // Setter for the "tisztasagPont" int variable
        if (tisztasagPont > 0){ // filtering negative values
            this.tisztasagPont = tisztasagPont;
        }
    }
}