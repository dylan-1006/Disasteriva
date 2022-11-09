/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package data;

import models.Faq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bonifacio Ronald
 */
public class faqTipsList {

    public static List<Faq> faqTipsInitList = new ArrayList<Faq>();

    public static void initializeFaqTipsList(String args[]) {
        Faq Question1 = new Faq("What to Do During A Flood Warning ","1. Gather emergency supplies, including non-perishable food and water. Store at least a 3-day supply.\n2. Listen to the radio or television or your Emergency Alerting Station for information.\n3. Bring in outdoor items (lawn furniture, grills, trash cans) or tie them down securely.\n4. Be prepared to evacuate.");
        Faq Question2 = new Faq("Do's And Don'ts In Flood","DO's\n1. Prepare an emergency kit and communication plan for the members of your family.\n2. Switch off electrical and gas appliances, and turn off services off at the mains.\n3. Listen to the radio or television for updates and information/\n\nDon'ts\n1. Don’t walk through flowing water.\n2. Don’t drive through a flooded area.\n3. Never use any electrical equipment while standing on wet floors.");
        Faq Question3 = new Faq("Important Emergency Kit Items","1. Water\n2. Food\n3. First aid kit\n4. Medications\n5. Battery-powered or hand crank radio and a NOAA Weather Radio with tone alert\n6. Copies of personal documents\n7. Cell phone with chargers\n8. Emergency blanket");
        Faq Question4 = new Faq("Landslide Warning Signs","1. Springs, seeps, or saturated ground in areas that have not typically been wet before.\n2. New cracks or unusual bulges in the ground, street pavements or sidewalks.\n3. Sudden decrease in creek water levels though rain is still falling or just recently stopped.\n4. Tilting or cracking of concrete floors and foundations.");
        Faq Question5 = new Faq("Areas Prone to Landslide","1. Areas where wildfires or human modification of the land have destroyed vegetation\n2. Steep slopes and areas at the bottom of slopes or canyons\n3. Areas where surface runoff is directed\n4. Channels along a stream or river"); 
        Faq Question6 = new Faq("What to Do During A Landslide Warning","1. Stay alert and awake. Many debris-flow fatalities occur when people are sleeping. Listen to a NOAA Weather Radio or portable, battery-powered radio or television for warnings of intense rainfall.\n2. Listen for any unusual sounds that might indicate moving debris, such as trees cracking or boulders knocking together\n3. Be especially alert when driving. Bridges may be washed out, and culverts overtopped. Do not cross flooding streams");
        Faq Question7 = new Faq("What to Do During An Earthquake","Stay calm! If you're indoors, stay inside. If you're outside, stay outside. If you're indoors, stand against a wall near the center of the building, stand in a doorway, or crawl under heavy furniture (a desk or table). Stay away from windows and outside doors.If you're outdoors, stay in the open away from power lines or anything that might fall. Stay away from buildings (stuff might fall off the building or the building could fall on you).");
        Faq Question8 = new Faq("What Causes These Natural Disasters","1. Natural Phenomenon\n2. Deforestation\n3. Pollution\n4. Global Warming\n5. Soil Erosion");
        Faq Question9 = new Faq("How Can We Help After A Disaster ","When disaster strikes, people everywhere want to help those in need. Financial aid is an immediate need of disaster victims. Financial contributions should be made through a recognized voluntary organization to help ensure that contributions are put to their intended use. Before donating food or dothing, wait for instructions from local officials. Local emergency services officials also coordinate volunteer efforts for helping in disasters. Organizations and community groups wishing to donate items should first contact local officials to find out what is needed and where to send it.");

        faqTipsInitList.add(Question1);
        faqTipsInitList.add(Question2);
        faqTipsInitList.add(Question3);
        faqTipsInitList.add(Question4);
        faqTipsInitList.add(Question5);
        faqTipsInitList.add(Question6);
        faqTipsInitList.add(Question7);
        faqTipsInitList.add(Question8);
        faqTipsInitList.add(Question9);
    }
}
