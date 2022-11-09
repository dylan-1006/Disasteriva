/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author eudyl
 */
public class Disaster {
    public static boolean initializedList = false; 
    public String type;
    public String date;
    public String location;
    public String description;
    public String imageUrl_potrait; //100x120
    public String imageUrl_landscape; //347x130
    public double donationCollection;
    public double donationGoal;
    
    public Disaster(String newDisasterType, String newDisasterDate, String newDisasterLocation, String newDisasterDescription, String newDisasterImageUrlPotrait, String newDisasterImageUrlLandscape, double newDisasterDonationCollection, double newDisasterDonationGoal) {
    
        type = newDisasterType;
        date = newDisasterDate;
        location = newDisasterLocation;
        description = newDisasterDescription;
        imageUrl_potrait = newDisasterImageUrlPotrait;
        imageUrl_landscape = newDisasterImageUrlLandscape;
        donationCollection = newDisasterDonationCollection;
        donationGoal = newDisasterDonationGoal;
    }
}
