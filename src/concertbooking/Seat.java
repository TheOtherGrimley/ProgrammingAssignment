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
public class Seat {
    private String _seatNumber;
    private String _seatTier;
    private boolean _extra;
    private String _customerName;
    static Color sColor = null;
    
    //get a set methods for the seat details
    public String getSeatNumber(){
        return _seatNumber;
    }
    public String getSeatTier(){
        return _seatTier;
    }
    public boolean getExtra(){
        return _extra;
    }
    public String getCustomerName(){
        return _customerName;
    }
    
    public void setSeatNumber(String value){
        _seatNumber = value;
    }
    public void setSeatTier(String value){
        _seatTier = value;
    }
    public void setExtra(String value){
        if(value == "1"){
            _extra = true;
        }
        if(value == "0"){
            _extra = false;
        }
    }
    public void setCustomerName(String value){
        _customerName = value;
    }
    
    public String printExtra(){
        if(_extra == true){
            return "1";
        }
        if(_extra == false){
            return "0";
        }
        else{return null;}
    }
    //method to book the seat of the chosen button
    public void book(JButton button) {
        if (button.getBackground().equals(Color.red)) {
            unbook(button);
        } else {
            String purchaserName = JOptionPane.showInputDialog("Please enter the purchaser name:");
            if (purchaserName == null) {} 
            else if (purchaserName.equals("")) {
                invalid(button);
            } 
            else {
                success(button, purchaserName);
            }
        }
    }
//method to unbook the button selected seat
    protected void unbook(JButton button) {
        int dialogueResult = JOptionPane.showConfirmDialog(null, "Confirm unbooking of this seat?", "unbook", 2);
        if (dialogueResult == 0) {
            this.setCustomerName("");
            this.setExtra("0");
            button.setBackground(new java.awt.Color(204, 204, 204));
        }
    }

    private void invalid(JButton button) {
        JOptionPane.showMessageDialog(null, "Please enter a valid purchaser name.");
        book(button);
    }

    protected void success(JButton button, String name) {
        
    }
}
