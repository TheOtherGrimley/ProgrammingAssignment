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
        ConcertUI ui = new ConcertUI();
        ui.setVisible(true);
        
        Scan s = new Scan();
        
        // \/ \/ ignore this shit \/ \/
        /*for(int i = 0; i<90; i++){
            if (s.seatArray[i].getSeatNumber().equals("g03")){
                System.out.println(s.seatArray[i].getCustomerName());
            }
        }*/
    }
    
}
