/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




package com.mycompany.clock_widget;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/**
 *
 * @author everett-miller
 */
public class home {
    //
    public static void EST_Clock(){
         ZoneId tz = ZoneId.of("America/New_York");
         ZonedDateTime current_time = ZonedDateTime.now(tz);
         System.out.println(current_time);
    } 
    
    //Just a test
    public static void Hello(){
        System.out.println();
    }
}
