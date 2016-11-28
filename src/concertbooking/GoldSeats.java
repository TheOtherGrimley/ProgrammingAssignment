/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;
import java.util.Random;
import javax.swing.JOptionPane; 

/**
 *
 * @author B00691355
 */
public class GoldSeats extends SeatButton {
    
    
    
    
    public void checkBackstagePass(){
        
  boolean hasBackstagePass = false;
  Random r = new Random();
  int chance = r.nextInt(11);
  if (chance == 2)
  {
      hasBackstagePass = true;
      JOptionPane.showMessageDialog(null,"The purchaser of this seat has one a backstage pass for tonights concert.");
  }
 
  
}
    
    
}
