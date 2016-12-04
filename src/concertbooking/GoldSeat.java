/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author AdamG
 */
public class GoldSeat extends Seat{
    
    @Override
    //unbooks the seat 
    protected void unbook(JButton button){
        int dialogueResult = JOptionPane.showConfirmDialog(null, "Confirm unbooking of this seat?", "unbook", 2);
            if(dialogueResult == 0){
                    this.setCustomerName("");
                    this.setExtra("0");
                    button.setBackground(new java.awt.Color(255, 204, 0));
            }
    }
    
    @Override
    //checks if the customer has won a backstage pass
    //sets the name for the booking
    protected void success(JButton button, String name){
        Random r = new Random();
        int chance = r.nextInt(11);
        this.setCustomerName(name);
        if (chance == 2)
        {
            JOptionPane.showMessageDialog(null,"The purchaser of this seat has one a backstage pass for tonights concert.");
            this.setExtra("1");
        }
        button.setBackground(Color.red);
        JOptionPane.showMessageDialog(null,"This seat has been successfully booked by "+name);
    }
}
