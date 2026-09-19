/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




package com.mycompany.clock_widget;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 *
 * @author everett-miller
 */
public class home {
    //
    public String EST_Clock(){
         ZoneId tz = ZoneId.of("America/New_York");
         ZonedDateTime current_time = ZonedDateTime.now(tz);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
         String now = current_time.format(formatter);
         return now;
    } 
}
