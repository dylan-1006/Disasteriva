/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Bonifacio Ronald
 */
public class User {
 
    public String name;
    public String location;
    public double totalDonationAmount;
    public int numberOfReport;
    public int numberOfDonation;
    
    public User(String initName, String initLocation, double initTotalDonationAmount, int initNumberOfReport, int initNumberOfDonation) {
    
        name = initName;
        location = initLocation;
        totalDonationAmount = initTotalDonationAmount;
        numberOfReport = initNumberOfReport;
        numberOfDonation = initNumberOfDonation;
   
    }
}
