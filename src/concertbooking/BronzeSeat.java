/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author AdamG
 */
public class BronzeSeat extends Seat{
    
    @Override
    protected void unbook(JButton button) {
        JOptionPane.showMessageDialog(null, "Bronze seating cannot be unbooked");
    }
    
    @Override
    protected void success(JButton button, String name) {
        JOptionPane.showMessageDialog(null, "This seat has been successfully booked by " + name);
        this.setCustomerName(name);
        button.setBackground(Color.red);
    }
}

