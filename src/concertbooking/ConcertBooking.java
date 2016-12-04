/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

/**
 *
 * @author B00691355
 */
public class ConcertBooking {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Scan s = new Scan();
        ConcertUI ui = new ConcertUI(s);
        ui.setVisible(true);
    }
    
    
    
}
