/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.ArrayList;
import java.util.List;
import models.PotentialDisasterWarning;

/**
 *
 * @author Bonifacio Ronald
 */
public class potentialDisasterWarningList {
 
    public static List<PotentialDisasterWarning> warningList = new ArrayList();
    
    public static void initializeWarningListContent() {
        warningList.removeAll(warningList);
        PotentialDisasterWarning warning1 = new PotentialDisasterWarning("Thailand", "Chao Phraya and Pa Sak River Basins", "Flooding Caused By Tropical Storm Noru", "Medium", "Likely");
        PotentialDisasterWarning warning2 = new PotentialDisasterWarning("Malaysia", "Pahang", "Rain-Caused Landslide", "Low", "Less likely");
        PotentialDisasterWarning warning3 = new PotentialDisasterWarning("Canada", "Nova Scotia, Prince Edward Island, Newfoundland and Quebec", "Flooding Caused By Hurricane Fiona", "High", "Likely");
        PotentialDisasterWarning warning4 = new PotentialDisasterWarning("Indonesia", "Northern Jakarta", "Coastal Flood Due To The Rising Of Sea Water Level", "Medium", "Very Likely");
        PotentialDisasterWarning warning5 = new PotentialDisasterWarning("Chad", "Mayo Kebbi Est, Logone Occidental, Tandjile, Moyen Chari and Mandoul", "Flooding", "Medium", "Likely");
        PotentialDisasterWarning warning6 = new PotentialDisasterWarning("United States", "California", "Wildfire Due To Incoming Heatwaves", "High", "Likely");
    
        warningList.add(warning1);
        warningList.add(warning2);
        warningList.add(warning3);
        warningList.add(warning4);
        warningList.add(warning5);
        warningList.add(warning6);
    }
}
