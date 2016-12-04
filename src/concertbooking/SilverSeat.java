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
public class SilverSeat extends Seat {

    @Override
    //sets the customer name and the extra (programme) in the seat array
    protected void success(JButton button, String name) {
        JOptionPane.showMessageDialog(null, "This seat has been successfully booked by " + name);
        for (int i = 0; i < 90; i++) {
            if (getSeatNumber().equals(button.getText())) {
                setCustomerName(name);
                setExtra("1");
            }
        }
        JOptionPane.showMessageDialog(null, "This customer is entitled to a free program for the concert");
        button.setBackground(Color.red);
    }
}
