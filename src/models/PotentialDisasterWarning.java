/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Bonifacio Ronald
 */
public class PotentialDisasterWarning {
    
    public String country;
    public String city;
    public String disasterType;
    public String severity; //Low, medium, high, very high
    public String likeliness; //Unlikely, likely, very likely
    
    public PotentialDisasterWarning(String initCountry, String initCity, String initDisasterType, String initSeverity, String initLikeliness) {
    
        country = initCountry;
        city = initCity;
        disasterType = initDisasterType;
        severity = initSeverity;
        likeliness = initLikeliness;
    }
}
