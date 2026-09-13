/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clock_widget;
import java.util.TimeZone;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author everett-miller
 */
public class Clock_Widget {

    public static void main(String[] args) {
        //1. Create the frame.
        JFrame frame = new JFrame("Clock");
        
        frame.setPreferredSize(new Dimension(800, 600));        
        

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
        
        
        home digital_clock_widget = new home();
        
        digital_clock_widget.EST_Clock();
        
    }
}
