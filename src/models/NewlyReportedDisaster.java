/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Bonifacio Ronald
 */
public class NewlyReportedDisaster {
    
    public String reporterName;
    public String type;
    public String location;
    public String date;
    public String description;
    
    public NewlyReportedDisaster(String initReporterName, String initType, String initLocation, String initDate, String initDescription) {
    
        reporterName = initReporterName;
        type = initType;
        location = initLocation;
        date = initDate;
        description = initDescription;
    }
}
