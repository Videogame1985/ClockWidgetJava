/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clock_widget;
import java.awt.BorderLayout;
import java.util.TimeZone;
import java.awt.Dimension;
import java.awt.Font;
import java.time.ZonedDateTime;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.SwingConstants;

/**
 *
 * @author everett-miller
 */
public class Clock_Widget {

    public static void main(String[] args) {
        //1. Create the frame.
        
        Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
        
        int x = mouseLocation.x;
        int y = mouseLocation.y;
        
        JFrame frame = new JFrame("Clock");
        
        frame.setPreferredSize(new Dimension(800, 600));        
        

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
        
        home digital_clock_widget = new home();
        
        frame.setLocationRelativeTo(null);
 
        JLabel label = new JLabel("Centered Text",SwingConstants.CENTER);
        while(true){
            label.setText(digital_clock_widget.EST_Clock());
            
            label.setFont(new Font("Times New Roman", Font.PLAIN, 24));

            frame.add(label);

            frame.setVisible(true);
        }
    }


}
